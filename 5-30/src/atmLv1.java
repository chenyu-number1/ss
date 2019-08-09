import java.util.Scanner;

public class atmLv1 {

	public static int loginIndex = -1; // 登陆成功的数据在二维数组中的哪一个

	public static String[][] array = {
			{ "小白", "123", "5000" }, 
			{ "小黑", "123", "5000" },
			{ "小美", "123", "5000" },
			null,
			null, 
			null, 
			null };

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("=====欢迎使用蜗牛ATM无限制存取款系统=====");
		System.out.println("===请输入您的选项：1.登陆 2.注册 3.退出===");
		System.out.println("====================================");

		int input = sc.nextInt();
		switch (input) {
		case 1:// 登陆
			boolean loginF = login(array);
			if (loginF) { // 登陆成功
				subMenu(); // 成功后的操作
			} else {
				main(null);
			}
			break;

		case 2:// 注册
			boolean b = regedit(array);
			if (b) {
				System.out.println("==注册成功请登录==");
				// 登陆
				loginF = login(array);
				if (loginF) { // 登陆成功
					subMenu(); // 成功后的操作
				} else {
					main(null);
				}
			} else {
				System.out.println("注册失败");
				main(null);
			}
			break;

		case 3:// 退出
			System.exit(0);
			break;

		default:
			break;
		}

	}

	
	/** 注册 */

	public static boolean regedit(String[][] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				System.out.println("请输入注册账号");
				String name = sc.next();
				System.out.println("请输入注册密码");
				String psw = sc.next();

				array[i] = new String[] { name, psw,"0" };
				return true;
			}
		}
		return false;
	}

	
	/** 登陆 */
	public static boolean login(String[][] array) {
		boolean f = false;

		System.out.println("请输入登陆账号");
		String name = sc.next();
		System.out.println("请输入登陆密码");
		String psw = sc.next();

		for (int i = 0; i < array.length; i++) { // 取出每条进行对比
			if (array[i] != null) {
				if (array[i][0].equals(name) && array[i][1].equals(psw)) {
					System.out.println("登陆成功");
					f = true;
					loginIndex = i; // 记录登陆成功的位置
					return f;
				}
			}
		}
		System.out.println("账号或密码错误"); // 当循环所有之后，没有对比成功
		return false;
	}

	
	/** 登陆成功的菜单 */
	public static void subMenu() {
		while (true) {

			System.out.println("=========================请输入选项============ ===============");
			System.out.println("================1.查询余额2.转账3.取款 4.存款 5.返回主菜单===================");

			int input = sc.nextInt();
			switch (input) {
			case 1://查询
				System.out.println(array[loginIndex][0]+"的余額位："+array[loginIndex][2]);
				break;
			case 2:
				System.out.println("转账");
				transfer();
				break;
			case 3:
				System.out.println("亲输入取款金额");
				int qmoney=sc.nextInt();
				
				break;
			case 4:
				System.out.println("请输入存款金额");
				int money=sc.nextInt();
				
				String omoney=array[loginIndex][2];		//获取原有金额
				int oldmoney=Integer .parseInt(omoney);	//将string类型money转为int类型money
				
				array[loginIndex][2]=(money+oldmoney)+"";		//""将金额转为字符串赋值给数组
				break;
			case 5:
				main(null);
				return;	
				
			default:
				break;
			}
		}
	}

	
	/**转账*/
	public static void transfer() {
		//1.输入对方账号
		//2查询账号是否存在
		//3.存在时，输入金额应该小于你账号中的余额
		//4.金额正确  ，对方加，你减
		
		System.out.println("请输入对方账号");
		String name=sc.next();
		
		int i=0;
		for(;i<array.length;i++) {
			if(array[i]!=null) {
				if(name.equals(array[i][0])) {		//对方账号存在
					System.out.println("请输入金额");
					int m=sc.nextInt();
					
					int loginmoney=Integer.parseInt(array[loginIndex][2]);
					if(loginmoney>m) {
						array[loginIndex][2]=loginmoney-m+"";		//转账人减
						array[i][2]=Integer.parseInt(array[i][2])+m+"";		//收款人加
						System.out.println("转账成功");
						break;
					}else {
						System.out.println("您的余额为："+array[loginIndex][2]);
						break;
					}
				}
			}
		}
		if(i==array.length) {
			System.out.println("对方账号不存在");
		}
		
	}
	
	
	
	
	
	
}

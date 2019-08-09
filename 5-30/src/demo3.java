import java.util.Scanner;

public class demo3 {

	
	public static int loginIndex=-1;//登录成功的数据在二维数组中的哪一条
	public static String[][] account = { 
				{ "1", "admin", "admin", "5000", "true" }, 
				{ "2", "ly", "123456", "5000", "true" }, 
				null,
				null, null, null, null, null, null, null };
	
	public static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		

		System.out.println("==================================================");
		System.out.println("===================蜗牛ATM无限制存取款系统 ===============");
		System.out.println("================请输入选项1.登录 \t2.注册\t3.退出 ===============");
		System.out.println("==================================================");

		int opNumber = sc.nextInt();
		switch (opNumber) {
		case 1:
			// 登录
			boolean longinFlag = login(account);
			if (longinFlag) {// 登录成功
				// 成功以后的操作
				subMenu();
			}else {
				main(null);
			}

			break;
		case 2:
			// 注册
			boolean f = regedit(account);
			if (f) {
				System.out.println("==注册成功请登录==");
				// 登录
				longinFlag = login(account);
				if (longinFlag) {// 登录成功
					// 成功以后的操作
					subMenu();
				}else {
					main(null);
				}
			} else {
				System.out.println("注册失败！");
				main(null);
			}

			break;
		case 3:
			// 退出
			System.exit(-1);
			break;

		default:
			break;
		}

	}

	/**
	 * 注册
	 */
	public static boolean regedit(String[][] account) {
		//Scanner sc = new Scanner(System.in);
		for (int i = 0; i < account.length; i++) {

			if (account[i] == null) {

				System.out.println("请输入注册账号");
				String lname = sc.next();

				System.out.println("请输入注册密码");
				String psw = sc.next();

				account[i] = new String[] { "002", lname, psw, "5000", "true" };
				return true;
			}
		}
		return false;

	}

	/**
	 * 登录
	 */
	public static boolean login(String[][] account) {

		Scanner sc = new Scanner(System.in);
		boolean flag = false;

		for (int j = 0; j < 3; j++) {
			System.out.println("请输入注册账号");
			String lname = sc.next();

			System.out.println("请输入注册密码");
			String psw = sc.next();

			for (int i = 0; i < account.length; i++) {//取出每天进行对比

				if (account[i] != null) {

					if (account[i][1].equals(lname) && account[i][2].equals(psw)) {
						// 登录成功
						System.out.println("登录成功");
						flag = true;
						loginIndex=i;//记录登录成的位置
						return flag;
					}
				}
			}
			
			
			//当循环所有的后都没有对比成功，才能进入到下行代码
			System.out.println("账号或密码错误");
			
			
		}

		return flag;

	}

	/**
	 * 登录成功的菜单
	 */
	public static void subMenu() {
		while(true) {
			
			
			System.out.println("=========================请输入选项============ ===============");
			System.out.println("================1.查询余额2.转账3.取款 4.存款，5返回主菜单===================");

			int opNumber = sc.nextInt();

			switch (opNumber) {
			case 1:
				
				System.out.println(account[loginIndex][1]+"的余额为"+account[loginIndex][3]);
				
				break;
			case 2:
//				System.out.println("转账");
				transfer();
				break;
			case 3:
				System.out.println("取款");
				break;
			case 4:
				//System.out.println("存款");
				System.out.println("请输入存款金额");
				int money=sc.nextInt();//要存的金额
				
				//获取到原有金额
				String oMoney=account[loginIndex][3];
				int  oldMoney=Integer.parseInt(oMoney);
				
				account[loginIndex][3]=(money+oldMoney)+"";
				
				break;
			case 5:
				main(null);
				return;

			default:
				break;
			}
		}
	}
	
	/**
	 * 转账
	 */
	public static void transfer() {
		//1.输入对方账号
		//2查询账号是否存在
		//3.存在时，输入金额应该小于你账号中的余额
		//4.金额正确  ，对方加，你减
		
		System.out.println("请输入对方账号");
		String lname=sc.next();
		
		int i=0;
		
		for(;i<account.length;i++) {
			
			if(account[i]!=null) {
				
				if(lname.equals(account[i][1])) {//对方账号存在
					//进行转账
					System.out.println("请输入金额");
					int m=sc.nextInt();
					
					//当前登录用户的账号金额进行对比
					int loginMoney=Integer.parseInt(account[loginIndex][3]);
					if(loginMoney>=m) {
						//进行转账
						account[loginIndex][3]=loginMoney-m+"";//减
						account[i][3]=Integer.parseInt(account[i][3])+m+"";
						System.out.println("转账成功");
						break;
						
					}else {
						System.out.println("您的余额为"+account[loginIndex][3]);
						break;
					}
				}
			}
		}
		
		//提示账号不存在
		if(i==account.length) {
			System.out.println("对方账号不存在");
		}
		
	}
}


	

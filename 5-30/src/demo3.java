import java.util.Scanner;

public class demo3 {

	
	public static int loginIndex=-1;//��¼�ɹ��������ڶ�ά�����е���һ��
	public static String[][] account = { 
				{ "1", "admin", "admin", "5000", "true" }, 
				{ "2", "ly", "123456", "5000", "true" }, 
				null,
				null, null, null, null, null, null, null };
	
	public static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		

		System.out.println("==================================================");
		System.out.println("===================��ţATM�����ƴ�ȡ��ϵͳ ===============");
		System.out.println("================������ѡ��1.��¼ \t2.ע��\t3.�˳� ===============");
		System.out.println("==================================================");

		int opNumber = sc.nextInt();
		switch (opNumber) {
		case 1:
			// ��¼
			boolean longinFlag = login(account);
			if (longinFlag) {// ��¼�ɹ�
				// �ɹ��Ժ�Ĳ���
				subMenu();
			}else {
				main(null);
			}

			break;
		case 2:
			// ע��
			boolean f = regedit(account);
			if (f) {
				System.out.println("==ע��ɹ����¼==");
				// ��¼
				longinFlag = login(account);
				if (longinFlag) {// ��¼�ɹ�
					// �ɹ��Ժ�Ĳ���
					subMenu();
				}else {
					main(null);
				}
			} else {
				System.out.println("ע��ʧ�ܣ�");
				main(null);
			}

			break;
		case 3:
			// �˳�
			System.exit(-1);
			break;

		default:
			break;
		}

	}

	/**
	 * ע��
	 */
	public static boolean regedit(String[][] account) {
		//Scanner sc = new Scanner(System.in);
		for (int i = 0; i < account.length; i++) {

			if (account[i] == null) {

				System.out.println("������ע���˺�");
				String lname = sc.next();

				System.out.println("������ע������");
				String psw = sc.next();

				account[i] = new String[] { "002", lname, psw, "5000", "true" };
				return true;
			}
		}
		return false;

	}

	/**
	 * ��¼
	 */
	public static boolean login(String[][] account) {

		Scanner sc = new Scanner(System.in);
		boolean flag = false;

		for (int j = 0; j < 3; j++) {
			System.out.println("������ע���˺�");
			String lname = sc.next();

			System.out.println("������ע������");
			String psw = sc.next();

			for (int i = 0; i < account.length; i++) {//ȡ��ÿ����жԱ�

				if (account[i] != null) {

					if (account[i][1].equals(lname) && account[i][2].equals(psw)) {
						// ��¼�ɹ�
						System.out.println("��¼�ɹ�");
						flag = true;
						loginIndex=i;//��¼��¼�ɵ�λ��
						return flag;
					}
				}
			}
			
			
			//��ѭ�����еĺ�û�жԱȳɹ������ܽ��뵽���д���
			System.out.println("�˺Ż��������");
			
			
		}

		return flag;

	}

	/**
	 * ��¼�ɹ��Ĳ˵�
	 */
	public static void subMenu() {
		while(true) {
			
			
			System.out.println("=========================������ѡ��============ ===============");
			System.out.println("================1.��ѯ���2.ת��3.ȡ�� 4.��5�������˵�===================");

			int opNumber = sc.nextInt();

			switch (opNumber) {
			case 1:
				
				System.out.println(account[loginIndex][1]+"�����Ϊ"+account[loginIndex][3]);
				
				break;
			case 2:
//				System.out.println("ת��");
				transfer();
				break;
			case 3:
				System.out.println("ȡ��");
				break;
			case 4:
				//System.out.println("���");
				System.out.println("����������");
				int money=sc.nextInt();//Ҫ��Ľ��
				
				//��ȡ��ԭ�н��
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
	 * ת��
	 */
	public static void transfer() {
		//1.����Է��˺�
		//2��ѯ�˺��Ƿ����
		//3.����ʱ��������Ӧ��С�����˺��е����
		//4.�����ȷ  ���Է��ӣ����
		
		System.out.println("������Է��˺�");
		String lname=sc.next();
		
		int i=0;
		
		for(;i<account.length;i++) {
			
			if(account[i]!=null) {
				
				if(lname.equals(account[i][1])) {//�Է��˺Ŵ���
					//����ת��
					System.out.println("��������");
					int m=sc.nextInt();
					
					//��ǰ��¼�û����˺Ž����жԱ�
					int loginMoney=Integer.parseInt(account[loginIndex][3]);
					if(loginMoney>=m) {
						//����ת��
						account[loginIndex][3]=loginMoney-m+"";//��
						account[i][3]=Integer.parseInt(account[i][3])+m+"";
						System.out.println("ת�˳ɹ�");
						break;
						
					}else {
						System.out.println("�������Ϊ"+account[loginIndex][3]);
						break;
					}
				}
			}
		}
		
		//��ʾ�˺Ų�����
		if(i==account.length) {
			System.out.println("�Է��˺Ų�����");
		}
		
	}
}


	

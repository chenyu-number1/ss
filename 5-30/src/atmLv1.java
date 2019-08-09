import java.util.Scanner;

public class atmLv1 {

	public static int loginIndex = -1; // ��½�ɹ��������ڶ�ά�����е���һ��

	public static String[][] array = {
			{ "С��", "123", "5000" }, 
			{ "С��", "123", "5000" },
			{ "С��", "123", "5000" },
			null,
			null, 
			null, 
			null };

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("=====��ӭʹ����ţATM�����ƴ�ȡ��ϵͳ=====");
		System.out.println("===����������ѡ�1.��½ 2.ע�� 3.�˳�===");
		System.out.println("====================================");

		int input = sc.nextInt();
		switch (input) {
		case 1:// ��½
			boolean loginF = login(array);
			if (loginF) { // ��½�ɹ�
				subMenu(); // �ɹ���Ĳ���
			} else {
				main(null);
			}
			break;

		case 2:// ע��
			boolean b = regedit(array);
			if (b) {
				System.out.println("==ע��ɹ����¼==");
				// ��½
				loginF = login(array);
				if (loginF) { // ��½�ɹ�
					subMenu(); // �ɹ���Ĳ���
				} else {
					main(null);
				}
			} else {
				System.out.println("ע��ʧ��");
				main(null);
			}
			break;

		case 3:// �˳�
			System.exit(0);
			break;

		default:
			break;
		}

	}

	
	/** ע�� */

	public static boolean regedit(String[][] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				System.out.println("������ע���˺�");
				String name = sc.next();
				System.out.println("������ע������");
				String psw = sc.next();

				array[i] = new String[] { name, psw,"0" };
				return true;
			}
		}
		return false;
	}

	
	/** ��½ */
	public static boolean login(String[][] array) {
		boolean f = false;

		System.out.println("�������½�˺�");
		String name = sc.next();
		System.out.println("�������½����");
		String psw = sc.next();

		for (int i = 0; i < array.length; i++) { // ȡ��ÿ�����жԱ�
			if (array[i] != null) {
				if (array[i][0].equals(name) && array[i][1].equals(psw)) {
					System.out.println("��½�ɹ�");
					f = true;
					loginIndex = i; // ��¼��½�ɹ���λ��
					return f;
				}
			}
		}
		System.out.println("�˺Ż��������"); // ��ѭ������֮��û�жԱȳɹ�
		return false;
	}

	
	/** ��½�ɹ��Ĳ˵� */
	public static void subMenu() {
		while (true) {

			System.out.println("=========================������ѡ��============ ===============");
			System.out.println("================1.��ѯ���2.ת��3.ȡ�� 4.��� 5.�������˵�===================");

			int input = sc.nextInt();
			switch (input) {
			case 1://��ѯ
				System.out.println(array[loginIndex][0]+"�����~λ��"+array[loginIndex][2]);
				break;
			case 2:
				System.out.println("ת��");
				transfer();
				break;
			case 3:
				System.out.println("������ȡ����");
				int qmoney=sc.nextInt();
				
				break;
			case 4:
				System.out.println("����������");
				int money=sc.nextInt();
				
				String omoney=array[loginIndex][2];		//��ȡԭ�н��
				int oldmoney=Integer .parseInt(omoney);	//��string����moneyתΪint����money
				
				array[loginIndex][2]=(money+oldmoney)+"";		//""�����תΪ�ַ�����ֵ������
				break;
			case 5:
				main(null);
				return;	
				
			default:
				break;
			}
		}
	}

	
	/**ת��*/
	public static void transfer() {
		//1.����Է��˺�
		//2��ѯ�˺��Ƿ����
		//3.����ʱ��������Ӧ��С�����˺��е����
		//4.�����ȷ  ���Է��ӣ����
		
		System.out.println("������Է��˺�");
		String name=sc.next();
		
		int i=0;
		for(;i<array.length;i++) {
			if(array[i]!=null) {
				if(name.equals(array[i][0])) {		//�Է��˺Ŵ���
					System.out.println("��������");
					int m=sc.nextInt();
					
					int loginmoney=Integer.parseInt(array[loginIndex][2]);
					if(loginmoney>m) {
						array[loginIndex][2]=loginmoney-m+"";		//ת���˼�
						array[i][2]=Integer.parseInt(array[i][2])+m+"";		//�տ��˼�
						System.out.println("ת�˳ɹ�");
						break;
					}else {
						System.out.println("�������Ϊ��"+array[loginIndex][2]);
						break;
					}
				}
			}
		}
		if(i==array.length) {
			System.out.println("�Է��˺Ų�����");
		}
		
	}
	
	
	
	
	
	
}

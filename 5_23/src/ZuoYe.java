import java.math.BigDecimal;
import java.util.Scanner;

public class ZuoYe {

	public static void main(String[] args) {
		
		System.out.println(2.0-1.10);		//���ȶ�ʧ
		
		BigDecimal two=new BigDecimal("2.0");
		BigDecimal one=new BigDecimal("1.1");
		System.out.println(two.subtract(one));		//0.9
		
//		����С�����̫��λ���Ĵ���
		
		System.out.printf("%.1f",2.0-1.1);
		
		
		long micro=24*24*60*1000*1000;	//int,���,����int��Χ 
		long millis=24*24*60*1000;		//int,21��
		System.out.println(micro/millis);		//5
		
		long micro1=24L*24*60*1000*1000;	
		long millis1=24*24*60*1000;		
		System.out.println(micro1/millis1);		//1000
		
		
		System.out.println((int)(char)(byte)-1);	//65525
		System.out.println((byte)(char)(int)-1);	//-1
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("����������");
		String name=sc.next();
		System.out.println("������"+name);
		
		System.out.println("����������");
		int age=sc.nextInt();
		System.out.println("���䣺"+age);
		
		System.out.println("�������Ա�");
		char sex=sc.next().charAt(0);
		System.out.println("�Ա�"+sex);
		
		System.out.println("������ѧУ");
		String school=sc.next();
		System.out.println("ѧУ��"+school);
		
		System.out.println("������רҵ");
		String p=sc.next();
		System.out.println("רҵ��"+p);
		
		System.out.println("������סַ");
		String add=sc.next();
		System.out.println("סַ��"+add);
		System.out.println("������ϢΪ��"+"\n����:"+name+"\n�Ա�:"+sex+"\n����:"+age+"\nѧУ:"+school+"\nרҵ��"+p+"\n��ַ:"+add);
		
		

		
		
		
		
		
		
	}

}

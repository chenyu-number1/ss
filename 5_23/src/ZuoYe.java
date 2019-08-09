import java.math.BigDecimal;
import java.util.Scanner;

public class ZuoYe {

	public static void main(String[] args) {
		
		System.out.println(2.0-1.10);		//精度丢失
		
		BigDecimal two=new BigDecimal("2.0");
		BigDecimal one=new BigDecimal("1.1");
		System.out.println(two.subtract(one));		//0.9
		
//		关于小数点后太多位数的处理：
		
		System.out.printf("%.1f",2.0-1.1);
		
		
		long micro=24*24*60*1000*1000;	//int,溢出,超出int范围 
		long millis=24*24*60*1000;		//int,21亿
		System.out.println(micro/millis);		//5
		
		long micro1=24L*24*60*1000*1000;	
		long millis1=24*24*60*1000;		
		System.out.println(micro1/millis1);		//1000
		
		
		System.out.println((int)(char)(byte)-1);	//65525
		System.out.println((byte)(char)(int)-1);	//-1
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入名字");
		String name=sc.next();
		System.out.println("姓名："+name);
		
		System.out.println("请输入年龄");
		int age=sc.nextInt();
		System.out.println("年龄："+age);
		
		System.out.println("请输入性别");
		char sex=sc.next().charAt(0);
		System.out.println("性别："+sex);
		
		System.out.println("请输入学校");
		String school=sc.next();
		System.out.println("学校："+school);
		
		System.out.println("请输入专业");
		String p=sc.next();
		System.out.println("专业："+p);
		
		System.out.println("请输入住址");
		String add=sc.next();
		System.out.println("住址："+add);
		System.out.println("个人信息为："+"\n姓名:"+name+"\n性别:"+sex+"\n年龄:"+age+"\n学校:"+school+"\n专业："+p+"\n地址:"+add);
		
		

		
		
		
		
		
		
	}

}

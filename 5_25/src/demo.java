import java.util.Date;
import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		
		Date date=new Date();
		int y=date.getYear();		//��ȡ��
		int m=date.getMonth();		//��ȡ��
		int d=date.getDate();		//��ȡ��
		int h=date.getHours();		//��ȡʱ
		int mm=date.getMinutes();	//��ȡ��
		int s=date.getSeconds();	//��ȡ��
		int w=date.getDay();		//һ���е���һ�죬������0
		
		System.out.println(y+"-"+m+"-"+d+","+h+"-"+mm+"-"+s+","+w);
		System.out.println((m+1)+"-"+d);
		System.out.println(m);
		
		
		
//		Date date=new Date();
//		int d=date.getDay();
//		switch (d) {
//		case 1:
//			System.out.println("ѧϰ");
//			break;
//		case 2:
//			System.out.println("ѧϰ");
//			break;
//		case 3:
//			System.out.println("ѧϰ");
//			break;
//		case 4:
//			System.out.println("ѧϰ");
//			break;
//		case 5:
//			System.out.println("ѧϰ");
//			break;
//		case 6:
//			System.out.println("��ϰ");
//			break;
//		default:
//			System.out.println("�ŷ�");
//			break;
//		}
//		
//		
//		
//		int da=date.getDay();
//		switch (da) {
//		case 1:
//		case 2:
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("ѧϰ");
//			break;
//		case 6:
//			System.out.println("��ϰ");
//			break;
//		default:
//			System.out.println("�ŷ�");
//			break;
//		}
//		
//		
//		
//		
//		
//		
//		int day=date.getDay();
//		switch (day) {
//		case 1|2|3|4|5:
//			System.out.println("ѧϰ");
//			break;
//		case 6:
//			System.out.println("��ϰ");
//			break;
//		default:
//			System.out.println("�ŷ�");
//			break;
//		}
		
		
		
		
		
		
	}

}

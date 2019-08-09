import java.util.Date;
import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		
		Date date=new Date();
		int y=date.getYear();		//获取年
		int m=date.getMonth();		//获取月
		int d=date.getDate();		//获取日
		int h=date.getHours();		//获取时
		int mm=date.getMinutes();	//获取分
		int s=date.getSeconds();	//获取秒
		int w=date.getDay();		//一周中的那一天，周天是0
		
		System.out.println(y+"-"+m+"-"+d+","+h+"-"+mm+"-"+s+","+w);
		System.out.println((m+1)+"-"+d);
		System.out.println(m);
		
		
		
//		Date date=new Date();
//		int d=date.getDay();
//		switch (d) {
//		case 1:
//			System.out.println("学习");
//			break;
//		case 2:
//			System.out.println("学习");
//			break;
//		case 3:
//			System.out.println("学习");
//			break;
//		case 4:
//			System.out.println("学习");
//			break;
//		case 5:
//			System.out.println("学习");
//			break;
//		case 6:
//			System.out.println("自习");
//			break;
//		default:
//			System.out.println("放飞");
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
//			System.out.println("学习");
//			break;
//		case 6:
//			System.out.println("自习");
//			break;
//		default:
//			System.out.println("放飞");
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
//			System.out.println("学习");
//			break;
//		case 6:
//			System.out.println("自习");
//			break;
//		default:
//			System.out.println("放飞");
//			break;
//		}
		
		
		
		
		
		
	}

}

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
		Date date=new Date();
		int m=date.getMonth();
		int w=date.getDay();
		int t=date.getDate();
		switch (m) {
		case 0:
		case 1:
		case 2:
			if(w==1) {
				System.out.println(t);
			}
			System.out.println("第一季度");
			
			break;
		case 3:
		case 4:
		case 5:
			if(w==2) {
				System.out.println(t);
			}
			System.out.println("第二季度");
			
			break;
		case 6:
		case 7:
		case 8:
			if(w==3) {
				System.out.println(t);
			}
			System.out.println("第三季度");
			
			break;

		default:
			if(w==4) {
				System.out.println(t);
			}
			System.out.println("第四季度");
			break;
		}
		
		
//		
//		yyyy，年
//		MM，月
//		dd，一个月中的哪一天
//		DD，一周中的一天
//		HH，24小时进制。hh，12小时进制
//		mm，分钟
//		ss，秒
		
		//格式化模板
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String str=sdf.format(date);
		System.out.println(str);
		
	}

}

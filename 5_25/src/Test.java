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
			System.out.println("��һ����");
			
			break;
		case 3:
		case 4:
		case 5:
			if(w==2) {
				System.out.println(t);
			}
			System.out.println("�ڶ�����");
			
			break;
		case 6:
		case 7:
		case 8:
			if(w==3) {
				System.out.println(t);
			}
			System.out.println("��������");
			
			break;

		default:
			if(w==4) {
				System.out.println(t);
			}
			System.out.println("���ļ���");
			break;
		}
		
		
//		
//		yyyy����
//		MM����
//		dd��һ�����е���һ��
//		DD��һ���е�һ��
//		HH��24Сʱ���ơ�hh��12Сʱ����
//		mm������
//		ss����
		
		//��ʽ��ģ��
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String str=sdf.format(date);
		System.out.println(str);
		
	}

}

import java.util.Scanner;

public class ZuoYe1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("��������λ��");
		int num=sc.nextInt();
		int g=num%10;
		int s=(num-g)/10%10;
		int b=(num-g-s)/100;
		System.out.println("��λ��֮��Ϊ��"+(g+s+b));
		
		
	}

}

import java.util.Scanner;

public class ZuoYe1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入三位数");
		int num=sc.nextInt();
		int g=num%10;
		int s=(num-g)/10%10;
		int b=(num-g-s)/100;
		System.out.println("三位数之和为："+(g+s+b));
		
		
	}

}

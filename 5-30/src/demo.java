import java.util.Arrays;

public class demo {

	public static void main(String[] args) {

		//冒泡排序
		int[] a= {10,20,30,6,7,9};
		
		for(int i=0;i<a.length-1;i++) {			//循环轮
			for(int j=0;j<a.length-1-i;j++) {	//遍历
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int b:a) {
			System.out.print(b+" ");
		}
		
		System.out.println();
		
		//选择排序
		for(int c=0;c<a.length-1;c++) {
			int dex=c;
			for(int d=c+1;d<a.length;d++) {
				if(a[d]<a[dex]) {
					dex=d;
					}
			}	
				if(dex!=c) {	
					int temp=a[c];
					a[c]=a[dex];
					a[dex]=temp;
			}
		}
		for(int e:a) {
			System.out.print(e+" ");
		}
		
		System.out.println();
		
		//插入排序
		int[] arr= {23,55,34,44,78,2};
		
		for(int i=0;i<arr.length-1;i++) {//轮
			
			for(int j=i+1;j>0;j--) {//后方数据和前方有序数据进行比较，放置合适的位置；j>0,如果j=0时，，j-1=-1，超出边界
				
				if(arr[j]<arr[j-1]) {//交换位置
					
					int  temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		
		//利用java中Array进行处理
		int[] ar= {23,55,34,44,78,2};
		Arrays.sort(ar);	//升序
		for (int i : ar) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		//降序
		for(int i=0;i<ar.length/2;i++){
			int temp=ar[i];
			ar[i]=ar[ar.length-i-1];
			ar[ar.length-i-1]=temp;
		}
		for (int i : ar) {
			System.out.print(i+" ");
		}
		
		
		
	}

}

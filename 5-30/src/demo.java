import java.util.Arrays;

public class demo {

	public static void main(String[] args) {

		//ð������
		int[] a= {10,20,30,6,7,9};
		
		for(int i=0;i<a.length-1;i++) {			//ѭ����
			for(int j=0;j<a.length-1-i;j++) {	//����
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
		
		//ѡ������
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
		
		//��������
		int[] arr= {23,55,34,44,78,2};
		
		for(int i=0;i<arr.length-1;i++) {//��
			
			for(int j=i+1;j>0;j--) {//�����ݺ�ǰ���������ݽ��бȽϣ����ú��ʵ�λ�ã�j>0,���j=0ʱ����j-1=-1�������߽�
				
				if(arr[j]<arr[j-1]) {//����λ��
					
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
		
		
		//����java��Array���д���
		int[] ar= {23,55,34,44,78,2};
		Arrays.sort(ar);	//����
		for (int i : ar) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		//����
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


public class demo2 {

	public static void main(String[] args) {

		//��������
		String[][] array= {
				{"С��","123456","5000"}	,
				{"С��","123456","5000"},
				{"С��","123456","5000"},
				null,
				null,
				null,
			};
		
		//����
		array[4]=new String[] {"Сޱ","123456","5000"};
		
		//�޸�
		array[2][2]="10000";
		
		//����
		for(int i=0;i<array.length;i++) {
			if(array[i]!=null) {
				for(int j=0;j<array[i].length;j++) {
					System.out.print(array[i][j]+"\t");
				}
				System.out.println();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

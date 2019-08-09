
public class demo2 {

	public static void main(String[] args) {

		//定义数组
		String[][] array= {
				{"小黑","123456","5000"}	,
				{"小白","123456","5000"},
				{"小美","123456","5000"},
				null,
				null,
				null,
			};
		
		//放置
		array[4]=new String[] {"小薇","123456","5000"};
		
		//修改
		array[2][2]="10000";
		
		//遍历
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

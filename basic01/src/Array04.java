
public class Array04 {

	public static void main(String[] args) {
		// 2���� �迭 �����ϱ�
		// ������ Ÿ���� ���� ������ ������ ��
		
		int data[][] = new int [4][3];
		int[][] data2;
		
		data[2][1] = 60;
		data[1][0] = 80;
		
		System.out.println(data[2][1]);
		
		System.out.println("-----���м�-----");
		
		// data.length : 2�����迭�� ���� ��
		for(int i=0; i<data.length ;i++) { // �� 0,1,2,3
			//data[i].length : i���� ĭ��	
			for(int j=0; j<data[i].length; j++) { // �� 0,1,2
				System.out.print(data[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}

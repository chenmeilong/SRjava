
public class Method02 { 

	//��дһ��main����
	public static void main(String[] args) {

		//�����һ������ , �������ĸ���Ԫ��ֵ
		int [][] map =  {{0,0,1},{1,1,1},{1,1,3}};

		//ʹ�÷���������, ����MyTools���� 
		MyTools tool = new MyTools();

		//����map����
		//��ͳ�Ľ����ʽ����ֱ�ӱ���
		// for(int i = 0; i < map.length; i++) {
		// 	for(int j = 0; j < map[i].length; j++) {
		// 		System.out.print(map[i][j] + "\t");
		// 	}
		// 	System.out.println();
		// }
		//ʹ�÷���
		tool.printArr(map);

		//....
		//
		//Ҫ���ٴα���map����
		// for(int i = 0; i < map.length; i++) {
		// 	for(int j = 0; j < map[i].length; j++) {
		// 		System.out.print(map[i][j] + "\t");
		// 	}
		// 	System.out.println();
		// }
		tool.printArr(map);


		//...�ٴα���
		//
		// for(int i = 0; i < map.length; i++) {
		// 	for(int j = 0; j < map[i].length; j++) {
		// 		System.out.print(map[i][j] + "\t");
		// 	}
		// 	System.out.println();
		// }
		tool.printArr(map);

	}
}

//������Ĺ��ܣ�д��һ����ķ�����,Ȼ����ø÷�������
class MyTools {
	//����������һ����ά����
	
	public void printArr(int[][] map) {
		System.out.println("=======");
		//�Դ����map������б������
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + "_");
			}
			System.out.println();
		}
	}
}
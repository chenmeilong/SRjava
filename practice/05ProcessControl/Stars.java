

public class Stars { 

	//��дһ��main����
	public static void main(String[] args) {

		/*
		
			    *
			  *  *
			 *    *
			********

		˼·����
		����Ϊ��
		1. �ȴ�ӡһ������
		*****
		*****
		*****
		*****
		*****
		2. ��ӡ���������

		*    	//��1�� �� 1��*
		**   	//��2�� �� 2��*
		***		//��3�� �� 3��*
		****    //��4�� �� 4��*
		*****   //��5�� �� 5��*
		
		3. ��ӡ����������
		*       //��1�� �� 1��*   2 * 1 -1   ��4=(�ܲ���-1)���ո�
	   ***      //��2�� �� 3��*   2 * 2 -1   ��3=(�ܲ���-2)���ո�
	  *****     //��3�� �� 5��*   2 * 3 -1   ��2=(�ܲ���-3)���ո�
	 *******    //��4�� �� 7��*   2 * 4 -1   ��1=(�ܲ���-4)���ո�
	*********   //��5�� �� 9��*   2 * 5 -1   ��0=(�ܲ���-5)���ո�

		4. ��ӡ���ĵĽ����� [���ѵ�]
	    *       //��1�� �� 1��*   ��ǰ�еĵ�һ��λ����*,���һ��λ��Ҳ��*
	   * *      //��2�� �� 2��*   ��ǰ�еĵ�һ��λ����*,���һ��λ��Ҳ��*
	  *   *     //��3�� �� 2��*   ��ǰ�еĵ�һ��λ����*,���һ��λ��Ҳ��*
	 *     *    //��4�� �� 2��*   ��ǰ�еĵ�һ��λ����*,���һ��λ��Ҳ��*
	*********   //��5�� �� 9��*   ȫ�����*
	
		�������
		5 �������ɱ��� int totalLevel = 5;
	
	//С��� ������λ���Ϳ��Ժܿ�İѴ���д��
		 */
		/*
		int totalLevel = 20; //����
		for(int i = 1; i <= totalLevel; i++) { //i ��ʾ����

			//�����*֮ǰ��������� ��Ӧ�ո� = �ܲ���-��ǰ��
			for(int k = 1; k <= totalLevel - i; k++ ) {
				System.out.print(" ");
			}

			//���ƴ�ӡÿ���*����
			for(int j = 1;j <= 2 * i - 1;j++) {
				//��ǰ�еĵ�һ��λ����*,���һ��λ��Ҳ��*, ���һ��ȫ�� *
				if(j == 1 || j == 2 * i - 1 || i == totalLevel) {
					System.out.print("*");
				} else { //�����������ո�
					System.out.print(" ");
				}
			}
			//ÿ��ӡ��һ���*�󣬾ͻ��� println����ỻ��
			System.out.println("");
		}
		*/
	

		int totalLevel=20;
		int totalnum=(totalLevel-1)*2+1;

		for(int level=1;level<=totalLevel;level++){
			int outSpace=totalLevel-level;
			while(outSpace>0){
				System.out.print(" ");
				outSpace--;
			}

			if(level==1){
				System.out.print("*");
			}
			else if(level==totalLevel){
				while(totalnum>0){
					System.out.print("*");
					totalnum--;
				}
			}
			else{
				int inSpace=(level-1)*2-1;
				System.out.print("*");
				while(inSpace>0){
					System.out.print(" ");
					inSpace--;
				}
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
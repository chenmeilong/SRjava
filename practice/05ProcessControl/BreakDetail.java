

public class BreakDetail { 

	//��дһ��main����
	public static void main(String[] args) {

		abc1:
		for(int j = 0; j < 4; j++){//���for
		abc2:
			for(int i = 0; i < 10; i++){//�ڲ�for
				if(i == 2){
					//break  ;//�ȼ� break abc2
					break abc1 ;
				}
				System.out.println("i = " + i);
			}
		}

	}
}
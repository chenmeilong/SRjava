
//为解决
public class eightQueen{
	public static void main(String[] args){


		AA role1= new AA;

		int posi[]=new int[8];

		role1.count(posi,0);

	}
}

class AA{
	public boolean count (int[] posi[8],int num){
		if(num<0){
			if (num==0){
				posi[0] = 0;
			}
			else{
				for (int i=0; i <8;i++){
					posi[num] = i;   //假定皇后的位置
					//判断皇后的位置是否合理
					for (int k=0;k<n;k++){
						if (posi[num]==posi[k])//纵向位置不合理
							break;
						else if (Math.abs(posi[num]-posi[k])==Math.abs(num-k)){    //斜方向位置不合理
							break;
						}
					}



				}

			}

		}
		else
			return false;



	} 


}
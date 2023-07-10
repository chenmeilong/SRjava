//±àÐ´×÷ÒµÌâÄ¿
//

public class exercise{
	public static void main(String[] args){

		int[][] map =new int[8][7];   //8ÐÐ7ÁÐ


		for (int i = 0; i < map.length;i++){
			map[i][0]=1;
			map[i][6]=1;
		}
		for (int i = 0; i < map[0].length;i++){
			map[0][i]=1;
			map[7][i]=1;
		}


		for (int i = 0 ; i< map.length;i++){
			for (int j =0;j< map[i].length;j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
		map[3][1]=1;
		map[3][2]=1;
		map[2][2]=1;


		AA role1 = new AA();

		role1.findWay(map,1,1);

		System.out.println("===========================");


		for (int i = 0 ; i< map.length;i++){
			for (int j =0;j< map[i].length;j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}

	}


}

//ÏÂÓÒ×óÉÏ
class AA{
	public boolean findWay(int[][] map,int i, int j){
		if (map[6][5]==2){
			return true;
		}else if(map[i][j]==0){
				map[i][j]=2;
				if(findWay(map,i+1,j)){
					return true;
				}
				else if(findWay(map,i,j+1)){
					return true;
				}
				else if(findWay(map,i,j-1)){
					return true;
				}
				else if(findWay(map,i-1,j)){
					return true;
				}
				else{
					map[i][j] = 3;
					return false;
				}
		}
		else
			return false;

	}
}

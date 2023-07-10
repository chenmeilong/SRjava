

public class Stars { 

	//编写一个main方法
	public static void main(String[] args) {

		/*
		
			    *
			  *  *
			 *    *
			********

		思路分析
		化繁为简
		1. 先打印一个矩形
		*****
		*****
		*****
		*****
		*****
		2. 打印半个金字塔

		*    	//第1层 有 1个*
		**   	//第2层 有 2个*
		***		//第3层 有 3个*
		****    //第4层 有 4个*
		*****   //第5层 有 5个*
		
		3. 打印整个金字塔
		*       //第1层 有 1个*   2 * 1 -1   有4=(总层数-1)个空格
	   ***      //第2层 有 3个*   2 * 2 -1   有3=(总层数-2)个空格
	  *****     //第3层 有 5个*   2 * 3 -1   有2=(总层数-3)个空格
	 *******    //第4层 有 7个*   2 * 4 -1   有1=(总层数-4)个空格
	*********   //第5层 有 9个*   2 * 5 -1   有0=(总层数-5)个空格

		4. 打印空心的金字塔 [最难的]
	    *       //第1层 有 1个*   当前行的第一个位置是*,最后一个位置也是*
	   * *      //第2层 有 2个*   当前行的第一个位置是*,最后一个位置也是*
	  *   *     //第3层 有 2个*   当前行的第一个位置是*,最后一个位置也是*
	 *     *    //第4层 有 2个*   当前行的第一个位置是*,最后一个位置也是*
	*********   //第5层 有 9个*   全部输出*
	
		先死后活
		5 层数做成变量 int totalLevel = 5;
	
	//小伙伴 技术到位，就可以很快的把代码写出
		 */
		/*
		int totalLevel = 20; //层数
		for(int i = 1; i <= totalLevel; i++) { //i 表示层数

			//在输出*之前，还有输出 对应空格 = 总层数-当前层
			for(int k = 1; k <= totalLevel - i; k++ ) {
				System.out.print(" ");
			}

			//控制打印每层的*个数
			for(int j = 1;j <= 2 * i - 1;j++) {
				//当前行的第一个位置是*,最后一个位置也是*, 最后一层全部 *
				if(j == 1 || j == 2 * i - 1 || i == totalLevel) {
					System.out.print("*");
				} else { //其他情况输出空格
					System.out.print(" ");
				}
			}
			//每打印完一层的*后，就换行 println本身会换行
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
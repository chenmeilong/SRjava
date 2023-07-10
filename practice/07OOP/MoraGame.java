import java.util.Random;                                                                              
import java.util.Scanner;                                                                             
                                                                                                      
/*                                                                                                    
���дһ����ȭ����Ϸ                                                                                            
�и��� Tom��������ĳ�Ա����. ��Ա����, ���Ե��Բ�ȭ. ����ÿ�ζ���������� 0, 1, 2                                                    
0 ��ʾ ʯͷ 1 ��ʾ���� 2 ��ʾ ��                                                                                 
��Ҫ������ʾ Tom����Ӯ�������嵥��, �ٶ� ������.                                                                          
 */ 
 // ������,����
public class MoraGame {                                                                               
                                                                                                      
    // ����                                                                                             
    public static void main(String[] args) {                                                          
        // ����һ����Ҷ���                                                                                   
        Tom t = new Tom();                                                                            
        // ������¼�����Ӯ�Ĵ���                                                                                
        int isWinCount = 0;                                                                           
                                                                                                      
        // ����һ����ά���飬�������վ�����Tom��ȭ����Լ����Գ�ȭ���                                                            
        int[][] arr1 = new int[3][3];                                                                 
        int j = 0;                                                                                    
                                                                                                      
        // ����һ��һά���飬����������Ӯ���                                                                          
        String[] arr2 = new String[3];                                                                
                                                                                                      
        Scanner scanner = new Scanner(System.in);                                                     
        for (int i = 0; i < 3; i++) {   //����3��                                                              
            // ��ȡ��ҳ���ȭ                                                                                
            System.out.println("��������Ҫ����ȭ��0-ȭͷ��1-������2-������");                                           
            int num = scanner.nextInt();                                                              
            t.setTomGuessNum(num);                                                                    
            int tomGuess = t.getTomGuessNum();                                                        
            arr1[i][j + 1] = tomGuess;                                                                
                                                                                                      
            // ��ȡ���Գ���ȭ                                                                                
            int comGuess = t.computerNum();                                                           
            arr1[i][j + 2] = comGuess;                                                                
                                                                                                      
            // ����Ҳµ�ȭ��������Ƚ�                                                                           
            String isWin = t.vsComputer();                                                            
            arr2[i] = isWin;                                                                          
            arr1[i][j] = t.count;                                                                     
                                                                                                      
            // ��ÿһ�ֵ�����������                                                                            
           System.out.println("=========================================");                           
            System.out.println("����\t��ҵĳ�ȭ\t���Եĳ�ȭ\t��Ӯ���");                                             
            System.out.println(t.count + "\t" + tomGuess + "\t\t" + comGuess + "\t\t" + t.vsComputer());
            System.out.println("=========================================");                          
            System.out.println("\n\n");                                                               
            isWinCount = t.winCount(isWin);                                                           
        }                                                                                             
                                                                                                      
        // ����Ϸ�����ս���������                                                                               
        System.out.println("����\t��ҵĳ�ȭ\t���Եĳ�ȭ\t\t��Ӯ���");                                               
        for (int a = 0; a < arr1.length; a++) {                                                       
            for (int b = 0; b < arr1[a].length; b++) {                                                
                System.out.print(arr1[a][b] + "\t\t\t");                                              
            }                                                                                         
                                                                                                      
            System.out.print(arr2[a]);                                                                
            System.out.println();                                                                     
        }                                                                                             
        System.out.println("��Ӯ��" + isWinCount + "��");                                                 
    }                                                                                                 
                                                                                                      
}                                                                                                     

// Tom��
class Tom {     // ���Ĵ���  
	// ��ҳ�ȭ������ 
    int tomGuessNum; //0,1,2
	// ���Գ�ȭ������
    int comGuessNum; //0,1,2
	// ���Ӯ�Ĵ���
    int winCountNum;  
	// �����Ĵ���
    int count = 1;   //һ������3��                                                                                 
     
	
	public void showInfo() {
		//....
	}
	
    /**                                                                                               
     * ����������ɲ�ȭ�����ֵķ���                                                                                 
     * @return                                                                                        
     */                                                                                               
    public int computerNum() {                                                                        
        Random r = new Random();                                                                      
        comGuessNum = r.nextInt(3);      // ���� ���� 0-2�������                                                             
        // System.out.println(comGuessNum);                                                           
        return comGuessNum;                                                                           
    }                                                                                                 
                                                                                                      
    /**                                                                                               
     * ������Ҳ�ȭ�����ֵķ���                                                                                   
     * @param tomGuessNum                                                                             
     */                                                                                               
    public void setTomGuessNum(int tomGuessNum) {                                                     
        if (tomGuessNum > 2 || tomGuessNum < 0) { 
			//�׳�һ���쳣, ��ͬѧ��д��û�д���
            throw new IllegalArgumentException("�����������");                                             
        }                                                                                             
        this.tomGuessNum = tomGuessNum;                                                               
    }                                                                                                 
                                                                                                      
    public int getTomGuessNum() {                                                                     
        return tomGuessNum;                                                                           
    }                                                                                                 
                                                                                                      
    /**                                                                                               
     * �Ƚϲ�ȭ�Ľ��                                                                                        
     * @return ���Ӯ����true�����򷵻�false                                                                    
     */                                                                                               
    public String vsComputer() { 
		 //�Ƚ���
        if (tomGuessNum == 0 && comGuessNum == 1) {                                                   
            return "��Ӯ��";                                                                             
        } else if (tomGuessNum == 1 && comGuessNum == 2) {                                            
            return "��Ӯ��";                                                                             
        } else if (tomGuessNum == 2 && comGuessNum == 0) {                                            
            return "��Ӯ��";                                                                             
        } else if (tomGuessNum == comGuessNum){                                                       
            return "ƽ��";                                                                              
        } else {                                                                                      
            return "������";                                                                             
        }                                                                                             
    }                                                                                                 
                                                                                                      
    /**                                                                                               
     * ��¼���Ӯ�Ĵ���                                                                                       
     * @return                                                                                        
     */                                                                                               
    public int winCount(String s) {                                                                   
        count++;    //������Ĵ���                                                                                   
        if (s.equals("��Ӯ��")) {     //ͳ��Ӯ�Ĵ���                                                                   
            winCountNum++;                                                                            
        }                                                                                             
        return winCountNum;                                                                           
    }                                                                                                 
                                                                                                      
}                                                                                                     
                                                                                                      

/**
 * ReggiedArray 
 * 
 * @author (2018210083_노승욱) 
 * @version (2020.04.17)
 */
public class ReggedArray
{
    public static int[][] makeArray(){
        int[][] reggedArray = new int[4][];
        reggedArray[0] = new int[3];
        reggedArray[1] = new int[2];
        reggedArray[2] = new int[3];
        reggedArray[3] = new int[2];
        
        return reggedArray;        
    }
    
    public static int[][] initArray(int[][] temp){
        for(int i = 0; i < temp.length; i++)
            for(int j = 0; j < temp[i].length; j++)
                temp[i][j] = (i+1)*10 + j;
                
        return temp;
    }
    
    //printArray 출력 해보기
    
    public static void main(String[] args){
        int[][] reggedArray = makeArray();
        
        reggedArray = initArray(reggedArray);
        for(int i = 0; i < reggedArray.length; i++) {
            for(int j = 0; j < reggedArray[i].length; j++)
                System.out.print(reggedArray[i][j] + "  ");
            System.out.println();
        }
        
        System.out.println(args[0]);
    }
}
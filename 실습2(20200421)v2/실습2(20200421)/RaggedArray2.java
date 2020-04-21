/**
 * RaggedArray 실습2
 * 
 * @author (2018210083_노승욱) 
 * @version (2020.04.21)
 */
public class RaggedArray2
{
    /**
     * 배열 생성
     * 
     */
    public static int[][] makeArray(){
        int[][] raggedArray = new int[4][];
        raggedArray[0] = new int[3];
        raggedArray[1] = new int[2];
        raggedArray[2] = new int[3];
        raggedArray[3] = new int[2];

        return raggedArray;        
    }
    
    /**
     * 배열을 초기화
     * initArray에 makeArray를 전달해야 하니까 데이터 타입은 init[][]
     * @parameter temp 초기화 하려는 배열 
     * @return  초기화된 2차원 비정방형 배열
     */
    public static int[][] initArray(int[][] temp){
        for(int i = 0; i < temp.length; i++){
            for(int j = 0; j < temp[i].length; j++){
                temp[i][j] = (i+1)*10 + j;
            }
        }

        return temp;
    }
    
    public static void printArray(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    //for each 사용
    public static int sumArray(int[] num){
        int sum = 0;
        for(int A : num)
            sum += A;
        
        return sum;
    }
    
    public static void main(String[] args){
        int[][] raggedArray = makeArray();
        
        raggedArray = initArray(raggedArray);
        
        printArray(raggedArray);
        System.out.println("----------");
        
        for(int i = 0; i < raggedArray.length; i++){
            System.out.println(sumArray(raggedArray[i]));
        }
    }
}
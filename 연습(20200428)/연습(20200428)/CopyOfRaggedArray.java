/**
 * 
 * 
 * @author (2018210083 노승욱) 
 * @version (2020.04.28)
 */
public class CopyOfRaggedArray
{
    /**
     * 배열을 생성
     * 
     * @return      생성된 2차원 비정방형 배열
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
     * 
     * @parameter temp      초기화 하려는 배열 
     * @return              초기화된 2차원 비정방형 배열
     */    
    public static int[][] initArray(int[][] temp){
        for(int i = 0; i < temp.length; i++){
            for(int j = 0; j < temp[i].length; j++){
                temp[i][j] = (i+1)*10 + j;
            }
        }

        return temp;
    }
    /**
     * 배열을 출력
     * 
     * @parameter array      출력하려는 배열 
     * 
     */
    public static void printArray(int[][] array){
        for(int[] row : array){
            for(int column : row){
                System.out.print(column + " ");
            }
            System.out.println();
        }
        /*for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }*/
    }
    
    public static int sumArray(int[] array){
        int result = 0;
        for(int item : array){
            result += item;
        }
        return result;
    }
    /**
     * 
     * 
     * @param           array 처리 대상이 되는 2차원 비정방형 배열
     */
    public static void totalSumArray(int[][] array){
        for(int[] item1 : array){
            int result = 0;
            for(int item2 : item1){
                result += item2;
            }
            System.out.println(result);
        }
     }
    /**
     * 1개의 행의 합을 구하는 메소드
     * 
     * @parameter array     합을 구하려는 1차원 배열
     * @return              합계 결과 값
     */    
    public static void main(String[] args){
        int[][] raggedArray = makeArray();
        
        int[][] x = initArray(raggedArray);
        
        printArray(x);
        
        System.out.println("----------");
        
        totalSumArray(x);
        
        // for(int[] array: x){
            // System.out.println(sumArray(array));
        // }
        /*System.out.println(sumArray(x[0]));
        System.out.println(sumArray(x[1]));
        System.out.println(sumArray(x[2]));
        System.out.println(sumArray(x[3]));*/
    }
}

/**
 * 각 열의 합과 평균을 계산하여 출력하는 프로그램
 * 
 * @author (2018210083_노승욱) 
 * @version (2020.05.12)
 */
public class MidExam
{
    /**
     * 배열을 생성
     * 
     * @return      생성된 2차원 비정방형 배열
     */
    public static int[][] makeArray(){
        int[][] raggedArray= new int[4][];
        raggedArray[0] = new int[4];
        raggedArray[1] = new int[2];
        raggedArray[2] = new int[3];
        raggedArray[3] = new int[4];
        
        return raggedArray;
    }
    
    /**
     * 가장 긴 열 길이를 갖는 행을 구하는 메소드
     * 
     * @parameter   array
     * @return      가장 긴 열 길이
     */
    public static int[][] findLongestRowLength(int[][] array){
        int longestRowLength = raggedArray[0].length;
        for(; ;){
            longestRowLength = (longestRowLength <= array.length)
                                ?(array.length) : (longestRowLength);
        }
     
     
        
    }
    
    /**
     * 평균값 계산 & 출력
     * 
     * @parameter   array, row
     */
    public static void calculateArray(int[][] array, int row){
    }
    
    public static void main(String[] args){
        int[][] raggedArray = makeArray();
        
        int[] longestRowLength = findLongestRowLength(raggedArray);
        
        calculateArray(raggedArray, longestRowLength);
    }
}

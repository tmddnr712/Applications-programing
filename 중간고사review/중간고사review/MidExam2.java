
/**
 * MidExam - for while 사용
 * 
 * @author (노승욱) 
 * @version (2020.05.15)
 */
public class MidExam2
{
    public static void main(String[] args){
        int[][] raggedArray = makeArray();
        
        int longestRowLength = findLongestRowLength(raggedArray);
        
        calculateArray(raggedArray, longestRowLength);
    }
    
    public static int[][] makeArray(){
        int[][] array = {
                          {78, 48, 78, 98},
                          {99, 92},
                          {29, 64, 83},
                          {34, 78, 92, 56}
        };
        return array;
    }
    
    public static int findLongestRowLength(int[][] raggedArray){
        int longestRowLength = raggedArray[0].length; // 4
        for(int[] array : raggedArray){
            longestRowLength = (longestRowLength <= array.length)
                               ? (array.length) : (longestRowLength);
        }
        return longestRowLength;
    }
    
    public static void calculateArray(int[][] array, int row){
        for(int j = 0; j<row; j++){
            int sum = 0;
            int n = 0;
            double average = 0.0;
            for(int i = 0; i < array.length; i++){
                if(array[i].length <= j)
                    continue;
                sum += array[i][j];
                n++;
            }
            average = (double)sum / (double)n;
            System.out.println((j+1) + "번째 열 : 합 =" + sum + "   평균 = " + average);
        }
    }
}

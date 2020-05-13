/**
 * 각 열의 합과 평균을 계산하여 출력하는 프로그램
 * 
 * @author (2018210083_노승욱) 
 * @version (2020.05.13)
 */
public class MidExam
{
    /**
     * 배열을 생성
     * 
     * @return      생성된 2차원 비정방형 배열
     */
    public static int[][] makeArray(){
        int[][] array = {{78, 48, 78, 98}, {99, 92}, {29, 64, 83}, {34, 78, 92, 56}};

        return array;
    }

    /**
     * 생성된 배열에서 가장 긴 행의 길이를 구함
     * 
     * @parameter   raggedArray 생성된 배열
     * @return      가장 긴 행의 길이
     */
    public static int findLongestRowLength(int[][] raggedArray){
        int longestRowLength = raggedArray[0].length;
        for(int[] array : raggedArray){
            longestRowLength = (longestRowLength <= array.length)
                                ? (array.length) : (longestRowLength);
        }

        return longestRowLength;
    }

    /**
     * 평균값 계산 & 출력
     * 
     * @parameter   array, row
     */
    public static void calculateArray(int[][] array, int row){
        for(int j = 0; j < row; j++){
            int sum = 0;
            int n = 0;
            int i = 0;
            double average = 0.0;
            while(i != array.length){
                try{
                    sum += array[i][j];
                    n++;
                }
                catch(ArrayIndexOutOfBoundsException E){
                    continue;
                }
                finally{
                    i++;
                }
            }
            average = sum / n;
            System.out.println((j+1) + "번째의 열 : 합 = " + sum + "평균 = " + average);
        }
    }

    public static void main(String[] args){
        int[][] raggedArray = makeArray();

        int longestRowLength = findLongestRowLength(raggedArray);

        calculateArray(raggedArray, longestRowLength);
    }
}

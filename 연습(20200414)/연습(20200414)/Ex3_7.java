import java.util.Scanner;
/**
 * 배열에 입력받은 수 중 제일 큰 수 찾기
 * 
 * @author (2018210083_노승욱) 
 * @version (2020.04.14)
 */
public class Ex3_7
{
    public static void main(String[] args){
        System.out.println("양수 5개를 입력하세요.");
        Scanner scan = new Scanner(System.in);
        
        int[] data = new int[5];
        
        for(int i = 0; i <= data.length - 1; i++){
            data[i] = scan.nextInt();   
        }
        
        int i = 0;
        int large = 0;
        while(i <= 4){
            if(large < data[i]){
                large = data[i];
            }
            i = i + 1;
        }
        
        System.out.println("가장 큰 수는" + large + "입니다.");
    }
}

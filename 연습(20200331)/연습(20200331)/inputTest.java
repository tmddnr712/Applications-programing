import java.util.Scanner;
/**
 * 입력처리 테스트
 * 
 * @author (2018210083_노승욱) 
 * @version (2020.03.31)
 */
public class inputTest
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("학번을 입력하세요~");
        String stID = scanner.next();
        
        System.out.println(stID);
    }
}
import java.util.Scanner;
/**
 * IfElseTest(3의 배수 확인하기)
 * 
 * @author (2018210083_노승욱) 
 * @version (2020.04.07)
 */
public class IfElseTest
{
    public static void main(String[] args){
        System.out.println("정수 값을 입력하세요~");
        
        Scanner scan = new Scanner(System.in); // new Scanner = 스캐너 클래스에서 객체하나 만들게요~, system.in = 표준입력장치, Scan = 참조변수, Scanner = 변수 선언
        int n= scan.nextInt(); // message = nextInt, parameter = ()비어있음, 
        
        if(n % 3 == 0){
            System.out.println("OK");
        }
        else{
            System.out.println("NG");
        }
    }
}


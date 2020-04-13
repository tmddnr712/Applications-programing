import java.util.Scanner;
/**
 * Grade(성적 확인 프로그램)
 * 
 * @author (2018210083_노승욱) 
 * @version (2020.04.07)
 */
public class Grade
{
    public static void main(String[] args){
        System.out.println("성적을 입력하세요~");

        Scanner input = new Scanner(System.in); // new Scanner = 스캐너 클래스에서 객체하나 만들게요~, system.in = 표준입력장치, Scan = 참조변수, Scanner = 변수 선언
        int score = input.nextInt(); // message = nextInt, parameter = ()비어있음, 

        if((90 <= score) && (score <= 100)){
            System.out.println("A");
        }
        else if((80 <= score) && (score < 90)){
            System.out.println("B");
        }
        else if((70 <= score) && (score < 80)){
            System.out.println("C");
        }
        else if((60 <= score) && (score < 70)){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
}


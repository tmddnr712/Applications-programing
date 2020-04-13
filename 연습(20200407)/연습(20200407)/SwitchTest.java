import java.util.Scanner;
/**
 * Exam(점수와 학년을 입력 받아 60점 이상이면 합격, 미안이면 불합격을 출력. 4학년의 경우 70점 이상이어야 합격)
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class SwitchTest
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("성적을 입력하세요~");
        int score = input.nextInt();

        switch(score / 10){
            case 10 :
            case 9 :
                System.out.println("A");
                break;
            case 8 :
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default :
                System.out.println("F");
                //break;

        }
    }
}

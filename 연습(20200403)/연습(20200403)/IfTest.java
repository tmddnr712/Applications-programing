import java.util.Scanner;
/**
 * 여기에 IfTest 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class IfTest
{
    public static void main(String[] args){
        System.out.println("성적을 입력해주세요~");
        Scanner scanner = new Scanner (System.in);
        int score = scanner.nextInt(); // scanner 변수한테 보내지는 메세지, message이름 nextInt, () parameter 비어있음, return int
        if(score >= 80){
            System.out.println("축하합니다. 합격입니다~!");
        }
        else
        {
            System.out.println("안타깝지만, 불합격입니다.");
        }
    }
}

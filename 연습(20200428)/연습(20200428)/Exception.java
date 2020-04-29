
/**
 * 여기에 Exception 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Exception
{
    public static void main(String[] args){
        int x = 4;
        int y = 0;
        
        try{
            System.out.println(x / y);
        }
        catch(ArithmeticException e){
            System.out.println("나눌 수 없어요");
        }
        
        // if(y == 0)
            // System.out.println("나눌 수 없어요~");
        // else
            // System.out.println(x / y);
    }
}

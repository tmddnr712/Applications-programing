
/**
 * 여기에 Add 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Add extends Calc implements PhoneInterface
{
    /**
     * 덧셈 메소드
     *  
     * @return      덧셈 결과값
     */    
    @Override
    public int calculate()
    {
        return a + b;
    }
    
    public void sendCall(){
        System.out.println("sendCall실행 in Add");
    }
    
    public void receiveCall(){
        System.out.println("receiveCall실행 in Add");
    }
}

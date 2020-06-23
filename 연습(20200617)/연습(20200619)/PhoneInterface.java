
/**
 *   인터페이스 PhoneInterface - 여기에 인터페이스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전 번호나 날짜)
 */

public interface PhoneInterface extends A, B
{
    public static final int TIMEOUT = 10000;
    public abstract void sendCall();
    public abstract void receiveCall();
    public default void printLogo(){
        System.out.println("***** Phone *****");
    }
}

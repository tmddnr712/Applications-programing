
/**
 * 추상클래스 Calc - 여기에 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름)
 * @version (버전 번호나 날짜)
 */
public abstract class Calc
{
    public int a;
    public int b;

    public abstract int calculate();

    /**
     * 인자
     *  
     * @return      덧셈 결과값
     */    
    public void setValue(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
}

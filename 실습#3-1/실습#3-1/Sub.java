/**
 * 여기에 Add 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Sub extends Calc
{
    /**
     * 뺄셈 메소드
     *  
     * @return      뺄셈 결과값
     */    
    @Override
    public int calculate()
    {
        return a - b;
    }
}
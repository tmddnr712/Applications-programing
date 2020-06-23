
/**
 * 여기에 ColorPoint 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class ColorPoint extends Point
{
    // 인스턴스 변수 - 다음의 예제를 사용자에 맞게 바꾸십시오
    private String color;
    
    public ColorPoint(int x, int y, String color)
    {
        super(x, y);
        this.color = color;
    }

    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     * 
     * @param  y   메소드의 예제 매개변수
     * @return     x 더하기 y 
     */
    public void setColor(String color) // call by referance
    {
        this.color = color;
    }
    
    public void showColorPoint()
    {
        System.out.print(this.color);
        this.showPoint();
    }
}

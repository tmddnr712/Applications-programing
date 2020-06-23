
/**
 * 예제 5-1 : 클래스 상속 만들기 - Point와 
 * 
 * @author (2018210083_노승욱) 
 * @version (2020.06.02)
 */
public class Point
{
    // 인스턴스 변수 - 다음의 예제를 사용자에 맞게 바꾸십시오
    private int x;
    private int y;
    
    public Point()
    {
        this.x = 0;
        this.y = 0;
    }
    
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * 점의 좌표값을 설정하는 메소드
     * 
     * @param  x   점의 x좌표값
     * @param  y   점의 y좌표값
     */
    public void set(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y   메소드에 대한 간단한 매개변수
     * @return     x 와 y의 합
     */
    public void showPoint()
    {
        System.out.println("(" + this.x + " , " + this.y + ")");
    }

}

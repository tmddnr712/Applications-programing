
/**
 * 연습#2 : 사각형들의 면적 합을 계산하기
 * 
 * @author (2018210083_노승욱) 
 * @version (2020.05.22)
 */
public class Rectangle
{
    private double width;
    private double height;

    /**
     * Rectangle 클래스의 객체 생성자
     */
    public Rectangle(double width, double height)
    {
        // 인스턴스 변수의 초기화
        this.width = width;
        this.height = height;
    }

    /**
     * 사각형의 면적을 구하는 메소드
     * 
     * @return     사각형의 면적 값
     */
    public double getArea()
    {
        return this.width * this.height;
    }
}

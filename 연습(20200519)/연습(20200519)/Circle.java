
/**
 * 연습#1 " Circle class"
 * 
 * @author (2018210083_노승욱) 
 * @version (2020.05.19)
 */
public class Circle
{
    // 인스턴스 변수 - 다음의 예제를 사용자에 맞게 바꾸십시오
    private String color;
    private String name;
    private int radius;

    /**
     * Circle 클래스의 객체 생성자, 생성자 이름은 class 이름과 동일
     */
    public Circle(String color, String name, int r) // 생성자는 반드시 public으로 해야 한다. private 절대 불가능
    {
        // 인스턴스 변수의 초기화
        this.color = color; // 지금 만들고 있는 this.객체는 속성 color이다.
        this.name = name;
        this.radius = r;
    }

    /**
     * 원의 면적을 계산
     * 
     * @return     원의 면적
     */
    public double getArea()
    {
        // 여기에 코드를 작성하십시오.
        return 3.14 * this.radius * this.radius;
    }
    
    /**
     * 원의 컬러를 알려주는 메소드
     * 
     * @return     원의 컬러 
     */
    public String getColor()
    {
        // 여기에 코드를 작성하십시오.
        return this.color;
    }
    
    /**
     * 원의 이름을 알려주는 메소드
     * 
     * @return     원의 이름 
     */
    public String getName()
    {
        // 여기에 코드를 작성하십시오.
        return this.name;
    }
}


/**
 * 여기에 MyApp 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyApp
{
    public static void main(String[] args){
        Circle x = new Circle("노란색", "노란색 원", 30);
        System.out.println(x.getName());
        System.out.println(x.getColor());
        double result = x.getArea();
        System.out.println(result);
        
        Circle y = new Circle("빨간색", "빨간색 원", 5);
        System.out.println(y.getName());
        System.out.println(y.getColor());
        double result2 = y.getArea();
        System.out.println(result2);
    }
}

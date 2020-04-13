
/**
 * 원의 면적을 구하는 프로그램.(반지름 = 10.0, pi값 = 3.14)
 * 
 * @author (2018210083 노승욱)
 * @version (2020.03.31)
 */
public class CircleArea
{
    public static void main(String[] args)
    {
        final double PI = 3.14;
        double radius = 10.0;
        double area;
        area = PI * radius * radius;
        
        System.out.println("원의 면적 = " + area);
    }
}

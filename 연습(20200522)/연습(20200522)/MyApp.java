
/**
 * 여기에 MyApp 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyApp
{
    public static void main(String[] args){
        Rectangle rec_1 = new Rectangle(20.0, 15.0);
        Rectangle rec_2 = new Rectangle(5.0, 3.6);
        Rectangle rec_3 = new Rectangle(10.0, 9.0);
        
        System.out.println(rec_1.getArea() + rec_2.getArea() + rec_3.getArea());
    }
}

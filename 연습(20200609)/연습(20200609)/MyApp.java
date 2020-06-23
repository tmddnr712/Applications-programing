
/**
 * 여기에 Myapp 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyApp
{
    public static void paint(Shape s){
        s.draw();
    }
    
    public static void main(String[] args){
        Line line = new Line();
        Rectangle rect = new Rectangle();
        Circle circle = new Circle();
        
        MyApp.paint(line);
        MyApp.paint(rect);
        MyApp.paint(circle);
    }
}

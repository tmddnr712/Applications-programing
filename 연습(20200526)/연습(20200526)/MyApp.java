
/**
 * 여기에 MyApp 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyApp
{
    public static void doArray(Circle[] array){ // formal parameter 가인수
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i].getName());
            System.out.println(array[i].getColor());
            double result = array[i].getArea();
            System.out.println(result);
        }
        
        array[2].setName("홍길동");
    }

    public static void main(String[] args){
        Circle[] array = new Circle[3];

        array[0] = new Circle("노란색", "노란색 원", 30);
        array[1] = new Circle("빨간색", "빨간색 원", 5);
        array[2] = new Circle("파란색", "파란색 원", 20);

        // System.out.println(array[0].getName());
        // System.out.println(array[0].getColor());
        // double result = array[0].getArea();
        // System.out.println(result);

        // System.out.println(array[1].getName());
        // System.out.println(array[1].getColor());
        // result = array[1].getArea();
        // System.out.println(result);

        // System.out.println(array[2].getName());
        // System.out.println(array[2].getColor());
        // result = array[2].getArea();
        // System.out.println(result);

        // for(int i = 0; i < array.length; i++){
        // System.out.println(array[i].getName());
        // System.out.println(array[i].getColor());
        // double result = array[i].getArea();
        // System.out.println(result);
        // }

        // for(Circle circle : array){
        // System.out.println(circle.getName());
        // System.out.println(circle.getColor());
        // double result = circle.getArea();
        // System.out.println(result);
        // }
        
        doArray(array); // actual parameter 실인자
        
        System.out.println(array[2].getName());
        System.out.println(array[2].getColor());
        double result = array[2].getArea();
        System.out.println(result);

    }
}

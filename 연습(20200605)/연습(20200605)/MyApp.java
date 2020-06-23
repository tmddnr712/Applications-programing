
/**
 * 여기에 MyApp 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyApp
{
    public static void main(String[] args){
        Student s = new Student();
        Person p;
        
        
        p = s;
        
        boolean result = s instanceof Student;
        System.out.println(result);
        //Person p = new Student();
        //Student s;
        
        //s = (Student);
        
        
        //s.set();
        //System.out.println(s.age);
    }
}

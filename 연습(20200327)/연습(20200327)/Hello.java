
/**
 * 연습
 * 
 * @author (2018210083 노승욱) 
 * @version (2020.03.27)
 */
public class Hello
{
    public static void main(String[] args)
    {
        int i = 20;
        int s;
        char a;
        
        s = sum(i, 10);
        a = '?';
        System.out.println(a);
        System.out.println("Hello");
        System.out.println(s);
    }
    
    public static int sum(int n, int m)
    {
        return n + m;
    }
}
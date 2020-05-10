
/**
 * 예제 2-3 : 타입 변환
 * 
 * @author (2018210083_노승욱) 
 * @version (2020.05.10)
 */
public class TypeConversion
{
    public static void main(String[] arge){
        byte b = 127;
        int i = 100;
        
        System.out.println(b + i);
        System.out.println(10 / 4);
        System.out.println(10.0 / 4);
        System.out.println((char)0x12340041);
        System.out.println((char)0x12340042);
        System.out.println((byte)(b + i));
        System.out.println((int)2.9 + 1.8);
        System.out.println((int)(2.9 + 1.8));
        System.out.println((int)2.9 + (int)1.8);
    }
}


/**
 * 여기에 ArrayException 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class ArrayException
{
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5};

        try{
            for(int i = 0; i <= 5; i++){
                System.out.println(array[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("에러에유");
        }
    }
}

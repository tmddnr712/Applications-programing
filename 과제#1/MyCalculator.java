import java.util.Scanner;
/**
 * 계산식을 입력 받아서 계산하는 프로그램
 * 
 * @author (2018210083_노승욱) 
 * @version (2020.04.07)
 */
public class MyCalculator
{
    public static void main(String[] args){
        System.out.println("계산식을 입력 하세요~");
        Scanner scan = new Scanner(System.in);
        double n1, n2, result;
        char opt;
        
        n1 = scan.nextDouble();
        opt = scan.next().charAt(0);
        n2 = scan.nextDouble();


        switch(opt){

            case '+':
                result = n1 + n2;
                System.out.printf("%.1f %c %.1f의 계산결과는 %.1f",n1, opt, n2, result);
                break;

            case '-':
                result = n1 - n2;
                System.out.printf("%.1f %c %.1f의 계산결과는 %.1f",n1, opt, n2, result);
                break;

            case '*':
                result = n1 * n2;
                System.out.printf("%.1f %c %.1f의 계산결과는 %.1f",n1, opt, n2, result);
                break;

            case '/':
                result = n1 / n2;
                if(n2 == 0){
                    System.out.println("0으로 나눌 수 없습니다!");
                }
                else{
                    System.out.printf("%.1f %c %.1f의 계산결과는 %.1f",n1, opt, n2, result);
                }
                break;

            default:
                System.out.println("오류입니다.");
        }
    }
}

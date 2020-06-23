import java.util.Scanner;
/**
 * 여기에 MyApp 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyApp
{
    public static void main(String[] args){
        //----A----
        Scanner input = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하시오>>");
        int operand1 = input.nextInt();
        int operand2 = input.nextInt();
        String operator = input.next();

        //----B----
        Calc object;
        int result = 0;
        switch(operator){
            case "+":
                     object = new Add();
                     object.setValue(operand1, operand2);
                     result = ((Add)object).calculate();
                     break;
            case "-": 
                     object = new Sub();
                     object.setValue(operand1, operand2);
                     result = ((Sub)object).calculate();
                     break;
            case "*": 
                     object = new Mul();
                     object.setValue(operand1, operand2);
                     result = ((Mul)object).calculate();
                     break;
            case "/": 
                     object = new Div();
                     object.setValue(operand1, operand2);
                     result = ((Div)object).calculate();
                     break;
        }
        
        //----D----
        System.out.println(result);
    }
}

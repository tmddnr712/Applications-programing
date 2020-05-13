import java.util.Scanner;
/**
 * 시험문제지 맞추기
 * 
 * @author (2018210083_노승욱) 
 * @version (2020.05.12)
 */
public class MyMidTestSheet
{
    public static void main(String[] args){
        char[] sheet = {'A', 'B', 'C', 'A', 'B', 'C'};
        Scanner input = new Scanner(System.in);
        
        System.out.print("Your Student Number: ");
        int yourStudentNumber = input.nextInt();
        int id = yourStudentNumber % 3;
        char yourSheet = 'A';
        
        try{
            switch(id){
                case 1 :
                        yourSheet = sheet[id++];
                        break;
                case 2 :
                        yourSheet = sheet[++id];
                        break;
                case 3 :
                        yourSheet = sheet[id--];
                        break;
                default :
                        yourSheet = sheet[--id];
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            yourSheet = sheet[5];
        }
        finally{
            System.out.println(yourSheet);
        }
    }
}

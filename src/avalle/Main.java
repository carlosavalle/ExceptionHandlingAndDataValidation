package avalle;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int  num1,num2 = 0;
        Boolean loop = true;
        float result = 0;
        while (loop) {
            try {

                //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                Scanner input = new Scanner( System.in );
                //

                System.out.print("Enter the first number: \n");
                num1 = input.nextInt();
                //num1 = Integer.parseInt(br.readLine());

                System.out.print("Enter the second number: \n");
                num2 = input.nextInt();
                //num2 = Integer.parseInt(br.readLine());
                result = doDivision(num1, num2);

                loop =false;

            }catch (InputMismatchException ime) {
                System.out.println("Please, enter a valid number \n");
            } catch (ArithmeticException e) {
                System.out.println("It is not possible to division by zero \n");
            } finally {
                if (loop){
                    System.out.println("Please, try it again \n");
                }else{
                    System.out.println("The result is: " + result);
                }

            }
        }
    }

    public static float doDivision(int num1, int num2) throws ArithmeticException{
        float division ;
        if (num2 !=0) {
            division= (float) num1 / num2;
        }else{
            //division= num1/num2;
            throw (new ArithmeticException());
        }
          return division;
    }
}

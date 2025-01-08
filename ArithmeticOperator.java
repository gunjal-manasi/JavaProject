
import java.util.Scanner;
public class ArithmeticOperator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second Number: ");
        int num2 = sc.nextInt();
        int add = num1+num2;
        int sub = num1-num2;
        int mul = num1 * num2;
        int div = num1/num2;
        System.out.println("The Addition is: "+add);
        System.out.println("The Substraction is: "+sub);
        System.out.println("The multiplication is: "+mul);
        System.out.println("The division is: "+div);
        sc.close();
    }
    
}

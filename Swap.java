import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();
        //int var=num1;
        //num1=num2;
        //num2=var;
        //System.out.println("After swap first number"+num1);
        //System.out.println("After swap first number"+num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After swap first number"+num1);
        System.out.println("After swap first number"+num2);
        sc.close();
    }
}

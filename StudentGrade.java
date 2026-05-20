import java.util.Scanner;
public class StudentGrade {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Grade:");
        int num=sc.nextInt();

        if(num>90)
            System.out.println("A");
        else if(num>=75 &&num<=89)
            System.out.println("B");
        else if(num>=50 && num<=74)
            System.out.println("C");
        else
            System.out.println("Fail");
        sc.close();
    }
}

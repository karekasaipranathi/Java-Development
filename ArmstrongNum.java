import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number");
    int num=sc.nextInt();
    int original=num;
    double arm=0;
    int temp=num;
    int count=0;
    while(temp!=0){
        count++;
        temp=temp/10;
    }
    while(num!=0){
        int digit=num%10;
        arm=arm+Math.pow(digit,count);
        num=num/10;

    }
    if(arm==original)
        System.out.println("Armstrong number");
    else
        System.out.println("Not an Armstrong number");
  
    sc.close();
    }
}

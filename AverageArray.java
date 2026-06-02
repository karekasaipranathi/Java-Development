import java.util.Scanner;
public class AverageArray {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of array elements");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
            
        }
        double avg=(double)sum/n;
        System.out.println(avg);
        sc.close();
    }
}

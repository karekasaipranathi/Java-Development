import java.util.Scanner;
public class EvenOddArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of array elements");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        int arr[]=new int[n];
        int Ecount=0;
        int Ocount=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0)
                Ecount++;
            else
                Ocount++;
        }
        System.out.println(Ecount);
        System.out.println(Ocount);
        sc.close();
    }
}

import java.util.Scanner;
public class SecondLargestInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int largest=Math.max(arr[0],arr[1]);
        int secondlargest=Math.min(arr[0],arr[1]);
        for(int i=2;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]!=largest && arr[i]>secondlargest)
                secondlargest=arr[i];
        }
        System.err.println(secondlargest);
        sc.close();
    }
}

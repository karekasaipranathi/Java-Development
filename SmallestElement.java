import java.util.Scanner;
public class SmallestElement {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements");
    int n=sc.nextInt();
    System.out.println("Enter the elements");
    int arr[]=new int[n];
    arr[0]=sc.nextInt();
    int smallest=arr[0];
    for(int i=1;i<arr.length;i++){
        arr[i]=sc.nextInt();
        
        if(arr[i]<smallest)
            smallest=arr[i];

    }
    System.out.println(smallest);
    sc.close();
    }
}


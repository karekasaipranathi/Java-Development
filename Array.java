public class Array {
    public static void main(String args[])
    {
        int nums[]={3,4,5};
        System.out.println(nums[2]);
        nums[2]=6;
        System.out.println(nums[2]);
        //dynamic_array
        int num[]=new int[4];
        num[0]=2;
        num[1]=3;
        num[2]=4;
        num[3]=5;
        for(int i=0;i<4;i++){
            System.out.println(num[i]);
        }

    }
}

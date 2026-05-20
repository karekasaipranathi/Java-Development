public class Math_inArray {
    public static void main(String args[])
    {
        int num[][]=new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                num[i][j]=(int)(Math.random()*10);
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
        //jagged Array
        int num1[][]=new int[3][];
        num1[0]=new int[4];
        num1[1]=new int[3];
        num1[2]=new int[2];
        for(int i=0;i<num1.length;i++)
        {
            for(int j=0;j<num1[i].length;j++)
            {
                num1[i][j]=(int)(Math.random()*10);
            }
        }
        for(int n1[] : num1){
            for(int m1:n1){
                System.out.print(m1+" ");
            }
            System.out.println();
        }
    }
}

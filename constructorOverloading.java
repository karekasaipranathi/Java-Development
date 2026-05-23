class Co{
    Co(){
        int a=5,b=10,c;
        c=a+b;
        System.out.println("Sum="+c);
    }
    Co(int x,int y){
        int a=x;
        int b=y;
        int c=a+b;
        System.out.println("Sum="+c);
    }
}
public class constructorOverloading {
    public static void main(String[] args) {
        Co obj=new Co();
        Co obj1=new Co(20,40);
    }
}

class Calc{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
}
class AdvcCalc extends Calc{
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a%b;
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        AdvcCalc obj=new AdvcCalc();
        int r1=obj.add(40,20);
        int r2=obj.sub(20,15);
        int r3=obj.mul(3,5);
        int r4=obj.div(15,4);
        System.out.println(r1 +" "+r2 +" "+r3+" "+r4);
    }
}

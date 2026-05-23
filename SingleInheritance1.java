class Calc{
    int a=10,b=15,c;
    public void add(){
        c=a+b;
        System.out.println("Addition="+c);

    }
}
class AdvcCalc extends Calc{
    public void sub(){
        c=a-b;
        System.out.println("Subtraction="+c);
    }
}
public class SingleInheritance1 {
    public static void main(String[] args) {
        AdvcCalc obj=new AdvcCalc();
        obj.add();
        obj.sub();
    }
}

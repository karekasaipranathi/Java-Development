class Base{
    int a=10,b=15,c;
    public void add(){
        c=a+b;
        System.out.println("Addition="+c);

    }
}
class Intermediate extends Base{
    public void sub(){
        c=a-b;
        System.out.println("Subtraction="+c);
    }
}
class Derived extends Intermediate{
    public void mul(){
        c=a*b;
        System.out.println("Multiplication="+c);
    }
}
public class MultilevelInheritance {
        public static void main(String[] args) {
        Derived obj=new Derived();
        obj.add();
        obj.sub();
        obj.mul();
    }
}


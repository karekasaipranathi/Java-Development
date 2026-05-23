class Base{
    int a=10,b=15,c;
    public void add(){
        c=a+b;
        System.out.println("Addition="+c);

    }
}
class Derived extends Base{
    public void sub(){
        c=a-b;
        System.out.println("Subtraction="+c);
    }
}
class Derived1 extends Derived{
    public void mul(){
        c=a*b;
        System.out.println("Multiplication="+c);
    }
}
class Derived2 extends Derived{
    public void div(){
        c=a/b;
        System.out.println("Division="+c);
    }
}
public class HybridInheritance {
        public static void main(String[] args) {
            Derived1 obj1=new Derived1();
            Derived2 obj2=new Derived2();
            obj1.add();
            obj1.sub();
            obj1.mul();
            obj2.add();
            obj2.div();


    }
}


class Base{
    int a=10,b=15,c;
    public void add(){
        c=a+b;
        System.out.println("Addition="+c);

    }
}
class Derived1 extends Base{
    public void sub(){
        c=a-b;
        System.out.println("Subtraction="+c);
    }
}
class Derived2 extends Base{
    public void mul(){
        c=a*b;
        System.out.println("Multiplication="+c);
    }
}
public class HierarchicalInheritance {
        public static void main(String[] args) {
            Derived1 obj1=new Derived1();
            Derived2 obj2=new Derived2();
            obj1.add();
            obj1.sub();
            obj2.add();
            obj2.mul();

    }
}



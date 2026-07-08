interface A{
    int age=20;  //final or static
    abstract void show();
    abstract void display();
}
class B implements A{
    public void show(){
        System.out.println("Hello");
    }
    public void display(){
        System.out.println("Hi");
    }
}
public class Interface {
    public static void main(String args[]){
        B obj=new B();
        obj.show();
        obj.display();
        System.out.println(A.age);
    }
}

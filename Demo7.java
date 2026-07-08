abstract class Computer {
    public abstract void code();
}
class Laptop extends Computer{
    public void code(){
        System.out.println("code,compile,run");
    }
}
class Desktop extends Computer{
    public void code(){
        System.out.println("code,compile,run Faster");
    }
}
class Developer{
    public void devapp(Computer lap){
        lap.code();
    }
}
public class Demo7 {
    public static void main(String args[]){
        Computer lap=new Laptop(); 
        Computer desk =new Desktop();
        Developer jessy=new Developer();
        jessy.devapp(lap);
        jessy.devapp(desk);
    }
}
interface Computer {
    public abstract void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("code,compile,run");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("code,compile,run Faster");
    }
}
class Developer{
    public void devapp(Computer lap){
        lap.code();
    }
}
public class Interface1 {
    public static void main(String args[]){
        Computer lap=new Laptop(); 
        Computer desk =new Desktop();
        Developer jessy=new Developer();
        jessy.devapp(lap);
        jessy.devapp(desk);
    }
}

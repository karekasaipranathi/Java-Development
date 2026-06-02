class Calc  {
    public final void show(){
        System.out.println("By Thyme");
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
}
class AdvCalc extends Calc{
    public void show(){
        System.out.println("By Kevin");
    }
}
public class FinalAtMethod {
    public static void main(String args[]){
        AdvCalc obj=new AdvCalc();
        obj.show();
        obj.add(5, 8);
    }
}


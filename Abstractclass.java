 abstract class Car{
    public abstract void drive();
    public void playmusic(){
        System.out.println("Playing Music....");
    }
}
class WagonR extends Car{
    public void drive(){
        System.out.println("Driving...");
    }
}
public class Abstractclass {
    public static void main(String args[]){
        WagonR obj=new WagonR();
        obj.drive();
        obj.playmusic();
    }
}

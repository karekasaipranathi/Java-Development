class Mobile{
    String brand;
    int price;
    static String name;
    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }
    public static void show1(Mobile obj){
        System.out.println(obj.brand+" : "+obj.price+" : "+name);
    }
}
public class StaticMethod {
    
    public static void main(String[] args) {
        Mobile obj=new Mobile();
        obj.brand="Apple";
        obj.price=1500000;
        Mobile.name="SmartPhone";
        Mobile obj1=new Mobile();
        obj1.brand="Samsung";
        obj1.price=2500000;
        Mobile.name="SmartPhone";
        Mobile.name="Phone";
        obj.show();
        obj1.show();
        Mobile.show1(obj);
    }
}

    


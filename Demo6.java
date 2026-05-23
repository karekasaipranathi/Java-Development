class Mobile{
    String brand;
    int price;
    String name;

    void show(){
        System.out.println(brand +" : "+ price +" : " +name);
    }
}
public class Demo6 {
    public static void main(String args[]){
        Mobile obj= new Mobile();
        obj.brand="IPhone";
        obj.name="SmartPhone";
        obj.price=1500000;
        Mobile obj1=new Mobile();
        obj1.brand="Samsung";
        obj1.name="SmartPhone";
        obj1.price=20000000;
        obj.show();
        obj1.show();

    }
}

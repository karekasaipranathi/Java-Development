class Human{
    private int age=19;
    private String name = "jessy";
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    
}
public class Demo2 {
    public static void main(String[] args) {
        Human obj=new Human();
       System.out.println(obj.getAge());
       System.out.println(obj.getName());
    }
}

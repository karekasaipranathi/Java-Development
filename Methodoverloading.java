class Demo{
    public void add(int num1,int num2)
    {
        System.out.println(num1+num2);
    }
    public void add(int num1,int num2,int num3)
    {
        System.out.println(num1+num2+num3);
    }
    public void add(double num1,double num2)
    {
        System.out.println(num1+num2);
    }
}
public class Methodoverloading {
    public static void main(String args[])
    {
        Demo obj=new Demo();
        obj.add(10,20);
        obj.add(10,20,30);
        obj.add(2.5,10.5);
    }
}

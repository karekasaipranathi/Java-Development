class Method {
    public void playmusic()
    {
        System.out.println("Music is Playing...");
    }
    public String getMeAPen(int cost)
    {
        if(cost>=10)
            return "Pen";
        else
            return "None";
    }
}
public class Demo1
{
    public static void main(String args[])
    {
        Method obj=new Method();
        obj.playmusic();
        String str=obj.getMeAPen(10);
        System.out.println(str);
    }
}

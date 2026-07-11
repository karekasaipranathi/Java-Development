enum Laptop{
    Macbook(2000),Dell(2200),Surface(3000),Lenovo(3300);
    
    private int price;


    
    private Laptop(int price) {
        this.price = price;
    }
    


public int getPrice() {
        return price;
    }



    public void setPrice(int price) {
        this.price = price;
    }
}


public class Enum3 {
    public static void main(String args[]){
        //Laptop lap=Laptop.Dell;
        //System.out.println(lap+" : "+lap.getPrice());
        for(Laptop lap: Laptop.values())
        {
            System.out.println(lap+" : "+lap.getPrice());
        }
    }
}


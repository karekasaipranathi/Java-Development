public class stringbuffer {
    public static void main(String args[]){
        StringBuffer sd=new StringBuffer("Hello ");
        System.out.println(sd);
        System.out.println(sd.capacity());
        System.out.println(sd.length());
        sd.append(" World! ");
        System.out.println(sd);
        sd.insert(6," Beautiful");
        System.out.println(sd);
        sd.delete(6, 16);
        System.out.println(sd);
        sd.reverse();
        System.out.println(sd);
        sd.setLength(30);
        
    }
}

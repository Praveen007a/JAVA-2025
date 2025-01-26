class Mobile{
    static String name;
    int price;
    String brand;
    
    public Mobile(){
        System.out.println("Constructor called");
    }
    public void show(){
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Brand: "+brand);
    }
    public static void show1(){
        System.out.println(" static Name: ");
    }
    static{
        System.out.println("Static block");
    }

}
public class Demo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Mobile");
        // Mobile m1 = new Mobile();
        // m1.name="phone";
        // m1.price=10000;
        // m1.brand="Samsung";

        // m1.show();

        // Mobile m2 = new Mobile();
        // m2.name = "nothing";
        // m2.price=10000;
        // m2.brand="iphone";        
        // m2.show();

        // Mobile.show1();


    }
}

// encapsulation
class Human{
    private String name;
    private int age;

    public int getAge(){
        return age;
    }


    public void setAge(int a){
        age = a;
    }
    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
    public Human(){
        name="Praveeen";
        age=22;
    }
    public Human(String name, int age){
        this.name= name;
        this.age = age;
    }
}

public class Oops{
    public static void main(String[] args){
        Human h1 = new Human();
        Human h2 = new Human("TP", 21);
        // h1.setAge(22);
        // h1.setName("Pravveen");
        System.out.println(h1.getName() +" "+ h1.getAge());
        System.out.println(h2.getName() +" "+ h2.getAge());

    }
}
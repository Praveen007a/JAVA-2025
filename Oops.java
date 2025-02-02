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

class A{
    
    public void show(){
        System.out.println("Show in A");
    }
}
class B extends A{
    
    public void show(){
        System.out.println("Show in B");
    }
}

public class Oops{
    public static void main(String[] args) throws InterruptedException{
        // Human h1 = new Human();
        // Human h2 = new Human("TP", 21);
        // h1.setAge(22);
        // h1.setName("Pravveen");
        // System.out.println(h1.getName() +" "+ h1.getAge());
        // System.out.println(h2.getName() +" "+ h2.getAge());

        //annonymous class
        //  B obj = new B(){
        //     public void show(){
        //         System.out.println("In new Show");
        //     }
        //  };
        //  obj.show();
    
        // abstract
        // Jeep c1 =  new Jeep();
        // c1.drive();
        // c1.playMusic();
        // c1.sunRoof();

        // inner class
        // OuterClass outer = new OuterClass();

        // OuterClass.InnerClass inner = outer.new InnerClass();
        // inner.checkAge();

        // Avoid creating object of abstract class
        // Car car  = new Car(){
        //     public  void drive(){
        //         System.out.println("Driving Car");
        //     }
        // };
        // car.drive();

        // Interface
        // System.out.println(inter1.name +" " +inter1.age);
        // inter1 tp = new inter1(){
        //     public void show(){
        //         System.out.println("Show");
        //     }
        //     public void config(){
        //         System.out.println("Config");
        //     }
        // };
        //  tp.show();
        //  tp.config();

        // enums

        // Status[] s = Status.values();
        
        // for(Status st : s){
        //     System.out.println(st + " " + st.ordinal());
        // }

        Status s = Status.Success;

        // switch(s){
        //     case Running:
        //         System.out.println("All Working fine...");
        //         break;
        //     case Pending:
        //         System.out.println("Works are Pending...");
        //         break;
        //     case Success:
        //         System.out.println("All Works are Done...");
        //         break;
        //     case Failed:    
        //         System.out.println("Some Works are Failed...");
        //         break;
        //     default:
        //         System.out.println("Invalid Status...");
        // }

        // Functional Interface

        // Tp tp =  (a,b) ->{return a+b;};

        // System.out.println(tp.add(10,20));

        // Threads and Runnable


        // Runnable  t1 = new Thread1();
        // Runnable  t2 = new Thread2();

        // Thread th1 = new Thread(t1);
        // Thread th2 = new Thread(t2);

        // th1.start();
        // th2.start();

        // race condition

        Demo0 d = new Demo0();
        Runnable r1 = new Demo1();
        Runnable r2 = new Demo2();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        System.out.println(d.count);
    }
} 
// Abstract methods and classes

abstract class Car{
    public abstract void drive();

    public void playMusic(){
        System.out.println("Playing Music while driving...");
    }
}

class Jeep extends Car{

    public void drive(){
        System.out.println("Driving Jeep");
    }
    public void sunRoof(){
        System.out.println("Sunroof is Available");
    }
}

// Inner Class

class OuterClass{
    int age = 10;

    public void show(){
        System.out.println(age);
    }

    class InnerClass{
        public void checkAge(){
            if(age>18){
                System.out.println("You're a Major");
            }
            else{
                System.out.println("you're a minor");
            }
        }
    }
}

// Interfaces

interface inter1{
    int age= 22;
    String name = "Praveen";
    void show();
    void config();
}

// class UseInterface implements inter1{
//     public void show(){
//         System.out.println("Show");
//     }
//     public void config(){
//         System.out.println("Config");
//     }
// }

// Enums

enum Status{
    Running,Success,Failed,Pending;
}

// Functional Interface
@FunctionalInterface
interface Tp{

    int add(int a, int b);
}

// Threads ans Runnable

class Thread1 implements Runnable{ 
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread 1");
            try{
                Thread.sleep(10);
            }
            catch(Exception e){
                System.out.println("Erros...");
            }
            
        }
    }
}

class Thread2 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread 2");
        }
    }
}

//Race condition --> when two threads are trying to access the same resource at the same time.(Syncronization)
class Demo0{
    int count;
    public void increment(){
        count=count+1;
    }
} 

class Demo1 implements Runnable{
    Demo0 d = new Demo0();
    public void run(){
        for(int i=0;i<500;i++){
            d.increment();
        }
    }
}
class Demo2 implements Runnable{
    Demo0 d = new Demo0();
    public void run(){
        for(int i=0;i<500;i++){
            d.increment();
        }
    }
}
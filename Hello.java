import java.util.Scanner;

class Calc{
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a,int b, int c){
        return a+b+c;
    }
    public double add (int a,double b){
        return a+b;
    }
}
class Student{
    int no;
    String name;
    int marks;
}
public class Hello{
    public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("hello World !");

    //     Calc obj = new Calc();
    //    int ans= obj.add(10,20);
    //    System.out.println(ans);
    //    System.out.println(obj.add(10,20,30));
    //    System.out.println(obj.add(10,20));
    //    System.out.println(obj.add(10,20.7));

    //     for(int i=0;i<10;i++){
    //         System.out.println(i);
    //     }   

    //     int num = sc.nextInt();

    //     System.out.println(num%2==0 ? "Even"  : "Odd");
    //     int n= sc.nextInt();

    //      switch(n){
    //         case 1:
    //             System.out.println("Sunday");
    //             break;
    //             case 2:
    //             System.out.println("Monday");
    //             break;
    //             case 3:
    //             System.out.println("Tuesday");
    //             break;
    //             case 4:
    //             System.out.println("Wednesday");
    //             break;
    //             case 5:
    //             System.out.println("Thursday");
    //             break;
    //             case 6:
    //             System.out.println("Friday");
    //             break;
    //             case 7:
    //             System.out.println("Saturday");
    //             break;

    //             default:
    //             System.out.println("Invalid Input");
    //     }

        //Multi dimension array
        int [][] arr = new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("Random numbers");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]= (int) (Math.random() *100);
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        
        //enhanced for loop to print 2d array

        for(int a[] :arr){
            for(int m:a){
                System.out.print(m+" ");
            }
            System.out.println();
        }

        //Array of Objecst
        Student s1 = new Student();
        s1.no=1;
        s1.name="TP";
        s1.marks=(int) (Math.random()*100);

        Student s2 = new Student();
        s2.no=2;
        s2.name="PK";
        s2.marks=(int) (Math.random()*100);;

        Student s3 = new Student();
        s3.no=3;
        s3.name="Rahul";
        s3.marks=(int) (Math.random()*100);;
        Student students[] = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3; 

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name +  " " + students[i].marks);
        }
        System.out.println("Enhanced for loop");

        for(Student stu:students){
            System.out.println(stu.no + " " + stu.name + " " + stu.marks);
        }

        //String

        String name = "Praveen D";
        name=name +"Uchiha TP";
        System.out.println(name.hashCode()+ " " + name);
        // sc.close();
    }
}
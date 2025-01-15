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
public class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("hello World !");

        Calc obj = new Calc();
       int ans= obj.add(10,20);
       System.out.println(ans);
       System.out.println(obj.add(10,20,30));
       System.out.println(obj.add(10,20));
       System.out.println(obj.add(10,20.7));

        for(int i=0;i<10;i++){
            System.out.println(i);
        }   

        int num = sc.nextInt();

        System.out.println(num%2==0 ? "Even"  : "Odd");
        int n= sc.nextInt();

         switch(n){
            case 1:
                System.out.println("Sunday");
                break;
                case 2:
                System.out.println("Monday");
                break;
                case 3:
                System.out.println("Tuesday");
                break;
                case 4:
                System.out.println("Wednesday");
                break;
                case 5:
                System.out.println("Thursday");
                break;
                case 6:
                System.out.println("Friday");
                break;
                case 7:
                System.out.println("Saturday");
                break;

                default:
                System.out.println("Invalid Input");
        }

        sc.close();
    }
}
// Java-8 stream API
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Adv {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 =s1.filter(n-> n%2 ==0);
        // Stream<Integer> s3 = s2.map(n-> n*2);
        // int result = s3.reduce(0,(c,e)->c+e);

        // make it one line
        int result = nums.stream().filter(n->n%2==0).map(n->n*2).reduce(0,(c,e)->c+e);

        // s3.forEach(n -> System.out.print(n + " "));
        System.out.println(result);

        //  Print all the numbers -->3 Ways

        // 1. Using for loop

        // for(int i=0;i<nums.size();i++){
        //     System.out.println(nums.get(i));
        // }

        // 2. Using for each loop
        // nums.forEach(n->System.out.println(n));

        // 3.Enhanced for loop
        
        // int sum=0;
        // for(int n:nums){
        //     if(n%2==0){
        //         n= n*2;
        //         sum=sum+n;
        //     }
        // }
        // System.out.println(sum);

        // parallel stream

        int size= 10000;
        List<Integer> numbers = new ArrayList<>(size);
        Random ran = new Random();
        
        for(int i=0;i<size;i++){
            numbers.add(ran.nextInt(100));
        }

        // System.out.println(numbers);

        // normal stream time taken
        long start2 = System.currentTimeMillis();
        long ans1 = numbers.stream().map(n->{
            try{
                Thread.sleep(1); 
            }
            catch(Exception e){}

            return n*2;
        }).mapToInt(i->i).sum();
        System.out.println(ans1);
        long end2 = System.currentTimeMillis();

        // parallel stream time taken
        long start1 = System.currentTimeMillis();
        long ans = numbers.parallelStream().map(n->n*2).reduce(0,(c,e)->c+e);
        System.out.println(ans);
        long end1 = System.currentTimeMillis();

        System.out.println("Time taken by stream: "+(end2-start2));
        System.out.println("Time taken by parallel stream: "+(end1-start1));

    }
}

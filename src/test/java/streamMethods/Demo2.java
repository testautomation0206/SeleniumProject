package streamMethods;



import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo2 {
    public static void main(String args[]){
      List<Integer> numbersList =   Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numbersList.stream().filter(num -> num%2==0).forEach(System.out::println);
        long numberOfEvennumbers = numbersList.stream().filter(num -> num%2==0).count();
        System.out.println(numberOfEvennumbers);
        /*: Use Optional to lower the amount of null pointer exceptions and account for times when returned values are empty or missing*/
        Optional<Integer> min =numbersList.stream().min((val1, val2)->{
            return val1.compareTo(val2);
        });
        System.out.println("Minimum value"+min.get());
        Optional<Integer> Max = numbersList.stream().max((val1,val2)->{
            return val1.compareTo(val2);
        });
        System.out.println("Maximum value"+Max.get());
        //Reduce
        List<String> sList =   Arrays.asList("kc","Dv");
        Optional<String> reduced = sList.stream().reduce((value, combinedvalue)->{
            return value+combinedvalue;
        });
        System.out.println(reduced.get());
        Object Arr[] =  sList.stream().toArray();
        System.out.println(Arr.length);
        for(Object v:Arr){
            System.out.println(v);
        }
    }
}

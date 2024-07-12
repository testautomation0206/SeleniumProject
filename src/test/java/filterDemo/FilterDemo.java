package filterDemo;
//Streams API
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
    public static void main(String args[]){
        List<Integer> numbers = Arrays.asList(10,15,20,25,30);
        List<Integer> EvenNumbers =new ArrayList<Integer>() ;
        //filter Even number collection with out using streams
        for(int n:numbers){
            if(n%2==0){
                EvenNumbers.add(n);

            }

    }
        //System.out.println(EvenNumbers);
        //Above scenario with streams

        //filter methods takes predicate means ..we should pass arg and apply condition it return boolen value
    //foreach method is taking consumer value means it does n't return anything
        //below is the expression to filter and store value from one collection to another
    EvenNumbers = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(EvenNumbers);
    //numbers.stream().filter(n->n%2==0).forEach(n-> System.out.println(n));
        //numbers.stream().filter(n->n%2==0).forEach(System.out::println);
    }

}

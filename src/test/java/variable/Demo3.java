package variable;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Demo3 {
 public static void main(String args[]){
     List<String> stringList = Arrays.asList("Divya","KC");
     Optional<String> ele = stringList.stream().findAny();
     System.out.println(ele.get());
     Optional<String> ele1 = stringList.stream().findFirst();
     System.out.println(ele1.get());
     List<String>list1 =Arrays.asList("kc","DV","MA","RU");
     List<String> list2 = Arrays.asList("DR","KM");
     Stream<String> stream1 = list1.stream();
     Stream<String> stream2 = list2.stream();
     List<String> finalList = Stream.concat(stream1,stream2).collect(Collectors.toList());
     System.out.println("*********************"+finalList);
     for(String item:finalList){
         System.out.println("*********************"+item);
     }
 }

}

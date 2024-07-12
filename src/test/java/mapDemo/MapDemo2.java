package mapDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo2 {
    public static void main(String args[]){
        List<Integer> numbers = Arrays.asList(2,3,4,5);
        List<Integer> numbersMultipledBy3 = new ArrayList<Integer>();
      /*  for(int n :numbers){
            //System.out.println(n*3);
            numbersMultipledBy3.add(n*3);
        }
        System.out.println(numbersMultipledBy3);*/
        //numbers.stream().map(n->n*3).forEach(System.out::println);
        numbers.stream().map(n->n*3).forEach(n-> System.out.println(n));

        numbersMultipledBy3=numbers.stream().map(n->n*3).collect(Collectors.toList());
        //System.out.println(numbersMultipledBy3);

    }


}

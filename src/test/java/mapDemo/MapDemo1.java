package mapDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
    public static void main(String args[]){
        //with out using streams concept
        List<String> vehicles = Arrays.asList("bus","car","bicycle","flight","train");
        List<String> vehiclesListInToUpperCase = new ArrayList<String>();
        /*for(String v:vehicles){
            vehiclesListInToUpperCase.add(v.toUpperCase());
        }*/
        //covert to uppercase ---with streams map(Map will do certain operaion on existing collection and collect it to new collection)
        vehiclesListInToUpperCase = vehicles.stream().map(v->v.toUpperCase()).collect(Collectors.toList());
        System.out.println(vehiclesListInToUpperCase);
        //vehicles.stream().map(v->v.toUpperCase()).forEach(System.out::println);
        //Find length of every element in the list
        //with out streams
        /*for(String v:vehicles){
            System.out.println(v.length());
        }*/
        vehicles.stream().map(v->v.length()).forEach(System.out::println);

        //Flat map maps complex data from collection

    }


}

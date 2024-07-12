package streamMethods;

import java.util.*;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String args[]){
       List<String> vehicleList =  Arrays.asList("bus","car","bycle","bike","car");
       List<String>vehicledistinctVehicles = vehicleList.stream().distinct().collect(Collectors.toList());
        System.out.println(vehicledistinctVehicles);
        vehicleList.stream().distinct().forEach(System.out::println);
        long  Vehclescount = vehicleList.stream().distinct().count();
        System.out.println(Vehclescount);
        vehicleList.stream().limit(3).forEach(System.out::println);

    }
}

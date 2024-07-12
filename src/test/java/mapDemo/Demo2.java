package mapDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String args[]){
        List<String> teamA = Arrays.asList("Divya","Rukmabatla");
        List<String> teamB = Arrays.asList("KC","Mamunuru");
        //below return mutliple collections
        List<List<String>> Playersinworldcup = Arrays.asList(teamA,teamB);
        List<String> finalplayerList =Playersinworldcup.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println(finalplayerList);
        List<String> finalplayerList1 =Playersinworldcup.stream().flatMap(x->x.stream().map(y->y.toUpperCase())).collect(Collectors.toList());
        System.out.println(finalplayerList1);
    }

}

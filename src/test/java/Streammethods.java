import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streammethods {
    public static void main(String args[]){
        List<Integer> list1 = Arrays.asList(2,6,4,5,7,1,3);
        List<Integer> SortedList = list1.stream().sorted().collect(Collectors.toList());
        System.out.println(SortedList);
        List<Integer> ReverseSortedList = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(ReverseSortedList);
        List<String> ListOfStrings = Arrays.asList("Divya","KC","School");
        List<String> ReverseListOfStrings = ListOfStrings.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(ReverseListOfStrings);


    }
}

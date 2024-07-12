import java.util.HashSet;
import java.util.Set;

public class Demo2 {
    public static void main(String args[]){
        Set<String> fruites = new HashSet<>();
        fruites.add("one apple");
        fruites.add("one Mango");
        fruites.add("Two apples");
        fruites.add("More grapes");
        fruites.add("Two guavas");
        boolean result =  fruites.stream().anyMatch(value->
        {
            return value.startsWith("one");
        });
        //atleast one element should match with condition
        System.out.println("Anymatch     "+result);
        boolean AllmatchResult =  fruites.stream().allMatch(value->
        {
            return value.startsWith("one");
        });
        //All elements should match with condition
        System.out.println("Allmatch  "+AllmatchResult);
        boolean nonmatchResult = fruites.stream().noneMatch(value->{
            return value.startsWith("one");
        });
       //None of the elements are matching will return true in the above collection 2 are matching with one so it is returning false
        System.out.println("nonmatchResult"+nonmatchResult);
    }
}

package filterDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
    public static void main(String args[]){
        List<String> names = Arrays.asList("Divya","Chaitanya","Rukmabatla","Mamunuru");
        List<String> longnames = new ArrayList<String>();
      // longnames =   names.stream().filter(str->str.length()>9 && str.length()<11).collect(Collectors.toList());
      // names.stream().filter(str-> str.length()>4&&str.length()<6).forEach(str->System.out.println(str));
       names.stream().filter(str->str.length()>4&&str.length()<6).forEach(System.out::println);
       // System.out.println(longnames);

    }
}

/*filter,Map,Flat map ,distint and limit are the non terminal (collection processing)methods which return group of  objects in the form of streams */
/*collect,count,max,min,forEach,forEach,toArray are the non terminal methods*/

package mapDemo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
     int empid;
     String empName;
     int salary;
     Employee(int empid,String empName,int salary){
         this.empid = empid;
         this.empName = empName;
         this.salary = salary;
     }
 }

public class Demo3_Filter_Map {
     public static void main(String args[]){
         List<Employee> employeesList = Arrays.asList(new Employee(101,"Divya",10000),new Employee(102,"KC",20000));
         List<Integer> Salariesmorethan10k = new ArrayList<Integer>();
         //Filter salary greater than 10000 and collect the collection with map to another collection
         Salariesmorethan10k = employeesList.stream().filter(e->e.salary>10000)
                 .map(e->e.salary)
                 .collect(Collectors.toList());
         System.out.println(Salariesmorethan10k);

     }
}

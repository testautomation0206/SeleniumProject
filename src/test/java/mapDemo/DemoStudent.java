package mapDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    String sname;
    int sid;
    char grade;

    Student(String sname, int sid, char grade) {
        this.sname = sname;
        this.sid = sid;
        this.grade = grade;
    }
}
    public class DemoStudent {
        public static void main(String args[]) {
            //List<Student> studentList = new ArrayList<Student>();
            List<Student> studentList = Arrays.asList(new Student("Divya",101,'A'),new Student("KC",102,'B'));
            List<Student> studentList1 = Arrays.asList(new Student("Sai",100,'A'),new Student("Ram",102,'B'));
            List<List<Student>> studentsList = Arrays.asList(studentList,studentList1);
            List<String> namesList = studentsList.stream()
                    .flatMap(s->s.stream())
                    .map(s->s.sname)
                    .collect(Collectors.toList());
            System.out.println(namesList);
        }
    }

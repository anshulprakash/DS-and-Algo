// AnyMatch method returns true if any elements of the Stream matches the given predicate.

import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;
class Student{
   int stuId;
   int stuAge;
   String stuName;
   Student(int id, int age, String name){
      this.stuId = id;
      this.stuAge = age;
      this.stuName = name;
   }
   public int getStuId() {
      return stuId;
   }
   public int getStuAge() {
      return stuAge;
   }
   public String getStuName() {
      return stuName;
   }
   public static List<Student> getStudents(){
       List<Student> list = new ArrayList<>();
       list.add(new Student(11, 28, "Lucy"));
       list.add(new Student(28, 27, "Kiku"));
       list.add(new Student(32, 30, "Dani"));
       list.add(new Student(49, 27, "Steve"));
       return list;
   }
}
public class Example {
   public static void main(String[] args) {
      Predicate<Student> p1 = s -> s.stuName.startsWith("S");
      Predicate<Student> p2 = s -> s.stuAge < 28 && s.stuName.startsWith("Z");
      List<Student> list = Student.getStudents();

      /* anyMatch() method checks whether any Stream element matches
       * the specified predicate
       */
      boolean b3 = list.stream().anyMatch(p1);
      System.out.println(b3);
      boolean b4 = list.stream().anyMatch(p2);
      System.out.println(b4);
   }
}

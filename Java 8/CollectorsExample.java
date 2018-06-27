/*
Source: https://beginnersbook.com/2017/10/java-8-stream-collectors-class-with-examples/
*/

// Stream Collectors groupingBy and counting Example
public class Example {

   public static void main(String[] args) {

      List<String> names =
          Arrays.asList("Jon", "Ajeet", "Steve",
             "Ajeet", "Jon", "Ajeet");

      Map<String, Long> map =
      names.stream().collect(
          Collectors.groupingBy(
             Function.identity(), Collectors.counting()
          )
      );

      System.out.println(map);

   }
}

//Stream Collectors example of fetching data as List

class Student{
   int id;
   String name;
   int age;
   public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
   }
}
public class Example {
   public static void main(String[] args) {
      List<Student> studentlist = new ArrayList<Student>();
      //Adding Students
      studentlist.add(new Student(11,"Jon",22));
      studentlist.add(new Student(22,"Steve",18));
      studentlist.add(new Student(33,"Lucy",22));
      studentlist.add(new Student(44,"Sansa",23));
      studentlist.add(new Student(55,"Maggie",18));
      //Fetching student names as List
      List<String> names = studentlist.stream()
                                   .map(n->n.name)
                                   .collect(Collectors.toList());
      System.out.println(names);
   }
}

// Collecting Data as Set

class Student{
   int id;
   String name;
   int age;
   public Student(int id, String name, int age) {
       this.id = id;
       this.name = name;
       this.age = age;
   }
}
public class Example {
   public static void main(String[] args) {
      List<Student> studentlist = new ArrayList<Student>();
      //Adding Students
      studentlist.add(new Student(11,"Jon",22));
      studentlist.add(new Student(22,"Steve",18));
      studentlist.add(new Student(33,"Lucy",22));
      studentlist.add(new Student(44,"Sansa",23));
      studentlist.add(new Student(55,"Maggie",18));
      //Fetching student data as a Set
      Set<Student> students = studentlist.stream()
                           .filter(n-> n.id>22)
                           .collect(Collectors.toSet());
      //Iterating Set
      for(Student stu : students) {
         System.out.println(stu.id+" "+stu.name+" "+stu.age);
      }
   }
}

//Getting the average age of students using averagingInt() method

class Student{
   int id;
   String name;
   int age;
   public Student(int id, String name, int age) {
      this.id = id;
      this.name = name;
      this.age = age;
   }
}
public class Example {
   public static void main(String[] args) {
      List<Student> studentlist = new ArrayList<Student>();
      //Adding Students
      studentlist.add(new Student(11,"Jon",22));
      studentlist.add(new Student(22,"Steve",18));
      studentlist.add(new Student(33,"Lucy",22));
      studentlist.add(new Student(44,"Sansa",23));
      studentlist.add(new Student(55,"Maggie",18));
      //Getting the average Age
      Double avgAge = studentlist.stream()
          .collect(Collectors.averagingInt(s->s.age));
      System.out.println("Average Age of Students is: "+avgAge);
   }
}

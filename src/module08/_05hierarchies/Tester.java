package module08._05hierarchies;

public class Tester 
{
     // This will implicitly call the toString() method of object p
     public void print(Person p)
     {
        System.out.println(p);
     }
     public static void main(String[] args)
     {
        Person p = new Person("Sila");
        Student s = new Student("Tully", 1001);
        Tester t = new Tester();
        t.print(p); //call print with a Person
        t.print(s); //call print with a Student
     }
  }

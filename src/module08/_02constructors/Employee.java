package module08._02constructors;

public class Employee extends Person
{
  
   private static int nextId = 1;
   private int id; 
	
   public Employee(String theName)
   {
      super(theName);
      id = nextId;
      nextId++;
   }
  
   public int getId() 
   {
      return id;
   }
   
   public static void main(String[] args)
   {
      Employee emp1 = new Employee("Dani");
      System.out.println(emp1.getName());
      System.out.println(emp1.getId());

      Employee emp2 = new Employee("Matthew");
      System.out.println(emp2.getName());
      System.out.println(emp2.getId());
   }
}

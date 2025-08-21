package module08._03overriding;

public class Person 
{
    private String name; 
    
    public String getName()
    {	
       return name;
    }
 	
    public boolean setName(String theNewName) 
    {
       if (theNewName != null)
       {
          this.name = theNewName;
          return true;
       }
       return false;
    }
 }

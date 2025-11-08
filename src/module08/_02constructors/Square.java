package module08._02constructors;

// 1. Make the class square inherit from Rectangle
public class Square extends Rectangle {
     // 2. Add a Square no-argument constructor
     public Square () {
         super();
     }

     // 3. Add a Square constructor with 1 argument for a side
     public Square (int initLength) {
         super(initLength, initLength);
     }
     public static void main(String[] args)
     {
        Rectangle r1 = new Rectangle(3,5);
        r1.draw();
        // 4. Uncomment these to test
        Square s1 = new Square();
        s1.draw();
        Square s = new Square(3);
        s.draw();
     }
}

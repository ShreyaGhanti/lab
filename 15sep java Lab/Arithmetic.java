//1… Write the following code:
//1. A class named Arithmetic with a method named add that takes integers as parameters and
//returns an integer denoting their sum.
//2. A class named Adder that inherits from a superclass named Arithmetic.
class Arithmetic1{
    }

    class Adder extends Arithmetic1 {
        public int add(int a, int b){
            return a+b;
        }
    }

public class Arithmetic{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());  
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}

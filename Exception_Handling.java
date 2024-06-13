
import java.io.*;
public class Exception_Handling {
    public static void main(String[] args) {
        try{
            int x=6;
            int y=0;
            System.out.println(x/y);
        }
        catch (ArithmeticException e){
           System.out.println("ArithmeticException");
        }
        finally {
            System.out.println("Thank you");
        }
    }
}

// Access modifier: 'public' means this class is accessible from anywhere
public class Hello
{
   // 'public' means this method can be accessed from anywhere
   // 'static' means it belongs to the class, not an instance
   // 'void' means it doesn't return any value
   // 'main' is the entry point of any Java application
   // 'String[] args' stores command-line arguments
   public static void main(String[] args)
   {
     // 'System' is a final class in the java.lang package
     // 'out' is a static member of System class, which is a PrintStream object
     // 'println' is a method of PrintStream that prints the argument and a newline
     System.out.println("Hello");
   }    
}
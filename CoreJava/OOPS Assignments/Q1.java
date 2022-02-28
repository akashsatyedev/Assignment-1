package OOPSAssignment;

class Singleton
{
    private static Singleton single_instance = null;

    public String single;

    private Singleton()
    {
        single = "Hello This is a Singleton class";
    }

    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();

        return single_instance;
    }
}
class Assignment2Q1
{
public static void main(String args[])
{
   Singleton x = Singleton.getInstance();

   Singleton y = Singleton.getInstance();

   x.single = (x.single).toUpperCase(); 

   System.out.println("String from x is " + x.single);
   System.out.println("String from y is " + y.single);
   System.out.println("\n");

}
}

public class Welcome
{
    public static void main(String [] args)
    {
        String greeting = "Welcome to Core java!";
        for (int i = 0; i < greeting.length(); i++)
            System.out.print("=");
        System.out.println();

        System.out.println(greeting);
        System.out.println("=".repeat(greeting.length()));
    }
}
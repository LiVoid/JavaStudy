import java.util.Scanner;
import java.util.*;

public class Welcome {

    private static HashSet<String> processed=new HashSet<String>();

    public static void main(String[] args)
    {
        for (int i=0; i<5; i++){
            Scanner in = new Scanner(System.in);
            System.out.print("What is your text ?\n");
            String greeting = in.nextLine();

            String lower=greeting.toLowerCase();
            if(processed.contains(lower))throw new IllegalArgumentException("Your hierarchy is invalid; Have already created shortcut for family "+greeting);
            processed.add(lower);

            System.out.println(lower + " ok!");
        }



    }
}


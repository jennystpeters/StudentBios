import java.util.Scanner;

/**
 * Created by jenny on 7/3/2017.
 */

public class Validator
{
    public static String getString(Scanner entry, String prompt)
    {
        System.out.print(prompt);
        String s = entry.next();  // read user entry
        entry.nextLine();  // discard any other data entered on the line
        return s;
    }

    public static int getStringInt(Scanner entry, String prompt, String invalidPrompt)
    {
        int i = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            System.out.print(prompt);
            String s = entry.next();  // read user entry
            entry.nextLine();  // discard any other data entered on the line
            if(s.equalsIgnoreCase("hometown")) {
                i = 2;
                isValid = true;
            }
            else if (s.equalsIgnoreCase("favorite")) {
                i = 3;
                isValid = true;
            }
            else
                System.out.print(invalidPrompt);
        }
        return i;
    }

    public static int getInt(Scanner entry, String prompt)
    {
        int i = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            System.out.print(prompt);
            if (entry.hasNextInt())
            {
                i = entry.nextInt();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            entry.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

    public static int getInt(Scanner entry, String prompt, String invalidPrompt, int min, int max)
    {
        int i = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            i = getInt(entry, prompt);
            if (i < min)
                System.out.print(invalidPrompt);
            else if (i > max)
                System.out.print(invalidPrompt);
            else
                isValid = true;
        }
        return i;
    }

    public static double getDouble(Scanner entry, String prompt)
    {
        double d = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            System.out.print(prompt);
            if (entry.hasNextDouble())
            {
                d = entry.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            entry.nextLine();  // discard any other data entered on the line
        }
        return d;
    }

    public static double getDouble(Scanner entry, String prompt,
                                   double min, double max)
    {
        double d = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            d = getDouble(entry, prompt);
            if (d < min)
                System.out.println(
                        "Error! Number must be " + min + " or greater.");
            else if (d > max)
                System.out.println(
                        "Error! Number must be " + max + " or less.");
            else
                isValid = true;
        }
        return d;
    }
}
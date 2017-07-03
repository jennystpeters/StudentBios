import java.util.Scanner;

/**
 * Created by jenny on 7/3/2017.
 */

//Provide information about students in a class
//Recognize invalid inputs when the user requests the information
public class StudentBios {

    private static Validator Validator = new Validator();

    public static void main(String[] args) {

        String keepGoing = "yes";
        int min = 1, max = 20; //Range of students user can select

        Scanner entry = new Scanner(System.in);

        //User Prompts
        String welcomePrompt = "Welcome to our Java Class! Which student would you like to learn more about? ";
        String studentPrompt = "(enter a number " + min + " - " + max + "): ";
        String detailPrompt = "(enter \"hometown\" or \"favorite food\"): "; //Tell the user what information is available
        String invalidStudentPrompt = "\nThat student does not exist. Please try again. ";
        String invalidDataPrompt = "\nThat data does not exist. Please try again. ";
        String moreInfoPrompt = "Would you like to know more? (enter \"yes\" or \"no\"): ";
        String closingPrompt = "Thanks!";

        System.out.print(welcomePrompt);

        //Prompt the user to ask about a particular student
        int student = Validator.getInt(entry, studentPrompt, invalidStudentPrompt, min, max);

        System.out.print(getStudent(student));

        //FIX ME: Ask if user would like to learn about another student
        //FIX ME: Account for invalid user input with exceptions
        //FIX ME: Try to incorporate IndexOutOfBoundsException and IllegalArgumentException
        //FIX ME: Create other exceptions and catch those too

        while (keepGoing.equalsIgnoreCase("yes")) {
            System.out.print(getDetail(student, Validator.getStringInt(entry, detailPrompt, invalidDataPrompt)));
            System.out.print(moreInfoPrompt);
            keepGoing = entry.nextLine();
            System.out.println("");
        }

        System.out.print(closingPrompt);
    }

    public static String studentDatabase(int i, int j) {

        String studentDatabase[][] =
                {{"FirstName1 Last Name1", "Detroit, MI1", "Hot Dogs1"},
                        {"FirstName2", "LastName2", "Detroit, MI2", "Hot Dogs2"},
                        {"FirstName3", "LastName3", "Detroit, MI3", "Hot Dogs3"},
                        {"FirstName4", "LastName4", "Detroit, MI4", "Hot Dogs4"},
                        {"FirstName5", "LastName5", "Detroit, MI5", "Hot Dogs5"},
                        {"FirstName6", "LastName6", "Detroit, MI6", "Hot Dogs6"},
                        {"FirstName7", "LastName7", "Detroit, MI7", "Hot Dogs7"},
                        {"FirstName8", "LastName8", "Detroit, MI8", "Hot Dogs8"},
                        {"FirstName9", "LastName9", "Detroit, MI9", "Hot Dogs9"},
                        {"FirstName10", "LastName10", "Detroit, MI10", "Hot Dogs10"},
                        {"FirstName11", "LastName11", "Detroit, MI11", "Hot Dogs11"},
                        {"FirstName12", "LastName12", "Detroit, MI12", "Hot Dogs12"},
                        {"FirstName13", "LastName13", "Detroit, MI13", "Hot Dogs13"},
                        {"FirstName14", "LastName14", "Detroit, MI14", "Hot Dogs14"},
                        {"FirstName15", "LastName15", "Detroit, MI15", "Hot Dogs15"},
                        {"FirstName16", "LastName16", "Detroit, MI16", "Hot Dogs16"},
                        {"FirstName17", "LastName17", "Detroit, MI17", "Hot Dogs17"},
                        {"FirstName18", "LastName18", "Detroit, MI18", "Hot Dogs18"},
                        {"FirstName19", "LastName19", "Detroit, MI19", "Hot Dogs19"},
                        {"FirstName20", "LastName20", "Detroit, MI20", "Hot Dogs20"},
                };

        return studentDatabase[i][j];
    }

    public static String getStudent(int i) {

        String studentOutput = "\nStudent " + i + " is " + studentDatabase((i - 1), 0) + " " + studentDatabase((i - 1), 1) + ". What would you like to know about " + studentDatabase((i - 1), 0) + "? ";

        return studentOutput;
    }

    public static String getDetail(int i, int j) {

        String detail = "";

        if (j == 2) {
            detail = " is from " + studentDatabase((i - 1), j);
        } else if (j == 3) {
            detail = "'s favorite food is " + studentDatabase((i - 1), 3);
        }

        String detailOutput = "\n" + studentDatabase((i - 1), 0) + detail + ". ";

        return detailOutput;
    }
}

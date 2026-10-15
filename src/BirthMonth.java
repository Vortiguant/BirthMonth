import java.util.Scanner;

public class BirthMonth
{
    static void main()
    {
        Scanner in = new Scanner(System.in);

        int birthMonth = 0;
        String trash = "";

        IO.println("Enter your birth month [1-12]");

        if(in.hasNextInt())
        {
            birthMonth = in.nextInt();
            in.nextLine();

            if(birthMonth >= 1 && birthMonth <= 12)
            {
                IO.println("You have said your birth month is " + birthMonth);

            }
            else
            {
                IO.println("You entered an invalid value " + birthMonth);
                IO.println("Run the program again and enter a valid value [1-12]");
            }
        }
        else
        {
            trash = in.nextLine();
            IO.println("This is an invalid value " + trash);
            IO.println("Run the program again with the correct input!");
            System.exit(0);
        }

    }

}

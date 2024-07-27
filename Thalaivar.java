
import java.util.Scanner;

public class Thalaivar 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String CAnswer = "SUPER STAR RAJNI";

        for (int i=0; i<3; i++)
        {
            System.out.println("Who is Thalaivar?");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase(CAnswer))
            {
                System.out.println("CORRECT");
            }
            else {
                System.out.println("INCORRECT. TRY AGAIN!");
                break;
            }
        }

        
    }
}

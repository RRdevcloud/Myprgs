
import java.util.Scanner;

public class HogwartsAttendance 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            String Name;
            int Year;
            int gryffindor = 0;
            int hufflepuff = 0;
            int ravenclaw = 0;
            int slytherin = 0;

            System.out.println("Enter your Name: ");
            Name = sc.nextLine();
            System.out.println("Enter your Academic Year: ");
            Year = sc.nextInt();
            System.out.println("Describe Yourself From Among the Given Options: ");
            System.out.println("1. Courageous");
            System.out.println("2. Loyal");
            System.out.println("3. Intelligent");
            System.out.println("4. Ambitious");
            int answer = sc.nextInt();

            switch (answer)
            {
                case 1 -> gryffindor++;
                case 2 -> hufflepuff++;
                case 3 -> ravenclaw++;
                case 4 -> slytherin++;
            }
            
            if (gryffindor > 0)
            {
                System.out.println("Welcome to Gryffindor");
                System.out.println(Name);
            }
            else if (hufflepuff > 0)
            {
                System.out.println("Welcome to Hufflepuff");
                System.out.println(Name);
            }
            else if (ravenclaw > 0)
            {
                System.out.println("Welcome to Ravenclaw");
                System.out.println(Name);
            }
            else 
            {
                System.out.println("Welcome to Slytherin");
                System.out.println(Name);
            }
        }
    }

    

}

import java.util.Scanner;

public class Fibonacci 
{
    public static void main(String[] args) 
    {
        int i = 1;
        int FirstT = 0;
        int SecondT = 1;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Terms till Fibonacci Series to End: ");
        int num = sc.nextInt();

        while(i<=num)
        {
            System.out.println(FirstT+ ", ");

            int NextT = FirstT+SecondT;
            FirstT = SecondT;
            SecondT = NextT;

            i++;
        }

        System.out.println("The Fibonacci Series till "+ num +"Terms: ");
    }
}


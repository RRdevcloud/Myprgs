import java.util.Scanner;

public class Factorial 
{
    public static void main(String[] args) 
    {
        int Fact = 1;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        while(i<=num)
        {
            Fact = Fact*i;
            i++;
        }

        System.out.println("The Factorial of "+ num+ "is "+Fact);
    }
}

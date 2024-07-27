import java.util.Scanner;

public class App {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Username: ");
        String username = sc.nextLine();

        System.out.println("Enter Password: ");
        String password = sc.nextLine();

       if("007".equals(username)&&"Spectre".equals(password))
       {
        System.out.println("Authorization Successfull");
        System.out.println("Welcome Mr. Bond");
       }
       else if(!"007".equals(username)&&"Spectre".equals(password))
       {
        System.out.println("Incorrect Username");
       }
       else if("007".equals(username)&& !"Spectre".equals(password))
       {
        System.out.println("Incorrect Password");
       }
       else
       {
        System.out.println("Authorization Unsuccessfull");
       }
       sc.close();
    }

    }

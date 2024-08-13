import java.util.Scanner;

public class ReverseWhile 
{
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int num=sc.nextInt();
	
		int temp=num,rev=0,n,i;

		for(i=0;i>=0;i++) {
			n=temp%10;
			rev=rev*10+n;
			temp=temp/10;
			if(temp==0){
				break;
			}	
		}
		System.out.printf("Reverse :"+rev);
		sc.close();
	}
}

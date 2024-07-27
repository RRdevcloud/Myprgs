import java.util.Scanner;

public class DoubleElement 
{
    public static void main(String[] args) 
    {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
    
            int[] arr = new int[size];
    
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }
    
            System.out.print("Double elements: ");
            
            for (int i = 0; i < arr.length; i++) {
                boolean isDouble = false;
                for (int k = 0; k < i; k++) {
                    if (arr[i] == arr[k]) {
                        isDouble = true;
                        break;
                    }
                }
    
                if (!isDouble) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] == arr[j]) {
                            System.out.print(arr[i] + " ");
                            break;
                        }
                    }
                }
            }
        }
}



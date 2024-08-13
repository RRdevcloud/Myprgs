import java.util.Scanner;

public class SearchElement 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();
        int[][]arr = new int[rows][cols];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
              
        System.out.println("Enter the element to search for:");
        int a = sc.nextInt();
        int[] position = SearchElement(arr,a);

        if (position != null) {
            System.out.println("Element found at position (" + position[0] + ", " + position[1] + ")");
        } else {
            System.out.println("Element not found in the array");
        }
    }


    public static int[] SearchElement(int[][] arr, int a) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == a) {
                    return new int[]{i, j};
                }
            }
        
        }
        return null;
   
    }
}

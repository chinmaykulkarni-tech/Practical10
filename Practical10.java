import java.util.Scanner;

public class Practical10 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

       
        int[][] grid = new int[rows][cols];
  for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = 0; 
            }
        }

        
        System.out.println("The grid is: ");
        
      
        printBorder(cols);

        
        for (int i = 0; i < rows; i++) {
            System.out.print("|"); 
         
            for (int j = 0; j < cols; j++) {
                System.out.printf(" %2d |", grid[i][j]); 
            }
            System.out.println(); 
            printBorder(cols);
        }

        
        scanner.close();
    }

    
    private static void printBorder(int cols) {
        
        for (int i = 0; i < cols; i++) {
            System.out.print(" ____"); 
        }
        System.out.println(); 
    }
}


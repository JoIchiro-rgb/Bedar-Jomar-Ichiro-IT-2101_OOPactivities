import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner next = new Scanner(System.in);
        
        System.out.print("Enter the size of multiplication table: ");
        int mt = next.nextInt();
        
        int[][] table = new int[mt][mt]; 
        
        for (int i = 0; i < mt; i++) {
            for (int j = 0; j < mt; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        
        System.out.println("Multiplication Table: ");
        for (int i = 0; i < mt; i++) {
            for (int j = 0; j < mt; j++) {
                System.out.printf("%4d", table[i][j]);  
            }
            System.out.println();
        }
        next.close();
    }
}

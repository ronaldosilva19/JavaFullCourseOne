package Nested.Loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter # of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();

        for(int i = 1; i <= rows; i++){
            System.out.println();
            int j = 1;
            while(j <= columns){
                System.out.print(symbol);
                j++;
            }
        }

    }
}

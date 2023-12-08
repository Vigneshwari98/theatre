package org.example;
import java.util.Scanner;

public class Pyramid {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the pyramid height: ");
        int height = scanner.nextInt();
        int width = (height * 2) - 1;
        int start = 0;
        int end = width - 1;

        for (int i = 0; i < (height * 2) - 1; i++) {
            for (int j = 0; j < width; j++)
                if(j >= start && j <= end) // 0-8 1-7 2-6 3-5 4-4 5-3
                    System.out.print(height);
                else
                    if(height < 10)
                        System.out.print(" ");
                    else
                        System.out.print("  ");
            if(i < height - 1) {
                start++;
                end--;
            }else{
                start--;
                end++;
            }
            System.out.println();
        }
    }
}

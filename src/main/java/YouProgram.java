import java.util.Scanner;
public class YouProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the heart:");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i=+2) {
            for (int j = 1; j <= n; j=+2) {
                System.out.println(" ");
                for(int k =1;k<=n-1;k=+2){
                   System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
}
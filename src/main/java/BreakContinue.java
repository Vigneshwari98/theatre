import java.util.Scanner;
import java.lang.Math;

class Venkat{
    String name = "Venkat";
    public String getName(){
        return name;
    }
}

public class BreakContinue { // BreakContinue.main({"Venkat", "Eshu"});
    int x;
    public static void main(String[] args) {
        Venkat venkatObject = new Venkat();
        System.out.println(venkatObject.getName());

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the number:");
        int n = 5;
//                scanner.nextInt();
        double percentage = 45.379;
        double roundOff = Math.floor(percentage);
        double roundUp = Math.ceil(percentage);
        double round = Math.round(percentage);

        System.out.println("roundoff: " + roundOff);
        System.out.println("roundUp: " + roundUp);
        System.out.println("round: " + round);

        if (n % 2 != 0) {
            System.out.println(" is a  Prime Number:");
        } else {
            System.out.println(" Not a Prime Number:");

        }
    }
}

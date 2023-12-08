package org.example;

import org.example.Pyramid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[][][] numbers ={ {{1,2,3,5,8,12}, {3,7}} ,  {{},{}} , {{},{}}       };
//                numbers[1][0] = numbers[0][1];

        int[][] twoDimensionalArray = {{1,2,3}, {4,5,6}, {7,8,9} , {3, 6}, {1}       };

        int a = 5, b = 3;
        Pyramid object = new Pyramid();
        boolean isAGreater = isAGreaterThanB(a, b);
        boolean greaterOrLesser = a > 0 && a > b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String username = scanner.next();
        System.out.println("Enter password:");
        String password = scanner.next();
        boolean isAuthenticated = authenticate(username, password);

        if(isAuthenticated){
            System.out.println("Successfully logged in...!!!");
        }else{
            System.out.println("Login failed. Check your credentials.");
        }

        int age; // 3000 - 3003
        age = 26;
        Dog dog;
        dog = new Dog();

        int[] oneDi = new int[7]; // 10,000 - 10,028 10,029
        oneDi[0] = 34;

        Dog[] dogs = new Dog[5];

        int[] oneDim = {1,2,3,4,5}; // oneDim = 10000 + (4 * 2) =   10,020, 10,021, 10,022, 10,023, 10,024

        int x = 45;
        oneDim = new int[6]; // 5000
        oneDim = new int[20]; // 70,000
        int[] oneDimension; // oneDimension = 20,000

//        int[] oneD = new int[5]; // {*, *, *, *, *}
//        int[][] array = new int[4][]; // {{*,*,*,*,*}, {*,*,*}, *, *}
//        array[0] = new int[5];
//        array[1] = new int[3];
        int[] oneDimension2 = {1,2,3,4,5,6,7};
//        for (int number : numbers) {
//            System.out.println(number);
//        }
    }

    public static boolean authenticate(String username, String password){
        return username.equals("venkat") && password.equals("eshu");
    }

    public static boolean isAGreaterThanB(int a, int b){
        return (a > 0) && (a > b);
    }

}

//new usage,new int[],new Scanner
//and operator usage
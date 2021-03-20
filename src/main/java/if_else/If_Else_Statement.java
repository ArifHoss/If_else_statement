package if_else;

import java.util.Scanner;

public class If_Else_Statement {

    private static Scanner sc = new Scanner (System.in);

    public static void main ( String[] args ) {
        System.out.print ("Enter number: ");
        int N = sc.nextInt ();

        if (N <= 100 && N % 2 == 1) {
            System.out.println ("Weird!");
        } else if (N > 1 && N < 6 && N % 2 == 0) {
            System.out.println ("Not Weird");
        } else if (N > 5 && N < 21 && N % 2 == 0) {
            System.out.println ("Weird");
        } else if (N > 20 && N < 101 && N % 2 == 0) {
            System.out.println ("Not Weird");
        } else {
            System.out.println ("Error!");
        }


    }
}

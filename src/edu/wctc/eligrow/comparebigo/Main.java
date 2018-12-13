package edu.wctc.eligrow.comparebigo;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter a number under 100: ");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        System.out.print("Enter a constant number under 10: ");
        int constant = keyboard.nextInt();
        Long wholeNumber = Long.parseLong(input);


        System.out.printf("%9s     %9s     %9s     %15s     %15s     %15s     %15s     %15s     %15s\n",
                "O(1)","O(log n)","O(n)","O(n2)","O(nc)", "O(2n)","O(cn)", "O(n!)", "O(log log n)");
        System.out.printf("%9s     %9s     %9s     %15s     %15s     %15s     %15s     %15s     %15s\n",
                "--------","--------","--------","--------","--------", "--------","--------", "--------", "--------");
        for (int i=0; i<wholeNumber; i++) {
            long factorial = 0;

            for(int j=1;j<=i;j++){
                factorial=factorial*i;
            }

            System.out.printf("%9d     %9.2f     %9d     %15.2f     %15.2f     %15.2f     %15.2f     %15d     %15.2f\n",
                    1,Math.log(i),i,Math.pow(i,constant),Math.pow(i, constant),Math.pow(constant, i),
                    Math.pow(constant, i),factorial, Math.log(Math.log(i)));
        }
    }
}

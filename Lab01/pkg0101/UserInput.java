
package pkg0101;

import java.util.Scanner;

public class UserInput {
    public static double getDinoMassKG (String str) {
        System.out.println(str);
        Scanner in = new Scanner(System.in);
        return in.nextDouble();
    } 
}

package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int numberofLEDs = sc.nextInt();
        LED[] array = new LED[numberofLEDs];
        for (int i = 0; i < array.length; i++) {
            String colourName = sc.nextLine();
            boolean working = sc.nextBoolean();
            array[i] = new LED(colourName, working);
        }
        LEDStrip strip = new LEDStrip(array);
        strip.printStripstatus();
        sc.close();
    }
}

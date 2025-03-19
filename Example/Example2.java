package Example;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        System.out.println("HI, what's your name");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println(name);

        boolean isNameGiven = !name.isEmpty();
        if (isNameGiven) {
            System.out.println("sad your " + name + " is not nice");
        }

    }
}

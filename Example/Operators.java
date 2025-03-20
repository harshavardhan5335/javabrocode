package Example;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price;
        int quantity;

        System.out.print("what is the name of the product : ");
        String name = sc.nextLine();
        System.out.print("what is the price : ");
        price = sc.nextDouble();
        System.out.print("quantity : ");
        quantity = sc.nextInt();

        int a = (int) price;
        int total = quantity * a;
        System.out.println("The total price for that "+name+" are " + total);
        sc.close();
    }

}

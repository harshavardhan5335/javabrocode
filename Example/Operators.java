package Example;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in)
            String name;
            double price;
            int quantity;
            char currency = '$';
        
            
        System.out.println("what is the name of the product : ");
        name = sc.nextLine();
        System.out.println("what is the price : ");
        price = sc.nextDouble();
        System.out.println("quantity : ");
        quantity= sc.nextInt();

        
int a= (int)price;
        int total = quantity * a;
        System.out.println( "The total price for that items are " + total);
    }

}

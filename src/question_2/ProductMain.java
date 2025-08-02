package question_2;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to store 5 products
        Product[] products = new Product[5];

        // Accept 5 product inputs
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter product " + (i + 1) + " details (pid, price, quantity):");
            int pid = sc.nextInt();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();

            products[i] = new Product(pid, price, quantity);
        }

        // Find pid with highest price
        double maxPrice = products[0].price;
        int maxPid = products[0].pid;

        for (int i = 1; i < products.length; i++) {
            if (products[i].price > maxPrice) {
                maxPrice = products[i].price;
                maxPid = products[i].pid;
            }
        }

        System.out.println("\nProduct ID with highest price: " + maxPid);

        // Calculate total amount spent
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);
        
        sc.close();
    }

    // Method to calculate total amount spent
    public static double calculateTotalAmount(Product[] products) {
        double total = 0;
        for (Product p : products) {
            total += p.price * p.quantity;
        }
        return total;
        
        
    }
}

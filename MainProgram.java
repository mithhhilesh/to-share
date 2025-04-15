import java.io.*;
import java.util.*;

public class MainProgram {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("products.txt"))) {
            String line;
            int count = 0;

            while ((line = br.readLine()) != null && count < 10) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    Product p = new Product();
                    p.setProduct(parts[0].trim(),
                            Double.parseDouble(parts[1].trim()),
                            parts[2].trim(),
                            Double.parseDouble(parts[3].trim()));
                    productList.add(p);
                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display all products");
            System.out.println("2. Display products with 50% max discount and final cost");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Iterator<Product> iterator = productList.iterator();
                    while (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;
                case 2:
                    for (Product p : productList) {
                        if (p.getMaxDiscount() == 50) {
                            System.out.println(p);
                            System.out.println("Final Cost after 50% discount: " + p.getFinalCost());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);

        scanner.close();
    }
}

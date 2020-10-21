import java.util.Scanner;

public class ScanData {

    public Category[] categories(int count) {
        Category[] categories = new Category[count];
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        System.out.println("Uwaga! Użyj przecinka jako separatora przy wprowadzaniu wynagrodzenia!");
        while (index < categories.length) {
            categories[index] = new Category();
            System.out.println("Tworzenie kategorii o id: " + (index + 1));
            System.out.print("Podaj nazwę:");
            categories[index].setName(scanner.next());
            System.out.print("Podaj wartość podatku VAT w %:");
            categories[index].setTax(scanner.nextDouble());
            categories[index].setId(index);
            index++;
        }
        return categories;
    }

    public Product[] products(int count) {
        Product[] products = new Product[count];
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        System.out.println("Uwaga! Użyj przecinka jako separatora przy wprowadzaniu kwot!");
        while (index < products.length) {
            products[index] = new Product();
            System.out.println("Tworzenie produktów nr: " + (index + 1));
            System.out.print("Podaj nazwę:");
            products[index].setName(scanner.next());
            System.out.print("Podaj opis:");
            products[index].setDescription(scanner.next());
            System.out.print("Podaj wartość netto produktu:");
            products[index].setNettPrice(scanner.nextDouble());
            scanner.nextLine();
            System.out.print("Podaj id kategorii:");
            products[index].setCategoryId(scanner.nextInt() - 1);
            index++;
        }
        return products;
    }

}


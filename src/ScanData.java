import java.util.Scanner;

public class ScanData {

    public Category[] categories() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jeżeli chcesz wpisać kategorie wpis '1' lub '2' aby użyć predefiniowanych: ");
        boolean isPredefined;
        if(scanner.nextInt() == 1) {
            System.out.print("Podaj liczbę kategorii do wprowadzenia: ");
            Category[] categories = new Category[scanner.nextInt()];
            int index = 0;
            System.out.println("Uwaga! Użyj przecinka jako separatora przy wprowadzaniu kwot!");
            while (index < categories.length) {
                categories[index] = new Category();
                System.out.println("Tworzenie kategorii o id: " + (index + 1));
                System.out.print("Podaj nazwę:");
                categories[index].setName(scanner.next());
                System.out.print("Podaj wartość podatku VAT w %:");
                categories[index].setTax(scanner.nextDouble());
                categories[index].setId(index+1);
                index++;
            }
            return categories;
        }else{
            Category[] categories = new Category[5];
            categories[0] = new Category("Słodycze", 8.5, 1);
            categories[1] = new Category("Owoce", 5, 2);
            categories[2] = new Category("Napoje", 11, 3);
            categories[3] = new Category("Pieczywo", 4, 4);
            categories[4] = new Category("Usługi", 23, 5);
            return categories;
        }
    }

    public Product[] products(Category[] categories) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę produktów, które chcesz wprowadzić: ");
        Product[] products = new Product[scanner.nextInt()];
        new ShowResults().showCategories(categories);
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
            products[index].setCategoryId(scanner.nextInt());
            index++;
        }
        return products;
    }

}


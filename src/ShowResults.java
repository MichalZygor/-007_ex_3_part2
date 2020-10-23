import java.util.Scanner;

public class ShowResults {
    public void showSum(Product[] products, Category[] categories) {
        showCategories(categories);
        System.out.print("\nPodaj id kategorii dla której policzyć sumę cen brutto: ");

        Scanner scanner = new Scanner(System.in);
        int idCategoryToShow = scanner.nextInt();

        double sum = 0;
        for (Product valueProducts : products) {
            if ((valueProducts.getCategoryId() == idCategoryToShow)) {
                sum += (valueProducts.getNettPrice() * ((categories[idCategoryToShow - 1].getTax() / 100) + 1));
            }
        }
        System.out.printf("Suma cen brutto dla produktów należących do kategorii '%s' id:%d wynosi %.2f",
                categories[idCategoryToShow - 1].getName(), idCategoryToShow, sum);
    }

    public void showCategories(Category[] categories) {
        System.out.print("Aktualne kategorie to: ");
        for (Category valueCategories : categories) {
            System.out.print("id:" + valueCategories.getId() + " - '" + valueCategories.getName() + "' (" + valueCategories.getTax() + "%), ");
        }
        System.out.println("");
    }

}

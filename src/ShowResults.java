import java.util.Scanner;

public class ShowResults {
    public void showSum(Product[] products, Category[] categories) {
        showCategories(categories);
        System.out.print("\nPodaj id kategorii dla której policzyć sumę cen brutto: ");

        Scanner scanner = new Scanner(System.in);
        int idCategoryToShow = scanner.nextInt();

        double sum = 0;
        for (Category valueCategories : categories){
            for (Product valueProducts : products) {
                if ((valueProducts.getCategoryId()== idCategoryToShow && valueCategories.getId() == idCategoryToShow) ){
                    sum += (valueProducts.getNettPrice() * ((valueCategories.getTax() / 100) + 1));
                    System.out.println(valueProducts.getNettPrice());
                }
            }
        }
        System.out.println("Suma cen brutto dla produktów należących do kategorii '" + categories[idCategoryToShow-1].getName()
                + "' o id: " + idCategoryToShow + " wynosi: " + sum);
    }

    public void showCategories(Category[] categories){
        System.out.print("Aktualne kategorie to: ");
        for (Category valueCategories : categories){
            System.out.print("id:" + valueCategories.getId() + " - '" + valueCategories.getName() + "' (" + valueCategories.getTax() + "%), ");
        }
    }

}

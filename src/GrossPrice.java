public class GrossPrice {
    public static void main(String[] args) {
        final int countOfCategories = 3;
        int countOfProducts = 3;

        ScanData scanData = new ScanData();
        Category[] categories = scanData.categories(countOfCategories);
        Product[] products = scanData.products(countOfProducts);
        new ShowResults(products, categories);
        // Zastosowanie 'switch' wprowadziło ogranicznenie do programu.
        // Wolałbym wyświetlić dane na dwóch foreach, ale zadanie dotyczy wykorzystania niestety switch
    }
}




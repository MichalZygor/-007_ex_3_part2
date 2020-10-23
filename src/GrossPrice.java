
public class GrossPrice {
    public static void main(String[] args) {
        ScanData scanData = new ScanData();
        Category[] categories = scanData.createCategoriesFromUser();
        Product[] products = scanData.createProductsFromUser(categories);
        ShowResults showResults = new ShowResults();
        showResults.showSum(products, categories);
        Product[] products1 = new Product[];
    }
}

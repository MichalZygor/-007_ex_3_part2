public class GrossPrice {
    public static void main(String[] args) {
        ScanData scanData = new ScanData();
        Category[] categories = scanData.categories();
        Product[] products = scanData.products(categories);
        ShowResults showResults = new ShowResults();
        showResults.showSum(products, categories);
    }
}

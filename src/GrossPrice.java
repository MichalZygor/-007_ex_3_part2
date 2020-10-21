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


// Zapytaj użytkownika czy wczytać predefinowane kategorie lub czy che wczytać swoje, zakończyć ENDem
// niech poda kategorie
// niech uzytkownik dsoda produkty, ..., zakończenie wpisać END (Zapytaj użytkownika o podanie kategorii. )
// przed każdym wczytaniem produktu wyświtla lstę z kategoriami
// Oblicz sumę cen brutto dla produktów należacych tylko do tej kategorii. --> zapytaj uźytkownika, którą kategorię chce zobaczyć

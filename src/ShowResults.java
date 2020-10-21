public class ShowResults {
    public ShowResults(Product[] products, Category[] categories) {
        System.out.println("Lista:  \n'nazwa produktu', 'kategoria', 'wartość netto', 'VAT w %', 'wartość brutto'");
        for (Product tmp1 : products) {
            switch (tmp1.getCategoryId()) {
                case 0:
                    System.out.printf("%s, %s, %.2f, %.2f, %.2f\n", tmp1.getName(), categories[0].getName(),
                            tmp1.getNettPrice(), categories[0].getTax(),
                            (tmp1.getNettPrice() * ((categories[0].getTax() / 100) + 1)));
                    break;
                case 1:
                    System.out.printf("%s, %s, %.2f, %.2f, %.2f\n", tmp1.getName(), categories[1].getName(),
                            tmp1.getNettPrice(), categories[1].getTax(),
                            (tmp1.getNettPrice() * ((categories[1].getTax() / 100) + 1)));
                    break;
                case 2:
                    System.out.printf("%s, %s, %.2f, %.2f, %.2f\n", tmp1.getName(), categories[2].getName(),
                            tmp1.getNettPrice(), categories[2].getTax(),
                            (tmp1.getNettPrice() * ((categories[2].getTax() / 100) + 1)));
                    break;
                default:
                    System.out.println("Brak kategorii");
            }
        }
    }
}

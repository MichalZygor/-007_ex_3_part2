public class Category {
    private String name;
    private double tax;
    private int id;

    public Category() {
    }

    public Category(String name, double tax, int id) {
        this.name = name;
        this.tax = tax;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

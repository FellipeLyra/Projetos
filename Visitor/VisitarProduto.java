// Defina a classe abstrata VisitarProduto
public abstract class VisitarProduto {
    protected String name;
    protected double price;

    public VisitarProduto(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Declarei um método abstrato para calcular o preço com impostos
    public abstract double getPriceWithTaxes(TaxVisitorProtocol visitor);
}

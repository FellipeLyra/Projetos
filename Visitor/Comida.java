public class Comida extends VisitarProduto {
    public Comida(double price) {
        super("Comida", price);
    }

    public double getPriceWithTaxes(TaxVisitorProtocol visitor) {
        return visitor.calcularTaxaComida(this);
    }
}


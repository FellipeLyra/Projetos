public class Bebida extends VisitarProduto {
    public Bebida(double price) {
        super("Bebida", price);
    }

    public double getPriceWithTaxes(TaxVisitorProtocol visitor) {
        return visitor.calcularTaxaBebida(this);
    }
}

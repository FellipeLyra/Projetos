public class TaxaUsVisitor implements TaxVisitorProtocol {
    public double calcularTaxaComida(Comida comida) {
        return comida.getPrice() + comida.getPrice() * 0.15;
    }

    public double calcularTaxaBebida(Bebida bebida) {
        return bebida.getPrice() + bebida.getPrice() * 1;
    }
}

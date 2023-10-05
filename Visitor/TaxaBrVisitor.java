public class TaxaBrVisitor implements TaxVisitorProtocol {
    public double calcularTaxaComida(Comida comida) {
        return comida.getPrice() + comida.getPrice() * 0.05;
    }

    public double calcularTaxaBebida(Bebida bebida) {
        return bebida.getPrice() + bebida.getPrice() * 0.5;
    }
}

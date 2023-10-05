public class Main {
    public static void main(String[] args) {
        Comida comida = new Comida(10);
        Bebida bebida = new Bebida(5);

        TaxaBrVisitor brTaxaVisitor = new TaxaBrVisitor();
        TaxaUsVisitor usTaxaVisitor = new TaxaUsVisitor();

        VisitarProduto[] cart = { comida, bebida };
        double total = 0;
        double totalTaxaBr = 0;
        double totalTaxaUs = 0;

        for (VisitarProduto item : cart) {
            total += item.getPrice();
            totalTaxaBr += item.getPriceWithTaxes(brTaxaVisitor);
            totalTaxaUs += item.getPriceWithTaxes(usTaxaVisitor);
        }

        System.out.println("Total: " + total);
        System.out.println("Total com impostos no Brasil: " + totalTaxaBr);
        System.out.println("Total com impostos nos EUA: " + totalTaxaUs);
    }
}

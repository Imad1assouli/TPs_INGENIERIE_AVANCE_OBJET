package OC;

public class Main {
    public static void main(String[] args) {
        Produit p1 = new Produit();
        p1.setLibele("Produit 1");
        p1.setPrix(15.0);

        Produit p2 = new Produit();
        p2.setLibele("Produit 2");
        p2.setPrix(34.0);

        Facture facture = new Facture(1);
        Facture.setTVA(0.2);  // 20% TVA

        facture.addProduit(p1, 2);
        facture.addProduit(p2, 1);

        FacturePrinter.imprimer(facture);

        FactureSaver.saveFacture(facture);
    }
}

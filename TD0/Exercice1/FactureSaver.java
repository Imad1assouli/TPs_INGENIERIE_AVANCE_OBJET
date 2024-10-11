package OC;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class FactureSaver {
    public static void saveFacture(Facture facture) {
        try {
            String file = "Facture_" + facture.getId() + ".txt";
            FileWriter writer = new FileWriter(file);
            writer.write("Facture ID: " + facture.getId() + "\n");
            for (Map.Entry<Produit, Integer> mapentry : facture.getProduits().entrySet()) {
                writer.write(mapentry.getKey().toString() + "\t" + mapentry.getValue().toString() + "\n");
            }
            writer.write("Prix = " + facture.getTotal() + "\n");
            writer.write("PrixTTC = " + facture.getTotalTTC() + "\n");
            writer.close();

            System.out.println("Facture sauvegardée dans " + file);

        } catch (IOException e) {
            System.out.println("Une erreur est survenue.");
            e.printStackTrace();
        }
    }
}

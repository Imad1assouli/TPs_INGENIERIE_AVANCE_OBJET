package ID;


public class Main {
    public static void main(String[] args) {
        Compte compteCourant = new Courant("10", "23/04/2024");
        Compte compteEpargne = new Epargne("14", "12/06/2023");

        Operation debitOp = new Operation(100, TypeOperation.Debit);
        Operation creditOp = new Operation(50, TypeOperation.Credit);

        System.out.println("Ajout d'une opération de débit sur le compte courant:");
        System.out.println(compteCourant.addOperation(debitOp)); // true
        System.out.println("Montant courant: " + compteCourant.getMontant()); // 100

        System.out.println("Ajout d'une opération de crédit sur le compte courant:");
        System.out.println(compteCourant.addOperation(creditOp)); // true
        System.out.println("Montant courant: " + compteCourant.getMontant()); // 50

        System.out.println("Ajout d'une opération de débit sur le compte épargne:");
        System.out.println(compteEpargne.addOperation(debitOp)); // true
        System.out.println("Montant épargne: " + compteEpargne.getMontant()); // 5

        System.out.println("Ajout d'une opération de crédit sur le compte épargne:");
        System.out.println(compteEpargne.addOperation(creditOp)); // false (year condition not met)
    }
}

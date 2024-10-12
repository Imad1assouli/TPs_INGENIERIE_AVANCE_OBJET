package Liskov;

public class Main {
    public static void main(String[] args) {
        MatriceYoung tableau = new MatriceYoung(3, 3);

        // Insertion des éléments
        tableau.inserer(1);
        tableau.printTableau();
        tableau.inserer(2);
        tableau.printTableau();
        tableau.inserer(3);
        tableau.printTableau();
        tableau.inserer(4);
        tableau.printTableau();
        tableau.inserer(5);
        tableau.printTableau();
        tableau.inserer(6);
        tableau.printTableau();
        tableau.inserer(7);
        tableau.printTableau();
        tableau.inserer(8);
        tableau.printTableau();

        // Extraction du minimum
        System.out.println("Min extrait : " );
    }
}

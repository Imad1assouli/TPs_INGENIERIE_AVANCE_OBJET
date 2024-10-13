package ID;

public class Main {
    public static void main(String[] args) {
        Enseignant enseignant = new Enseignant("Hafidi", "Imad", "Professeur");
        CompteUniversitaire compteEnseignant = new CompteUniversitaireEnseignant(enseignant);
        compteEnseignant.genererLogin();
        System.out.println("Login Enseignant: " + compteEnseignant.getLogin());

        Etudiant etudiant = new Etudiant("Assouli", "Imad", 187);
        CompteUniversitaire compteEtudiant = new CompteUniversitaireEtudiant(etudiant);
        compteEtudiant.genererLogin();
        System.out.println("Login Etudiant: " + compteEtudiant.getLogin());
    }
}

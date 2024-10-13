package ID;

public class CompteUniversitaireEtudiant extends CompteUniversitaire {
    private Etudiant etudiant;

    public CompteUniversitaireEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    @Override
    public void genererLogin() {
        this.login = this.etudiant.getPrenom().charAt(0) + this.etudiant.getNom() + "@usms.ac.ma";
    }
}

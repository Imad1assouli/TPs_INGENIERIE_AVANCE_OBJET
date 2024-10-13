package ID;

public class CompteUniversitaireEnseignant extends CompteUniversitaire {
    private Enseignant enseignant;

    public CompteUniversitaireEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }

    @Override
    public void genererLogin() {
        this.login = this.enseignant.getPrenom() + this.enseignant.getNom() + this.enseignant.getGrade() + "@usms.ma";
    }
}

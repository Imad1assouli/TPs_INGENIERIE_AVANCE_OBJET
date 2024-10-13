package ID;

public class Enseignant {
    private String nom;
    private String prenom;
    private String Grade;

    public Enseignant(String nom, String prenom, String grade) {
        this.nom = nom;
        this.prenom = prenom;
        Grade = grade;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getGrade() {
        return Grade;
    }


}

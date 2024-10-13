import java.time.LocalDate;
import java.time.Period;

public class AmiFacebook implements IAmiFacebook {
    private String nom;
    private LocalDate dateDeNaissance;

    public AmiFacebook(String nom, LocalDate dateDeNaissance) {
        this.nom = nom;
        this.dateDeNaissance = dateDeNaissance;
    }

    @Override
    public String getNom() {
        return this.nom;
    }

    @Override
    public LocalDate getDateDeNaissance() {
        return this.dateDeNaissance;
    }

    @Override
    public void envoyerMessageAnniversaire() {
        System.out.println("Joyeux anniversaire à mon ami Facebook, " + this.nom + "!");
    }

    @Override
    public int getAge() {
        return Period.between(dateDeNaissance, LocalDate.now()).getYears();
    }
}

import java.time.LocalDate;

public interface IContactAnniversaire {
    String getNom();
    LocalDate getDateDeNaissance();
    int getAge();
    void envoyerMessageAnniversaire();
}

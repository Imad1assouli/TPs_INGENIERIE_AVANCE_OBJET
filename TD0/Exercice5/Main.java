import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Calendrier calendrier = new Calendrier();

        IContactAnniversaire personne = new Personne("Assouli", LocalDate.of(2001, 6, 23));
        IContactAnniversaire amiFacebook = new AmiFacebook("Lachhab", LocalDate.of(2002, 12, 25));

        calendrier.add(personne);
        calendrier.add(amiFacebook);

        calendrier.envoyerMessagesAnniversaire();
    }
}

import java.util.ArrayList;
import java.util.List;

public class Calendrier {
    private List<IContactAnniversaire> contacts = new ArrayList<>();

    public void add(IContactAnniversaire contact) {
        contacts.add(contact);
    }

    public void envoyerMessagesAnniversaire() {
        for (IContactAnniversaire contact : contacts) {
            contact.envoyerMessageAnniversaire();
        }
    }
}

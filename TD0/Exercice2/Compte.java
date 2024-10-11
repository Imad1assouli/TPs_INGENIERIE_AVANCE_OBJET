package ID;

import java.util.ArrayList;

public abstract class Compte {
    protected String id;
    protected String dateCreation;
    protected double montant;
    protected ArrayList<Operation> operations;

    public Compte(String id, String dateCreation) {
        this.id = id;
        this.dateCreation = dateCreation;
        this.operations = new ArrayList<>();
        this.montant = 0;
    }

    public abstract boolean addOperation(Operation operation);

    protected abstract double calculerMontant(Operation operation);

    public String getId() {
        return id;
    }

    public double getMontant() {
        return montant;
    }
}

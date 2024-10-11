package ID;

public class Courant extends Compte {

    public Courant(String id, String dateCreation) {
        super(id, dateCreation);
    }

    @Override
    public boolean addOperation(Operation operation) {
        if (operation.getTypeOperation() == TypeOperation.Debit) {
            this.operations.add(operation);
            this.montant += operation.getMontant();
            return true;
        } else {
            if (this.montant >= operation.getMontant()) {
                this.operations.add(operation);
                this.montant -= operation.getMontant();
                return true;
            }
            return false;
        }
    }

    @Override
    protected double calculerMontant(Operation operation) {
        return operation.getMontant();
    }
}

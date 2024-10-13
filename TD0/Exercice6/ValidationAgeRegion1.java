public class ValidationAgeRegion1 implements IValidationAge {
    @Override
    public boolean peutBoireAlcool(int age) {
        return age >= 21;
    }

    @Override
    public boolean peutUtiliserFesseBouk(int age) {
        return age >= 14;
    }

    @Override
    public boolean peutEtreEluMaire(int age) {
        return age >= 25;
    }
}
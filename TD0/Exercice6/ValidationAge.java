import java.util.HashMap;
import java.util.Map;

public class ValidationAge {
    private Map<String, int[]> ageLimits;

    public ValidationAge() {
        ageLimits = new HashMap<>();
        ageLimits.put("default", new int[]{18, 13, 21}); // {alcool, FesseBouk, maire}
        ageLimits.put("region1", new int[]{22, 14, 25});
        ageLimits.put("region2", new int[]{20, 18, 26});
    }

    public boolean peutBoireAlcool(int age, String region) {
        int limiteAlcool = ageLimits.getOrDefault(region, ageLimits.get("default"))[0];
        return age >= limiteAlcool;
    }

    public boolean peutUtiliserFesseBouk(int age, String region) {
        int limiteFesseBouk = ageLimits.getOrDefault(region, ageLimits.get("default"))[1];
        return age >= limiteFesseBouk;
    }

    public boolean peutEtreEluMaire(int age, String region) {
        int limiteMaire = ageLimits.getOrDefault(region, ageLimits.get("default"))[2];
        return age >= limiteMaire;
    }
}

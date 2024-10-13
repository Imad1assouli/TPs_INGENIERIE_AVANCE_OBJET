package ID;

abstract class CompteUniversitaire {
    protected String login;

    public abstract void genererLogin();

    public String getLogin() {
        return login;
    }
}

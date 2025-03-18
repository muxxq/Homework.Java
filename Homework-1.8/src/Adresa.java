public class Adresa {
    private String strada;
    private String numar;
    private String oras;

    public Adresa(String strada, String numar, String oras) {
        this.strada = strada;
        this.numar = numar;
        this.oras = oras;
    }

    public String getStrada() {
        return strada;
    }

    public String getNumar() {
        return numar;
    }

    public String getOras() {
        return oras;
    }
}
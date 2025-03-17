public class Persoana {
    private String nume;
    private int varsta;
    private String oras;

    public Persoana(String nume, int varsta, String oras) {
        this.nume = nume;
        this.varsta = varsta;
        this.oras = oras;
    }
    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", oras='" + oras + '\'' +
                '}';
    }
}

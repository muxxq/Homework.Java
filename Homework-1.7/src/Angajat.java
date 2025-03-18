public class Angajat extends Persoana {
    private Adresa adresa;
    private Companie companie;

    public Angajat(String nume, String prenume, Adresa adresa, Companie companie) {
        super(nume, prenume);
        this.adresa = adresa;
        this.companie = companie;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    public Companie getCompanie() {
        return companie;
    }

    public void setCompanie(Companie companie) {
        this.companie = companie;
    }
}
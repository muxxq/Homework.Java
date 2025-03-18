import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nume;
    private Adresa adresa;
    private List<Tourist> turisti;

    public Hotel(String nume, Adresa adresa) {
        this.nume = nume;
        this.adresa = adresa;
        this.turisti = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    public List<Tourist> getTuristi() {
        return turisti;
    }

    public void adaugaTurist(Tourist turist) {
        turisti.add(turist);
    }

    public void stergeTurist(Tourist turist) {
        turisti.remove(turist);
    }
}
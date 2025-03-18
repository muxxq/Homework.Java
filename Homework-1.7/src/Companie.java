import java.util.ArrayList;
import java.util.List;

public class Companie {
    private String nume;
    private List<Angajat> angajati;

    public Companie(String nume) {
        this.nume = nume;
        this.angajati = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public List<Angajat> getAngajati() {
        return angajati;
    }

    public void adaugaAngajat(Angajat angajat) {
        angajati.add(angajat);
    }

    public void stergeAngajat(Angajat angajat) {
        angajati.remove(angajat);
    }

    public List<Angajat> gasesteAngajatDupaAdresa(Adresa adresa) {
        List<Angajat> angajatiCuAdresa = new ArrayList<>();
        for (Angajat angajat : angajati) {
            if (angajat.getAdresa().equals(adresa)) {
                angajatiCuAdresa.add(angajat);
            }
        }
        return angajatiCuAdresa;
    }
}
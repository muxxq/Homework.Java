public class Tourist extends Persoana {
    private Adresa adresa;
    private Hotel hotel;

    public Tourist(String nume, String prenume, Adresa adresa, Hotel hotel) {
        super(nume, prenume);
        this.adresa = adresa;
        this.hotel = hotel;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
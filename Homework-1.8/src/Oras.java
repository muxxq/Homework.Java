import java.util.ArrayList;
import java.util.List;

public class Oras {
    private String nume;
    private List<Hotel> hoteluri;

    public Oras(String nume) {
        this.nume = nume;
        this.hoteluri = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public List<Hotel> getHoteluri() {
        return hoteluri;
    }

    public void adaugaHotel(Hotel hotel) {
        hoteluri.add(hotel);
    }

    public void stergeHotel(Hotel hotel) {
        hoteluri.remove(hotel);
    }
}

public class AdapterHelper {
    private static final double USD_TO_RON = 4.5;

    public static Produs productToProdus(Product product) {
        int id = product.getId();
        String nume = product.getName();
        double pretRON = product.getPriceUSD() * USD_TO_RON;
        return new Produs(id, nume, pretRON);
    }

    public static Product produsToProduct(Produs produs) {
        int id = produs.getId();
        String name = produs.getNume();
        double priceUSD = produs.getPretRON() / USD_TO_RON;
        return new Product(id, name, priceUSD);
    }

    public static void main(String[] args) {
        Product p = new Product(1, "Laptop", 1000);
        Produs prod = productToProdus(p);
        System.out.println("Produs: " + prod.getNume() + ", Pret (RON): " + prod.getPretRON());

        Produs produs = new Produs(2, "Telefon", 2250);
        Product prodBack = produsToProduct(produs);
        System.out.println("Product: " + prodBack.getName() + ", Price (USD): " + prodBack.getPriceUSD());
    }
}

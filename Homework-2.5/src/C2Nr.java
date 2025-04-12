
public class C2Nr {
    private int a, b;

    public C2Nr(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculeazaSuma() {
        return a + b;
    }

    public static void main(String[] args) {
        C2Nr obj = new C2Nr(5, 7);
        System.out.println("Suma a doua numere: " + obj.calculeazaSuma());
    }
}


public class C3Nr {
    private int a, b, c;

    public C3Nr(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
s
    public int calculeazaSuma() {
        return a + b + c;
    }

    public static void main(String[] args) {
        C3Nr obj = new C3Nr(2, 4, 3);
        System.out.println("Suma a trei numere: " + obj.calculeazaSuma());
    }
}

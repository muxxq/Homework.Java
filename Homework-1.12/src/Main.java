public  class Main {
    public static void main(String[] args) {
        int a;
        int b;
        a = 1;
        try { b = 10/a;
        } catch (ArithmeticException e) {
            System.out.println("Impartire prin 0. b=0");
            b = 0;
            e.printStackTrace();
        } catch (Exception e) {
            b = -1;
            System.out.println("Eroare generala");
            e.printStackTrace();
        }
        System.out.print("b="+b);
    }
}
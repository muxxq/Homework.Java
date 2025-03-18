public class Main {
    public static void main(String[] args) {
        Patrat patrat = new Patrat("Rosu", 2);
        Cerc cerc = new Cerc("Albastru", 3);
        Sfera sfera = new Sfera("Verde", 4);
        Cub cub = new Cub("Galben", 2);

        System.out.println(patrat.getAria()); // Example output: 4.0
        System.out.println(cerc.getAria()); // Example output: 28.27
        System.out.println(sfera.getVolum()); // Example output: 268.08
        System.out.println(cub.getVolum()); // Example output: 8.0
    }
}
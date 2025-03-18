public class Robot {
    private String nume;
    private int x;
    private int y;

    public Robot(String nume) {
        this.nume = nume;
        this.x = 0;
        this.y = 0;
    }

    public String getNume() {
        return nume;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(int dx, int dy) {
        // Implementare stub
        System.out.println("Robot " + nume + " moved by (" + dx + ", " + dy + ")");
    }

    public void turnLeft() {
        // Implementare stub
        System.out.println("Robot " + nume + " turned left");
    }

    public void turnRight() {
        // Implementare stub
        System.out.println("Robot " + nume + " turned right");
    }

    public void reportPosition() {
        // Implementare stub
        System.out.println("Robot " + nume + " position: (" + x + ", " + y + ")");
    }
}
public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("Wall-E");

        System.out.println("Robot nume: " + robot.getNume());
        System.out.println("Robot pozitie initiala: (" + robot.getX() + ", " + robot.getY() + ")");

        robot.move(5, 3);
        robot.turnLeft();
        robot.turnRight();
        robot.reportPosition();
    }
}
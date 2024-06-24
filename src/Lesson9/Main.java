package Lesson9;
public class Main {

    public static void main(String[] args) {
        SmartRobot robot = new SmartRobot();
        robot.moveDown();
        robot.moveDown();
        robot.moveLeft();
        robot.moveUp();
        robot.moveDown();
        robot.moveLeft();
        robot.moveLeft();

        System.out.println("Координаты робота: " + robot.getX() + ":" + robot.getY());
        System.out.println("Количество шагов: " + robot.getStepsCount());
    }
}

class Robot {
    private int x;
    private int y;

    public void moveRight() {
        x++;
    }

    public void moveLeft() {
        x--;
    }

    public void moveUp() {
        y--;
    }

    public void moveDown() {
        y++;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class SmartRobot extends Robot {
    // Ваш код

    private int x;
    private int y;
    int counter = 0;

    @Override
    public void moveRight() {
        x++;
        counter ++;
    }

    @Override
    public void moveLeft() {
        x--;
        counter ++;
    }

    @Override
    public void moveUp() {
        y--;
        counter ++;
    }

    @Override
    public void moveDown() {
        y++;
        counter ++;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }


    public int getStepsCount() {
        return counter;
        // ваш код
    }

}
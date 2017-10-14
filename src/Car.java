import java.util.Scanner;

public class Car {
    int fuel;
    boolean isStart;
    boolean isMoving;
    boolean isStop;


    public void check(String expression) {

        if (expression.matches("[0-9]+")) {
            int f = Integer.parseInt(expression);
            fillTheTank(f);
        } else if (expression.equalsIgnoreCase("start")) {
            start();
        } else if (expression.contains("go")) {
            int distanceToGo = Integer.parseInt(expression.split(" ")[1]);
            if (isStart && !isStop) {
                if (fuel > 0 && fuel >= distanceToGo) {
                    this.isMoving = true;
                    drive(distanceToGo);
                } else {
                    System.out.println("car has not enough fuel to go!");
                }
            } else if (!isStart) {
                System.out.println("car is not started yet!");
            } else {
                System.out.println("car is stopped! First start the car");
            }
        } else if (expression.equalsIgnoreCase("stop")) {
            stop();
        }
    }

    public void fillTheTank(int amount) {
        if (amount > 0) {
            fuel += amount;
            System.out.println("now your car has " + fuel + " litters");
        } else {
            System.out.println("wrong number!");
        }
    }

    public void start() {
        if (fuel > 0) {
            isStop = false;
            isStart = true;
            System.out.println("car is start.");
        } else {
            System.out.println("car has not fuel!");
        }
    }

    public void drive(int distance) {
        if (distance > 0) {

            fuel -= distance;
            System.out.println("now car go until " + distance + " meters, have fun ;)");
            System.out.println("now your car has " + fuel + " litters remaind");
        } else {
            System.out.println("wrong number!");
        }
    }

    public void stop() {
        if (isStop) {
            System.out.println("car has been STOPPED!");
        } else {
            if (isStart) {
                System.out.println("car is stop.");
            } else {
                System.out.println("car is NOT ON!");
            }
        }
        isStop = true;
        isMoving = false;
    }
}

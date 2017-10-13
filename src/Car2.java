import java.util.Scanner;

public class Car2 {
    int fuel = 0;
    boolean isStart;
    boolean isStop;
    Scanner scan = new Scanner(System.in);

    public void TYPE(String expression) {

        if (expression.matches("[0-9]")) {
            int f = Integer.parseInt(expression);
            Gasoline(f);
        }

        if (expression.contains("start")) {
            Start();
        }

        if (expression.contains("go")) {
            if (isStop = false) {
                if (fuel > 0) {
                    System.out.println("how many meters?");
                    int distance = scan.nextInt();
                    Drive(distance);
                } else {
                    System.out.println("car has not fuel!");
                }
            } else {
                System.out.println("car was stopped!");
            }
        }

        if (expression.contains("stop")) {
            Stop();
        }
    }

    public void Gasoline(int f) {
        if (f > 0) {
            fuel += f;
            System.out.println("now your car has " + fuel + "litters");
        } else {
            System.out.println("wrong number!");
        }
    }

    public void Start() {
        if (fuel > 0) {
            isStop = false;
            isStart = true;
            System.out.println("car is start.");
        } else {
            System.out.println("car has not fuel!");
        }
    }

    public void Drive(int distance) {
        if (distance > 0) {
            if (distance > fuel) {
                System.out.println("fuel is not enough!");
            } else {
                fuel -= distance;
                System.out.println("now car go until " + distance + "meters");
                System.out.println("now your car has " + fuel + "litters");
            }
        } else {
            System.out.println("wrong number!");
        }
    }

    public void Stop() {
        if (isStop = true) {
            System.out.println("car has been STOPPED!");
        } else {
            if (isStart = true) {
                System.out.println("car is stop.");
            } else {
                System.out.println("car is NOT ON!");
            }
        }
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class Project9 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        Car2 car = new Car2();

        System.out.println("WELCOME");

        System.out.println("fuel was empty!add gas to car");
        int fuel = scan.nextInt();
        car.Gasoline(fuel);

        boolean type = true;
        while (type) {
            System.out.println("what you want to do?");
            String work = scan.next();
            try {
                car.TYPE(work);
            } catch (Exception e) {
                System.out.println("wrong word");
                String work2 = scan.next();
                car.TYPE(work2);
            }
        }
    }
}

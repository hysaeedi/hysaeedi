import java.util.Scanner;

public class Project9 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        Car car = new Car();

        System.out.println("WELCOME");

        System.out.println("tank is empty now!add gas to car");
        int fuel = scan.nextInt();
        scan.nextLine();
        car.fillTheTank(fuel);

        boolean type = true;
        while (type) {
            //System.out.println("what you want to do?");
            String work = scan.nextLine();
            try {
                car.check(work);
            } catch (Exception e) {
                System.out.println("wrong word");
                String work2 = scan.next();
                car.check(work2);
            }
        }
    }
}

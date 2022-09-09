import java.util.Scanner;

public class SuperGreeter {
    public void start() {
    }
    public static void main(String[] args) {
        SuperGreeter sg = new SuperGreeter();
        System.out.println("Det virker!");
        sg.start();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

    }

}

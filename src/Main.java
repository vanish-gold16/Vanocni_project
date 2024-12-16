import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        int input = 0;
        int time = 0;
        Scanner scanner = new Scanner(System.in);
        menu empty = new menu();
        System.out.print(empty.toString());
        menu menu = new menu(scanner.nextLine());
        System.out.println(menu.gameStart(menu.getName()));

        System.out.print("Time for a new line to appear (write in seconds): ");
        time = 1000 * scanner.nextInt();

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        System.out.println("You are young detective and you are on a mission in a small town.");
        Thread.sleep(time);
        System.out.println("Your goal is to detect a prisoner that escaped from a prison.");
        Thread.sleep(time);
        System.out.println("You know only 4 things about him (memorise them good): ");
        Thread.sleep(time);
        System.out.println("1. He is bold");
        Thread.sleep(time);
        System.out.println("2. He had an athletic build");
        Thread.sleep(time);
        System.out.println("3. He was 30 years old.");
        Thread.sleep(time);
        System.out.println("4. He is a gambler.");
        Thread.sleep(time);

        System.out.println("To continue, press 1.");
        do{
            input = scanner.nextInt();
        }while(input != 1);

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        System.out.println("Where will you go?");
        System.out.println("1. Taverna");
        System.out.println("2. Police station");

    }
}
import java.util.Scanner;
public class menu {
    private String name;

    @Override
    public String toString() {
        return "Hello! Welcome to The Game! Please enter the name: ";
    }

    public String gameStart(String name){
        this.name = name;
        return name + ", welcome!";
    }

    public menu(String name) {
        this.name = name;
    }

    public menu(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    private int credits;
//    private int lostCredits;
//    private int wonCredits;
//    private int game;
//
//    Scanner scanner = new Scanner(System.in);
//
//    public void mainMenu(int credits, int game){
//        this.credits = credits;
//        this.game = game;
//        game = 1;
//
//        System.out.println("Hello! And welcome to the Game House.");
//        System.out.println("From start you have 1000 credits.");
//        while(game < 4 && game > 0){
//            System.out.println("Which game do you want to play?\n1.");
//            game = scanner.nextInt();
//        }
//    }
//
//    public menu(int credits, int lostCredits, int wonCredits, int game) {
//        this.credits = credits;
//        this.lostCredits = lostCredits;
//        this.wonCredits = wonCredits;
//        this.game = game;
//    }
//
//    public int getGame() {
//        return game;
//    }
//
//    public void setGame(int game) {
//        this.game = game;
//    }
//
//    public int getLostCredits() {
//        return lostCredits;
//    }
//
//    public void setLostCredits(int lostCredits) {
//        this.lostCredits = lostCredits;
//    }
//
//    public int getWonCredits() {
//        return wonCredits;
//    }
//
//    public void setWonCredits(int wonCredits) {
//        this.wonCredits = wonCredits;
//    }
//
//    public int getCredits() {
//        return credits;
//    }
//
//    public void setCredits(int credits) {
//        this.credits = credits;
//    }
}

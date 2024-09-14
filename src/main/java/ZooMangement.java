import java.util.Scanner;

public class ZooMangement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Donner les nbr de cages : ");
        int nbrCages = scanner.nextInt();

        System.out.println("Donner les zoo name : ");
        String zooName = scanner.nextLine();

        System.out.println(zooName + " " + "comporte" + " " + nbrCages + " " + "cages");

        scanner.close();
    }
}

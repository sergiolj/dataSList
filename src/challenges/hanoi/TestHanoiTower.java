package challenges.hanoi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestHanoiTower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int discs=0;
        System.out.println("Hanoi Tower Procedural Version: \n" +
                        "Obs: Works with only 3 discs.") ;
        HanoiTowerProcedural hp = new HanoiTowerProcedural(3);
        hp.solve();
        do {
            try {
                System.out.println("Hanoi Tower Recursive Version: \n" +
                        "Feel free to test with any number of discs you like: ");
                discs = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Invalid option. Only integer are allowed!!\n");
                sc.nextLine();
            }
            System.out.println("Invalid option. Only positive integers are allowed!!\n");
        } while (discs <= 0);

        HanoiTowerRecursive hr = new HanoiTowerRecursive(discs);
        hr.solve();
    }
}

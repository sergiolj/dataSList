package challenges.hanoi;

import java.util.*;

public class HanoiTowerRecursive {
    private final Stack<Integer> base;
    private final Stack<Integer> aux;
    private final Stack<Integer> destiny;

    private String movement = "Game is set!\n";
    private int numberOfMovements = 0;
    private final int discNumber;
    private String sFrom, sTo;

    public HanoiTowerRecursive(int discNumber) {
        this.discNumber = discNumber;
        this.base = new Stack<>();
        this.aux = new Stack<>();
        this.destiny = new Stack<>();
        setDisks();
    }

    private void setDisks() {
        for (int i = discNumber; i >= 1; i--) {
            base.push(i);
        }
        viewStackSideBySide();
    }

    private void viewStackSideBySide() {
        List<Integer> iA = new ArrayList<>(base);
        List<Integer> iB = new ArrayList<>(aux);
        List<Integer> iD = new ArrayList<>(destiny);

        System.out.println("\nHanoi Tower movement: ["+ numberOfMovements +"]");
        System.out.println(movement);
        for (int i = discNumber - 1; i >=0 ; i--) {
            String s1 = iA.size() >i ? iA.get(i).toString() : "|";
            String s2 = iB.size() >i ? iB.get(i).toString() : "|";
            String s3 = iD.size() >i ? iD.get(i).toString() : "|";
            System.out.printf("%-10s %-10s %-10s\n",s1,s2,s3);
        }
        System.out.println();
        System.out.println("-------------------------\n");
    }

    private void solveHanoi(int n, Stack<Integer> base, Stack<Integer> aux, Stack<Integer> destiny) {
        if (n == 1) {
            changeColumn(base, aux, destiny);
            movement = "Move disc " + base.peek() + " from "+ sFrom + " to " + sTo;
            destiny.push(base.pop());
            numberOfMovements++;
            viewStackSideBySide();
            return;
        }

        solveHanoi(n - 1, base, destiny, aux);
        changeColumn(base, aux, destiny);
        movement = "Move disc " + base.peek() + " from " + sFrom +  " to " + sTo;
        destiny.push(base.pop());
        numberOfMovements++;
        viewStackSideBySide();
        solveHanoi(n - 1, aux, base, destiny);
    }

    private void changeColumn(Stack<Integer> base, Stack<Integer> aux, Stack<Integer> destiny) {
        if (base == this.base) {
            sFrom = "A";
            sTo = (aux == this.aux) ? "C" : "B";
        } else if (base == this.aux) {
            sFrom = "B";
            sTo = (aux == this.base) ? "C" : "A";
        } else if (base == this.destiny) {
            sFrom = "C";
            sTo = (destiny == this.aux) ? "B" : "A";
        }
    }

    public void solve() {
        solveHanoi(discNumber, base, aux, destiny);
        System.out.print("Problem solved in " + numberOfMovements + " movements\n");
    }
}

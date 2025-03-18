package challenges.hanoi;

import java.util.*;

public class HanoiTowerProcedural {
    private final Stack<Integer> base;
    private final Stack<Integer> auxiliary;
    private final Stack<Integer> destiny;

    private final int discNumber;

    public HanoiTowerProcedural(int discNumber) {
        this.discNumber = discNumber;
        this.base = new Stack<>();
        this.auxiliary = new Stack<>();
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
        List<Integer> iB = new ArrayList<>(auxiliary);
        List<Integer> iD = new ArrayList<>(destiny);

        System.out.println("\nHanoi Tower movements:");
       for (int i = discNumber - 1; i >=0 ; i--) {
            String s1 = iA.size() >i ? iA.get(i).toString() : "-";
            String s2 = iB.size() >i ? iB.get(i).toString() : "-";
            String s3 = iD.size() >i ? iD.get(i).toString() : "-";
            System.out.printf("%-10s %-10s %-10s\n",s1,s2,s3);
        }
        System.out.println();
        System.out.println("-------------------------\n");
    }

    public void solve(){
        destiny.add(base.pop());
        viewStackSideBySide();
        auxiliary.add(base.pop());
        viewStackSideBySide();
        auxiliary.add(destiny.pop());
        viewStackSideBySide();
        destiny.add(base.pop());
        viewStackSideBySide();
        base.add(auxiliary.pop());
        viewStackSideBySide();
        destiny.add(auxiliary.pop());
        viewStackSideBySide();
        destiny.add(base.pop());
        viewStackSideBySide();
    }
}

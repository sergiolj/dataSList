package challenges.hanoi;

public class HanoiRecSimple {
    private final int discNumber;
    private final Character A, B, C;
    private int movements = 0;
    private int recursions = 0;

    public HanoiRecSimple(int discNumber) {
        this.discNumber = discNumber;
        A = 'A';
        B = 'B';
        C = 'C';
    }
    private void solve(int i, Character from, Character aux, Character to){
        if(i != 1){
            recursions++;
            System.out.println("Recursion: " + recursions+ " started (" + "i="+i+")");
        }
        if(i == 1){
            recursions++;
            System.out.println("Recursion: " + recursions+ " started (" + "i="+i+")");
            movements++;
            System.out.println ("Move " + i + " from " + from + " to " + to);
            return;
        }
            //Move discs from A to B using C as auxiliary
            solve(i-1, from, to, aux);
            System.out.println("Move " + i + " from " + from + " to " + to);
            movements++;

            //Move discs from B to C using A as auxiliary
            solve(i-1, aux, from, to);
    }

    public void solve(){
        solve(discNumber, A, B, C);
        System.out.println("\nPuzzle solved in " + movements + " movements");
        System.out.println("Recursions: " + recursions);
    }

}

package javaRevisionExercises.models;

public class RelationalOperators extends Operand {

    public RelationalOperators() {
        super();
    }

    public void higher(){
        int higher = Math.max(getN1(), getN2());
        System.out.println("\nHigher number: "+ higher);

    }

    public void compare() {
        String compare = getN1() == getN2()? "\nNumbers are identical" : "\nNumbers are different";
        System.out.println(compare);
        if(getN1()!=getN2()) {
            String order = getN1() > getN2() ?
                    "\nFirst number [" + getN1() + "] is greater than the second one [" + getN2() + "]" :
                    "\nSecond number [" + getN2() + "] is greater than the first one [" + getN1() + "]";
            System.out.println(order);
        }
    }
}
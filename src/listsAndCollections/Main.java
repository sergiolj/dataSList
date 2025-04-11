package listsAndCollections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Contacts c1 = new Contacts("Sergio","719999494");
        Contacts c2 = new Contacts("Mara","719999494");
        Contacts c3 = new Contacts("John","719999494");
        Contacts c4 = new Contacts("Jane","719999494");

        List<Contacts> myAgenda =  new LinkedList<Contacts>();
        myAgenda.add(c1);


        Queue<String> filaBanco = new LinkedList<>();


        System.out.printf(myAgenda.toString());

    }


}

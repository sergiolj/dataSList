package list1.tadExerc.tad;

import list1.tadExerc.interfaces.Bill;
import list1.tadExerc.models.Order;

public class PurchaseList extends MyList <Order> implements Bill {
    @Override
    public double bill() {
        return 0;
    }

    @Override
    public double tip() {
        return 0;
    }
}

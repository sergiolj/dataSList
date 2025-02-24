package list1.tadExerc.tad;

import list1.tadExerc.interfaces.IOrderList;
import list1.tadExerc.models.Order;

public class TadPurchaseList extends MyList <Order> implements IOrderList {
    @Override
    public double bill() {
        return 0;
    }
}

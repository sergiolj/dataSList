package list1.tadExerc.tad;

import list1.tadExerc.models.Employe;

public class TadCompany extends MyList<Employe> {
    private String name;
    private String address;
    private String phone;

    public TadCompany(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    public TadCompany(String name) {
        this.name = name;
    }

}

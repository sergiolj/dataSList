package list1.tadExerc.models;

import list1.tadExerc.tad.MyList;

public class Company {
        private String name;
        private String address;
        private String phone;
        private MyList<Employe> employees = new MyList<>();

        public Company(String name, String address, String phone) {
            this.name = name;
            this.address = address;
            this.phone = phone;
        }
        public Company(String name) {
            this.name = name;
        }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getName() {
            return name;
    }

    public MyList<Employe> getEmployees() {
        return employees;
    }
}

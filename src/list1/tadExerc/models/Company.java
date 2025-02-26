package list1.tadExerc.models;

import list1.tadExerc.tad.MyList;

public class Company {
        private final String businessTaxId;
        private final String name;
        private String address;
        private String phone;
        private final MyList<Employee> employees = new MyList<>();

    public Company(String businessTaxId, String name, String address, String phone) {
        this.businessTaxId = businessTaxId;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public Company(String name) {
            this.name = name;
            this.businessTaxId = null;
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

    public void addEmployee(Employee e) {
        if(e != null) {
            employees.add(e);
        }else{
            throw new NullPointerException("Employee cannot be null");
        }
    }
}

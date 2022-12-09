package Adapter;

import java.util.*;

public class EmployeeDetails implements IEmployeeDetails {
    private int id;
    private String name;
    private String position;
    private long phoneNo;

    public EmployeeDetails(){}

    public long getPhoneNumber(){
        return this.phoneNo;
    }

    public EmployeeDetails(int id, String name, String position, long phoneNo) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.phoneNo = phoneNo;
    }

    public List<IEmployeeDetails> getEmployeesDetails() {
        List<IEmployeeDetails> emps = new ArrayList<>();
        emps.add(new EmployeeDetails(1, "drumil", "sde1", 9033107408L));
        emps.add(new EmployeeDetails(2, "jay", "sde2", 9429198707L));
        return emps;
    }
}

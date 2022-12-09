package Adapter;
import java.util.*;

import Adapter.*;

public class StaffEmployeesDetails implements IEmployeeDetails{

    private int id;
    private String name;
    private String position;
    private long phoneNo;
    private int age;

    public long getPhoneNumber(){
        return this.phoneNo;
    }
    public StaffEmployeesDetails(){}
    public StaffEmployeesDetails(int id, String name, String position, long phoneNo,int age) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.phoneNo = phoneNo;
        this.age = age;
    }

    public List<IEmployeeDetails> getEmployeesDetails() {
        List<IEmployeeDetails> emps = new ArrayList<>();
        emps.add(new StaffEmployeesDetails(1, "drumil", "sde1", 9033107408L,20));
        emps.add(new StaffEmployeesDetails(2, "jay", "sde2", 9429198707L,19));
        return emps;
    }
}
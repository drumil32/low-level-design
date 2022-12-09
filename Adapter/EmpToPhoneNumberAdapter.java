package Adapter;

import java.util.*;

public class EmpToPhoneNumberAdapter implements IEmpToPhoneNumberAdapter {
    List<IEmployeeDetails> emps;

    public EmpToPhoneNumberAdapter(List<IEmployeeDetails> emps) {
        this.emps = emps;
    }

    public List<Long> getPhoneNumbers() {
        List<Long> phones = new ArrayList<>();
        for (IEmployeeDetails emp : emps) {
            phones.add(emp.getPhoneNumber());
        }
        return phones;
    }
}

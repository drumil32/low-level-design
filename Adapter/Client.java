package Adapter;

import Adapter.*;
import java.util.*;

// client who knows all three class
// intranet which wants only students data
// EmployeeDetails which will give output as all the details related to employees
// EmpToPhoneNumberAdapter convertor
public class Client {
    public static void main(String[] args) {
        IEmployeeDetails producer = new StaffEmployeesDetails();
        List<IEmployeeDetails> emps = producer.getEmployeesDetails();

        IEmpToPhoneNumberAdapter adapter = new EmpToPhoneNumberAdapter(emps);

        Intranet intranet = new Intranet(adapter);

        intranet.printPhoneNumber();
    }
}

package Adapter;

import java.util.*;

// consumer
public class Intranet {
    IEmpToPhoneNumberAdapter source;
    public Intranet(IEmpToPhoneNumberAdapter source) {
        this.source = source;
    }

    public void printPhoneNumber(){
        List<Long> phones = this.source.getPhoneNumbers();
        System.out.println(phones);
    }
}


// public class Intranet{
//     IPhoneListSource source;

//     public Intranet(IPhoneListSource source){
//         this.source = source;
//     }

//     public void printPhoneNumber(){
//         List<String> phones = this.source.getPhoneNumbers();
//         System.out.println(phones);
//     }
// }
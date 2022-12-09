package State.Problem;

// WHAT IS PROBLEM :-
// suppose, in future if we have another state then we need to modify this particular code it self BUT AS WE KNOW ||| our code should be open for extension and close for modification |||

public class Product {
    int state;
    Product(){this.state = 0;}
    public void setState(int state){this.state = state;}
    public int getState(){return this.state;}
    public void giveOperationDetailsWithState(){
        if( 5>this.state ){
            System.out.println("this is state is len then 5 so you can cancel the order and ");
        }else if( 5==this.state ){
            System.out.println("this is state is 5 so you can replace the order");
        }else{
            System.out.println("so now you can only take refund");
        }
    }
}

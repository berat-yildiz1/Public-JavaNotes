import java.util.ArrayList;

public class Customer {
    int id;
    String firstName;
    String lastName;

    public Customer(){

    }
    public Customer(int id,String firstName,String lastName){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;

    }

}

public class Main {

    public static void main(String[] args) {


        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1,"Berat","Yildiz"));
        customers.add(new Customer(2,"Ferat","Fildiz"));
        customers.add(new Customer(3,"Zerat","Zildiz"));

        //customers.remove(new Customer(2,"Ferat","Fildiz"));//can't remove,kept with reference number
        //customers.remove(1)// it works

        for(Customer i:customers){

            System.out.println(i.id+" "+i.firstName+" "+i.lastName);

        }
        
    }
}

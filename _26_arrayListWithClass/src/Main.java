import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers= new ArrayList<Customer>();
        customers.add(new Customer(1,"Şenol","Kumaş"));
        customers.add(new Customer(2,"Özge","Kumaş"));

        Customer asd=new Customer(3,"Asdasd","Kumaş");
        customers.add(asd);

        //customers.remove(new Customer(3,"asdasd","Kumaş"));//Bu şekilde silinmez yukardaki tanımlama şeklini referans haline getirip silmemiz gerek.
        customers.remove(asd);
        for(Customer yazdir:customers){
            System.out.println(yazdir.id +" "+ yazdir.firstName +" "+ yazdir.lastName);
        }
    }
}
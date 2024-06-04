package Application;

import Entities.Cliente;
import Entities.OrderItem;
import Entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        Cliente cli = new Cliente("Túlio" , "sirtulio10@gmail.com", sdf.parse("20/07/2002") );
        Product p = new Product("TV" , 1000.0);
        OrderItem oi1 = new OrderItem(1, 1000.0, p);
        System.out.println(cli);
        System.out.println(oi1);

        sc.close();
    }
}

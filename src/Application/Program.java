package Application;

import Entities.Cliente;
import Entities.Order;
import Entities.OrderItem;
import Entities.Product;
import Entities.enums.OrderStatus;

import java.lang.ref.Cleaner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter client data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.next();
        System.out.println("Birth Date (DD/MM/YYYY): ");
        Date aniversario = sdf.parse(sc.next());

        Cliente cliente = new Cliente(name, email , aniversario);

        System.out.println("Enter data: ");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, cliente);

        System.out.println("How many items to this order? ");
        int n = sc.nextInt();
        for(int i=0; i<n ; i++){
            System.out.println("Enter #" + (i + 1) + " item data: ");
            System.out.println("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.println("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.println("Quantity: ");
            int quantity = sc.nextInt();

            Product produto = new Product(productName, productPrice);

            OrderItem it = new OrderItem(quantity, productPrice,produto);

            order.addItem(it);

        }
        System.out.println();
        System.out.println(order);



        sc.close();
    }
}

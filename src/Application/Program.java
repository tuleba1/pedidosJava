package Application;

import Entities.OrderItem;
import Entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product p = new Product("TV" , 1000.0);
        OrderItem oi1 = new OrderItem(1, 1000.0, p);
        System.out.println(oi1);
        sc.close();
    }
}
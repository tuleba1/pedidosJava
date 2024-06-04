package Entities;

import Entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Order {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date momento;
    private OrderStatus status;
    private Cliente cliente;
    private List<OrderItem> itens = new ArrayList<OrderItem>();
    public Order(){

    }

    public Order(Date momento, OrderStatus status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void addItem(OrderItem item){
        itens.add(item);
    }
    public void removeItem(OrderItem item){
        itens.remove(item);
    }
    public double total(){
        double soma = 0.0;
        for(OrderItem it : itens){
            soma += it.subTotal();
        }
        return soma;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order Moment:");
        sb.append(sdf.format(momento) + "\n");
        sb.append("Order Status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(cliente + "\n");
        sb.append("Order items\n");
        for (OrderItem item : itens){
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();


    }

}

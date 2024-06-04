package Entities;

import Entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
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

}

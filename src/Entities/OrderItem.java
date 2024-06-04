package Entities;

public class OrderItem {
    private Integer quantidade;
    private Double preco;

    private Product product;

    public OrderItem(){

    }

    public OrderItem(Integer quantidade, Double preco, Product product) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.product = product;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        preco = preco;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    public double subTotal(){
        return preco * quantidade;
    }
    @Override
    public String toString(){
        return getProduct().getName()
                + ", $"
                + String.format("%.2f", preco)
                + ", Quantidade: "
                + quantidade
                + ", subtotal: $"
                + String.format("%.2f", subTotal());

    }
}

package org.example.domain;

public class Goods {
    private Integer id;
    private String name;
    private Integer amount;
    private Double price;

    public Goods(Integer id, String name, Integer amount, Double price) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

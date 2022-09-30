package com.clarivate.foodApp.model;

import javax.persistence.*;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Integer quantity;


    @OneToOne
    private FoodProduct foodProduct;


    @ManyToOne
    private FoodOrder foodOrder;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public FoodProduct getFoodProduct() {
        return foodProduct;
    }

    public void setFoodProduct(FoodProduct foodProduct) {
        this.foodProduct = foodProduct;
    }

    public FoodOrder getFoodOrder() {
        return foodOrder;
    }

    public void setFoodOrder(FoodOrder foodOrder) {
        this.foodOrder = foodOrder;
    }

    public Item(Long id, Integer quantity, FoodProduct foodProduct, FoodOrder foodOrder) {
        this.id = id;
        this.quantity = quantity;
        this.foodProduct = foodProduct;
        this.foodOrder = foodOrder;
    }

    public Item() {
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", foodProduct=" + foodProduct +
                ", foodOrder=" + foodOrder +
                '}';
    }
}

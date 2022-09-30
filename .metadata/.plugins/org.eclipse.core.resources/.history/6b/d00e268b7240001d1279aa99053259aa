package com.clarivate.foodApp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class FoodOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String status;
    private Double totalPrice;
    //TODO:change to date later
    private String orderCreatedTime;
    private String orderDeliveryTime;
    private String customerName;
    private String contactNumber;

    @ManyToOne
    User user;

    @JsonIgnore
    @OneToMany(mappedBy = "foodOrder", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    List<Item> items;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getOrderCreatedTime() {
        return orderCreatedTime;
    }

    public void setOrderCreatedTime(String orderCreatedTime) {
        this.orderCreatedTime = orderCreatedTime;
    }

    public String getOrderDeliveryTime() {
        return orderDeliveryTime;
    }

    public void setOrderDeliveryTime(String orderDeliveryTime) {
        this.orderDeliveryTime = orderDeliveryTime;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public FoodOrder(Long id, String status, Double totalPrice, String orderCreatedTime, String orderDeliveryTime, String customerName, String contactNumber, User user, List<Item> items) {
        this.id = id;
        this.status = status;
        this.totalPrice = totalPrice;
        this.orderCreatedTime = orderCreatedTime;
        this.orderDeliveryTime = orderDeliveryTime;
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.user = user;
        this.items = items;
    }

    public FoodOrder() {
    }

    @Override
    public String toString() {
        return "FoodOrder{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", totalPrice=" + totalPrice +
                ", orderCreatedTime='" + orderCreatedTime + '\'' +
                ", orderDeliveryTime='" + orderDeliveryTime + '\'' +
                ", customerName='" + customerName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", user=" + user +
                ", items=" + items +
                '}';
    }
}

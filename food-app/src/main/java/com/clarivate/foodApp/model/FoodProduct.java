package com.clarivate.foodApp.model;

import javax.persistence.*;

@Entity
public class FoodProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    private String about;
    private Boolean availability;
    private Double price;

    @OneToOne(mappedBy = "foodProduct")
    Item item;

    @ManyToOne
    Menu menu;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public FoodProduct(Long id, String name, String type, String about, Boolean availability, Double price, Item item, Menu menu) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.about = about;
        this.availability = availability;
        this.price = price;
        this.item = item;
        this.menu = menu;
    }

    public FoodProduct() {
    }

    @Override
    public String toString() {
        return "FoodProduct{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", about='" + about + '\'' +
                ", availability=" + availability +
                ", price=" + price +
                ", item=" + item +
                ", menu=" + menu +
                '}';
    }
}

package com.example.TestDB3.Product;

import jakarta.persistence.*;

@Entity
@Table(name = "producus")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;
    private String name;
    private String des;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}

package com.test.pets.model;

import jakarta.persistence.*;

@Entity
@Table(name = "fur_color")
public class FurColor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "fur_color")
    private String furColor;

    public FurColor() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public FurColor(long id) {
        this.id = id;
    }
}
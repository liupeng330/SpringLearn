package me.pengliu330.springlearn;

/**
 * Created by peng on 18/2/10.
 */
public class Car {
    private String brand;
    private String color;
    private Integer masSpeed;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", masSpeed=" + masSpeed +
                ", ID =" + super.toString() +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getMasSpeed() {
        return masSpeed;
    }

    public void setMasSpeed(Integer masSpeed) {
        this.masSpeed = masSpeed;
    }
}

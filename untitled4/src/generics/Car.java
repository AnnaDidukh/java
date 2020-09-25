package generics;

import java.util.Objects;

public class Car {
    int id;
    int model;
    int volume;
    String color;
    int power;
    int radius;
    int years;

    public Car(int id, int model, int volume, String color, int power, int radius, int years) {
        this.id = id;
        this.model = model;
        this.volume = volume;
        this.color = color;
        this.power = power;
        this.radius = radius;
        this.years = years;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model=" + model +
                ", volume=" + volume +
                ", color='" + color + '\'' +
                ", power=" + power +
                ", radius=" + radius +
                ", years=" + years +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id &&
                model == car.model &&
                volume == car.volume &&
                power == car.power &&
                radius == car.radius &&
                years == car.years &&
                color.equals(car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, volume, color, power, radius, years);
    }
}

package map;

public class Car implements Comparable<Car>{
    String model;
    int years;
    String color;
    String engine;
    int volume;
    int power;
    int wheel;
    String producter;
    int diameter;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", years=" + years +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", volume=" + volume +
                ", power=" + power +
                ", wheel=" + wheel +
                ", producter='" + producter + '\'' +
                ", diameter=" + diameter +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public String getProducter() {
        return producter;
    }

    public void setProducter(String producter) {
        this.producter = producter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public Car(String model, int years, String color, String engine, int volume, int power, int wheel, String producter, int diameter) {
        this.model = model;
        this.years = years;
        this.color = color;
        this.engine = engine;
        this.volume = volume;
        this.power = power;
        this.wheel = wheel;
        this.producter = producter;
        this.diameter = diameter;
    }

    @Override
    public int compareTo(Car o) {
        return this.years-o.years;
    }
}

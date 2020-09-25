package map;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Car> cars = new TreeSet<>();
        cars.add(new Car("hg56", 2000, "blue", "mh", 8, 200, 75, "Honda", 27));
        cars.add(new Car("hg76", 2001, "green", "mh", 8, 199, 70, "Mazda", 30));
        cars.add(new Car("h566", 2002, "yellow", "mh", 8, 150, 80, "Ferrari", 27));
        cars.add(new Car("atd7", 1998, "red", "mh", 8, 250, 80, "Honda", 27));
        cars.add(new Car("hty7", 1997, "black", "mh", 8, 300, 90, "Honda", 27));
        System.out.println(cars);
        

            }
        }
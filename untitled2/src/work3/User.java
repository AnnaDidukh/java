package work3;

public class User {
    public int id;
    public int age;
    public String name;
    public String surname;
    public double weight;
    public double height;

    public User(int id, int age, String name, String surname, double weight, double height) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

}
 class Car{
    public int power;
    public int volume;
     public String mechanic;
     public int model;
     public int age;
     public int year;

     public Car(int power, int volume, String mechanic, int model, int age, int year) {
         this.power = power;
         this.volume = volume;
         this.mechanic = mechanic;
         this.model = model;
         this.age = age;
         this.year = year;
     }

     @Override
     public String toString() {
         return "Car{" +
                 "power=" + power +
                 ", volume=" + volume +
                 ", mechanic='" + mechanic + '\'' +
                 ", model=" + model +
                 ", age=" + age +
                 ", year=" + year +
                 '}';
     }
 }
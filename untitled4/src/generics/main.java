package generics;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Car> cars=new ArrayList<>();
        cars.add(new Car(1, 34, 5,"Black",200,180,2000));
        cars.add(new Car(2, 34, 5,"Black",200,180,2000));
        cars.add(new Car(3, 34, 5,"Black",200,180,2001));
        cars.add(new Car(4, 34, 5,"Black",200,180,1990));
        cars.add(new Car(5, 34, 5,"Black",200,180,1998));
        cars.add(new Car(6, 34, 5,"Black",200,180,2003));
        cars.add(new Car(7, 34, 5,"Black",200,180,2016));
        cars.add(new Car(8, 34, 5,"Black",200,180,2010));
        cars.add(new Car(9, 34, 5,"Black",200,180,1995));
        cars.add(new Car(10, 34, 5,"Black",200,180,2019));
        cars.add(new Car(11, 34, 5,"Black",200,180,2018));
        cars.add(new Car(12, 34, 5,"Black",200,180,2004));
        cars.add(new Car(13, 34, 5,"Black",200,180,2008));
        cars.add(new Car(14, 34, 5,"Black",200,180,1985));
        cars.add(new Car(15, 34, 5,"Black",200,180,2013));
        cars.add(new Car(16, 34, 5,"Black",200,180,2012));
        cars.add(new Car(17, 34, 5,"Black",200,180,2007));
        cars.add(new Car(18, 34, 5,"Black",200,180,1979));
        cars.add(new Car(19, 34, 5,"Black",200,180,1996));
        cars.add(new Car(20, 34, 5,"Black",200,180,1995));

        for(int i=0;i<cars.size();i++){
            if(cars.get(i).years<2000){
                cars.get(i).radius=cars.get(i).radius-1;
                System.out.println(cars.get(i));
            }
            if(cars.get(i).years>2000){
                cars.get(i).color="green";
                System.out.println(cars.get(i));
            }
    }
//        User <Integer> userInt=new User(1,"Name");
//        User <String> userString=new User("1","Name");
//        User <Boolean>userBoolean=new User(true,"Name");
//        User <Character>userCharacter=new User('1',"Name");

    }

public class User <ID>{
    ID id;
    String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(ID id, String name) {
        this.id = id;
        this.name = name;
    }
}
}

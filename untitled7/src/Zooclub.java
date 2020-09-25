import java.util.*;

public static void main(String[] args){

class Zooclub {

    private Map<Person, List<Pet>> map;
//    Scanner sc= new Scanner(System.in);

    Zooclub() {
        map = new HashMap<>();
        map.put(new Person("Max", 10), new ArrayList<>());
        Person person = new Person("Nick", 19);
        map.get(person).add(new Pet("M", "L"));
        Pet pet = new Pet("met", "d");
        map.get(person).remove(map.get(person).indexOf(pet));
        map.remove(person);

        Set<Person> keySet = map.keySet();
        for (Person key : keySet) {
            if (map.get(key).isEmpty()) {
                System.out.println(key);
            }

        }
    }
}







//    public void vyConsole(){
//        boolean isRun=true;
//        while(isRun ){
//            System.out.println("Натисніть 1,щоб добавити учасника клубу");
//            System.out.println("Натисніть 2,щоб добавити тваринку до учасника клубу");
//            System.out.println("Натисніть 3,щоб видалити тваринку з власника");
//            System.out.println("Натисніть 4,щоб видалити учасника з клубу");
//            System.out.println("Натисніть 5,видалити конкретну тваринку з усіх власників");
//            System.out.println("Натисніть 6,вивести на екран зооклуб");
//            System.out.println("Натисніть 0,щоб добавити нового учасника клубу");
//            switch(sc.next()){
//            case "1":{
//                System.out.println("Введіть імя учасника");
//                String name = sc.next();
//                System.out.println("Age");
//                int age = sc.nextInt();
//                if(map.containsKey(new Person(name,age))) {
//                    System.out.println("Такий учасник вже існує");
//                }else {
//                    map.put(new Person(name, age), new ArrayList<>());
//                }
//            }
//            break;
//                }
//
//            }
//
//        }



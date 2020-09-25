public class Start {
    public static void main(String[] args){
        Animal animal=new Animal();
        WildAnimal wildAnimal=new WildAnimal();
        Pet pet =new Pet();
        Fox fox =new Fox();
        Wolf wolf= new Wolf();
        Cat cat=new Cat ();
        Dog dog=new Dog();
    }
}

class Animal{
    private int id;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
}

class WildAnimal extends Animal{
private int age;
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

}
class Pet extends Animal{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String Name){
        this.name=name;
    }
}
class Fox extends WildAnimal{
    private String SecondN;
    public String getSecondN(){
        return SecondN;
    }
    public void setSecondN(String SecondN){
        this.SecondN=SecondN;
    }
}
class Wolf extends WildAnimal{
    private String state;
    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state=state;
    }
}
class Cat extends Pet{
    private String telephone;
    public String getTelephone(){
        return telephone;
    }
    public void setTelephone(String telephone){
        this.telephone=telephone;
    }
}
class Dog extends Pet{
    private int number;
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number=number;
    }
}

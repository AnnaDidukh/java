class Main {
    public static void main(String[] args) {
     Teacher teacher = new Teacher(0,"sasha","Gert",29,2);
     System.out.println(teacher);
     Programmer programmer = new Programmer(1,"Artur","Yusvishin",25,25000,5);
     System.out.print(programmer);
    }}

class People{
    int id;
    String name;
    String surname;
    int age;

    public People(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
class Teacher extends People{
    int countYearsExperience;

    public Teacher(int id, String name, String surname, int age, int countYearsExperience) {
        super(id, name, surname, age);
        this.countYearsExperience = countYearsExperience;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", countYearsExperience=" + countYearsExperience +
                '}';
    }
}
class Programmer extends People{
    int salary;
    int  countLanguage;

    public Programmer(int id, String name, String surname, int age, int salary, int countLanguage) {
        super(id, name, surname, age);
        this.salary = salary;
        this.countLanguage = countLanguage;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", countLanguage=" + countLanguage +
                '}';
    }
}

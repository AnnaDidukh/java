package generics;

public class User3 {
    int id;
    String name;
    int age;
    String login;
    String password;

    public User3(int id, String name, int age,String login, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.login = login;
        this.password = password;

    }
    @Override
    public String toString() {
        return "User3{" +
                "id=" + id +
                ", Name='" + name + '\'' +
                ", age=" + age +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

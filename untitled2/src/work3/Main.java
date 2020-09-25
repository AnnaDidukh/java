package work3;
import work3.User;
import work3.Car;
public class Main {
    public static void main(String[] args) {
        //1exercise
        double a = 1.0, b = 2.0, c = 3.0, d = 3.0, f = 4.0, e = 3.0, g = 2.0, h = 2.0, t = 2.0, r = 2.0;
        double res;
        res = a + b + c + d + f + e + g + h + t + r;
        System.out.println(res);
        res = a - b - c - d - f - e - g - h - t - r;
        System.out.println(res);
        res = a * b * c * d * f * e * g * h * t * r;
        System.out.println(res);
        res = a / b / c / d / f / e / g / h / t / r;
        System.out.println(res);
        //2exercise
        String ab = "Поразка";
        String bc = "—";
        String cd = "наука";
        String dv = ".";
        String vg = "Ніяка";
        String gk = "перемога";
        String lk = "так";
        String kp = "не";
        String ll = "вчить";
        String gd = ".";
        System.out.println(ab + bc + cd + dv + vg + " " + gk + " " + lk + " " + kp + " " + ll + " " + gd);

    //3
        User user1 = new User(0, 17, "Tanya", "May", 47.8, 165.9);
        User user2 = new User(1, 19, "Anya", "Demkiv", 56.3, 180.4);
        User user3 = new User(2, 23, "Nadia", "Mart", 49.0, 159.9);
        User user4 = new User(3, 45, "Halya", "Let", 67.9, 167.9);
        User user5 = new User(4, 35, "Hanna", "Montana", 94.0, 187.4);
        User user6 = new User(5, 45, "Oksana", "Novakva", 78.7, 170.1);
        User user7 = new User(6, 32, "Galya", "Loboda", 56.9, 125.9);
        User user8 = new User(7, 24, "Mia", "Nia", 60.0, 169.0);
        User user9 = new User(8, 34, "Andelina", "Joli", 76.0, 178.0);
        User user10 = new User(9, 67, "Tina", "Karol", 78.9, 167.0);
        int result = user1.age + user2.age + user3.age + user4.age + user5.age + user6.age + user7.age + user8.age + user9.age + user10.age;
        double res1 = user1.weight + user2.weight + user3.weight + user4.weight + user5.weight + user6.weight + user7.weight + user8.weight + user9.weight + user10.weight;
        double res2 = user1.height + user2.height + user3.height + user4.height + user5.height + user6.height + user7.height + user8.height + user9.height + user10.height;
        System.out.println(result);
        //4
        User[] users = {user1, user2, user3, user4, user5, user6, user7, user8, user9, user10};
        System.out.println(users[0].age + users[1].age + users[2].age + users[3].age + users[4].age + users[5].age + users[6].age + users[7].age + users[8].age + users[9].age);
        System.out.println(users[0].weight + users[1].weight + users[2].weight + users[3].weight + users[4].weight + users[5].weight + users[6].weight + users[7].weight + users[8].weight + users[9].weight);
        System.out.println(users[0].height + users[1].height + users[2].height + users[3].height + users[4].height + users[5].height + users[6].height + users[7].height + users[8].height + users[9].height);
//5
        Car car1=new Car(200,30,"Yes",788,20,1999);
        Car car2=new Car(100,40,"Yes",78,20,1999);
        Car car3=new Car(160,50,"No",788,20,1999);
        Car car4=new Car(180,60,"Yes",788,20,1999);
        Car car5=new Car(180,10,"No",788,20,1999);
        Car car6=new Car(190,40,"Yes",788,20,1999);
        Car car7=new Car(200,60,"Yes",788,20,1999);
        Car car8=new Car(210,70,"Yes",788,20,1999);
        Car car9=new Car(140,20,"Yes",788,20,1999);
        Car car10=new Car(150,20,"Yes",788,20,1999);
        System.out.println(car1.power+car2.power+car3.power+car4.power+car5.power+car6.power+car7.power+ car8.power+car9.power+car10.power);
        System.out.println(car1.volume+car2.volume+car3.volume+car4.volume+car5.volume+car6.volume+car7.volume+ car8.volume+car9.volume+car10.volume);
//6
        Car[] cars={car1,car2,car3,car4,car5,car6,car7,car8,car9,car10};
        System.out.println(cars[0].volume+cars[1].volume+cars[2].volume+cars[3].volume+cars[4].volume+cars[5].volume+cars[6].volume+ cars[7].volume+cars[8].volume+cars[9].volume);
        System.out.println(cars[0].power+cars[1].power+cars[2].power+cars[3].power+cars[4].power+cars[5].power+cars[6].power+ cars[7].power+cars[8].power+cars[9].power);
//7
        int arr[]={4,2,5};
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}

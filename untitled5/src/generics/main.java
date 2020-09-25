package generics;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class main {
    public static void main(String[] args) {

//        List<Integer>user =new ArrayList<>();
//        user.add(2);
//        user.add(17);
//        user.add(13);
//        user.add(6);
//        user.add(22);
//        user.add(31);
//        user.add(45);
//        user.add(66);
//        user.add(100);
//        user.add(-18);
//
//    int i=0;
//    while(i<user.size()){
//        System.out.println(user.get(i));
//        i++;
//    }
//    for (i=0;i<user.size();i++){
//        System.out.println(user.get(i));
//    }
//
//    int a=0;
//        while(a<user.size()){
//            if(user.get(a)%2 == 0){
//            System.out.println(user.get(a));
//
//        }
//        a++;}
//    for( i=0;i<user.size();i++) {
//        if (user.get(i) % 2 == 0) {
//            System.out.println(user.get(i));
//        }
//    }
//    for(int b=user.size()-1;b>0;b--){
//        System.out.println(user.get(b));
//    }
//        List<Integer>ten =new ArrayList<>();
//        Random rand=new Random();
//        int iter=0;
//       while(iter<50){
//           int r = rand.nextInt(100);
//               if (r % 2 == 0) {
//                   System.out.println(r);
//               }
//           iter++;
//        }
//       int ite=0;
//        while(ite<50){
//            int r = rand.nextInt(100);
//            if (r % 2 != 0) {
//                System.out.println(r);
//            }
//            ite++;
//        }
//        List<Integer>numb =new ArrayList<>();
//        for(i=0;i<100;i++){
//           numb.add((int) (Math.random()*(999+999)-999));
//        }
//        for( i=0;i<user.size();i+=3){
//
//                System.out.println(user.get(i));
//
//        }
//        for( i=0;i<user.size();i+=3){
//            if( user.get(i) % 2==0){
//                System.out.println(user.get(i));
//            }
//        }
        List<Person> user = new ArrayList<>();
        user.add(new Person(1, "vaysa", 32));
        user.add(new Person(2, "petya", 31));
        user.add(new Person(3, "kolya", 30));
        user.add( new Person(4, "anya", 29));
        user.add(new Person(5, "masha", 28));
        user.add(new Person(6, "andriy", 30));
        user.add(new Person(7, "maxim", 31));
        user.add(new Person(8, "vadym", 32));
        user.add(new Person(9, "taras", 33));
        List<Auth> user2 = new ArrayList<>();
        user2.add( new Auth(5, "login5", "password5"));
        user2.add(new Auth(2, "login2", "password2"));
        user2.add(new Auth(1, "login1", "password1"));
        user2.add(new Auth(7, "login7", "password7"));
        user2.add(new Auth(3, "login3", "password3"));
        user2.add(new Auth(4, "login4", "password4"));
        user2.add(new Auth(8, "login8", "password8"));
        user2.add(new Auth(6, "login6", "password6"));
        user2.add(new Auth(9, "login9", "password9"));
        List<User3> users3 = new ArrayList<>();
        for (int i = 0; i < user.size() ; i++) {
            for (int k = 0; k < user2.size() ; k++) {
                if(user.get(i).getId() == user2.get(k).getId()){
                    users3.add( new User3( user.get(i).getId(), user.get(i).getName(), user.get(i).getAge(), user2.get(k).getLogin(), user2.get(k).getPassword()));
                }
            }
        }
        System.out.println(users3);

    }
    }


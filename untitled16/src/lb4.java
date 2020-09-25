//public class lb4 {
//
//    public static void main(String[] args) {

//        double A[]={-2.0,-1.0,0,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};
//        int res=0;
//        for(int i=0;i<12;i++)
//        if(A[i]<0){
//           res++;
//        }
//        System.out.println(res);
//       int A[][];
//       A=new int[5][3];
//
//        for(int i=0;i<=3;i++)
//            for(int j=0;j<=i+1;j++)
////                if(A[i][j]<5){
////                    B[i][j]=A[i][j]*2;
//                    System.out.println(A[i][j]);
//                }
//}
import java.util.Scanner;
        public class lb4 {
            public static void main(String args[]) {
                double arr[][]=new double[5][5];
                int d=1;
                Scanner sc=new Scanner(System.in);
                for(int i=0;i<5;i++)
                    for(int j=0;j<5;j++){


                        System.out.print("Введіть число:");
                        arr[i][j]=sc.nextInt();
                    }

                for(int i=0;i<5;i++)
            for(int j=0;j<5;j++){
                d*=arr[i][j];
                System.out.println(d);
            } }
        }

//int A[][] = { { 1,3, 2},
//                { 3, 8, 2 } };
//    int B[][] = { { 1,3, 2},
//            { 3, 8, 2 } };
//
//for(int i=0;i<3;i++)
// for(int j=0;j<3;j++)
//    if(A[i][j]<5){
//        B[i][j]=A[i][j]*2;

//}
//        for(int i=0;i<3;i++)
//            for(int j=0;j<3;j++){
//            System.out.println(A[i][j]);
////
//    }
//}}
//        int a = 0;
//        if (a==0) {
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }
//        switch(a){
//            case 1:
//            System.out.println(1);
//            break;
//            case 0:
//                System.out.println(0);
//                break;
//            case -3:
//                System.out.println(-3);
//                break;
//        }
//        int min=22;
//        if(min>=0 & min<=14){
//            System.out.println("in first term");
//        }
//        if(min>=15 & min<=30){
//            System.out.println("in second term");
//        }
//        if(min>=31 & min<=45){
//            System.out.println("in third term");
//        }
//        if(min>=46 & min<=59){
//            System.out.println("in fourth term");
//        }
//        int b=2,res;
//        if(a<=1 & b>=3) {
//            res=a+b;
//            System.out.println(res);
//        }else{res=a-b; System.out.println(res);}
//        double a=1,b=2,c=3,d=3,f=4,e=3,g=2,h=2,t=2,r=2, res;
//        res=a+b+c+d+f+e+g+h+t+r;
//        System.out.println(res);
//        res=a-b-c-d-f-e-g-h-t-r;
//        System.out.println(res);
//        res=a*b*c*d*f*e*g*h*t*r;
//        System.out.println(res);
//        res=a/b/c/d/f/e/g/h/t/r;
//        System.out.println(res);
//        String[]array ={"i","хочу" ,"більше" ,"вихідних", "в" ,"коледжі"};
//        String res;
//        res1=array+;
//
//        class User{
//            int id;
//            int age;
//            String name;
//            String surname;
//            double height;
//        }
//        User User1 =  new User();
//        User1.id=1;
//        User1.age=17;
//        User1.name="Anna";
//        User1.surname="Didukh";
//        User1.height=1.65;
//        System.out.println(User1);


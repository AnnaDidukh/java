import javax.sql.rowset.spi.SyncFactory;

public class homejava1 {
    public static void main(String []args){
        //1exercise
        int a = 0;
        if (a==0) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        switch(a){
            case 1:
            System.out.println(1);
            break;
            case 0:
                System.out.println(0);
                break;
            case -3:
                System.out.println(-3);
                break;
        }
        //2exercise
        int min=22;
        if(min>=0 && min<=14){
            System.out.println("in first term");
        }
        if(min>=15 && min<=30){
            System.out.println("in second term");
        }
        if(min>=31 && min<=45){
            System.out.println("in third term");
        }
        if(min>=46 && min<=59){
            System.out.println("in fourth term");
        }
        //3exercise
        int b=2,res;
        if(a<=1 & b>=3) {
            res=a+b;
            System.out.println(res);
        }else{res=a-b; System.out.println(res);}
        //4exercise
        int month=5;
        if(month>=0 && month<=2){
            System.out.println("Winter");
        }
        if(month>=3 && month<=5){
            System.out.println("Spring");
        }
        if(month>=6 && month<=10){
            System.out.println("Summer");
        }
        if(month>=10 && month<=12){
            System.out.println("Autumn");
        }
        //5exercise
        int num=3;
        switch(num){
            case 1:
            System.out.println("Winter");
            break;
            case 2:
            System.out.println("Spring");
            break;
            case 3:
            System.out.println("Summer");
            break;
            case 4:
            System.out.println("Autumn");
            break;
        }
        //6exercise
        int num1=11;
        if(num1==1){
            System.out.println("January");
        }
        if(num1==2){
            System.out.println("February");
        }
        if(num1==3){
            System.out.println("March");
        }
        if(num1==4){
            System.out.println("April");
        }
        if(num1==5){
            System.out.println("May");
        }
        if(num1==6){
            System.out.println("June");
        }
        if(num1==7){
            System.out.println("July");
        }
        if(num1==8){
            System.out.println("August");
        }
        if(num1==9){
            System.out.println("September");
        }
        if(num1==10){
            System.out.println("October");
        }
        if(num1==11){
            System.out.println("November");
        }
        if(num1==12){
            System.out.println("December");
        }
        //2 1exercise
        String arr="a,b,c";
        String arr1="1,2,3";
            String ref = arr + arr1;
            System.out.println(ref);
         //3 1 exercise
        int array[]={2,17,13,6,22,31,45,66,100,-18};
        int i=0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }
        //2exercise
        for(i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }
        //3exercise
        int e=1;
        while (e<array.length){
            System.out.println(array[e]);
            e+=2;
        }
        //4exercise
        for(i=1;i<array.length;i+=2){
            System.out.println(array[i]);
        }
//        5exercise
        e=0;
        while (e<array.length) {
            if (array[e] % 2 == 0) {
                System.out.println(array[e]);
            }
            e++;
        }
        //6exercise
        for(i=0;i<array.length;i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
        //7exercise
        int x;
        for( x=0; x<array.length;x++){
            if(array[x]%3==0){
                System.out.println("okten");
            }
        }
        //8exercise
        for(i=array.length-1;i>=0;i--){
            System.out.println(array[i]);
        }
    }
}

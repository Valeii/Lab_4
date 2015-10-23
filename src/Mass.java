import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by ������������� on 10.10.2015.
 */
public class Mass {

    static int [] mass = {12,23,42,64,0,0,123,3,8,86,0,3,8,64,0};

    public static void main(String[] args) {
        int [] mass = {12,23,42,64,0,0,123,3,8,86,0,3,8,64,0};
//        calu_Zero();
//        random_NUMS();
//        guessNumber();
//        massinvertion();
//        electricalwatch();
//        fibbonaci();
        happyTickets();
    }


//    public static void calu_Zero(){
////        int [] mass = new int[15];
//        int counter = 0;
//
////        ������ ���� � ������� ���������� �� ��������� �������
//        for(int i = 0;i<=mass.length-1;i++) {
//            if (mass[i] == 0) {
//                counter++;
//            }
//        }
//        System.out.println("���������� " + counter);
//
//    }

//    public  void Search_max(){
//        int i = 0;
//        int max=0;
//        int min=0;
//        for (i :mass){
//            if (mass[i+1]>mass[i]){
//                mass[i+1] = max;
//                System.out.println("������������ ������� ������� :" + max);
//            }
//            if (mass[i+1]<mass[i]){
//                mass[i+1] = min;
//                System.out.println("����������� ������� ������� :" + min);
//            }
//        }
//
//    }


    public static void random_NUMS(){
    int [][] mass = new int [5][8];
        Random random = new Random();
        for(int i = 0; i<5;i++){
            for(int j = 0; j<7;j++){
                mass[i][j] = random.nextInt(89) + 10;

            }

        }
        System.out.println(Arrays.deepToString(mass));
        System.out.println(Stream.of(mass).map(ints -> Arrays.toString(ints)).collect(Collectors.joining(", ")));

    }


    public static void guessNumber(){
        System.out.println("Hello! let's play the game. You have to guess secret number using 7 attempt. Enter the number from 1 to 100");
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [7];
        Random r = new Random();
        int secret = r.nextInt(100) + 1;
        for(int i : arr){
            i = sc.nextInt();
            System.out.println(i);
            if (i == secret){
                System.out.println("You have guessed the secret number");
                break;
            }
            else if(i >= secret){
                System.out.println("It is big nubmer. Try less numer ");
            }
            else if(i <= secret){
                System.out.println("It is small nubmer. Try bigger number ");
            }

        }
        System.out.println("Thank you for your attention");
    }

    public static void asd(){
     Random random = new Random();
        int [] array = new int [random.nextInt(99) + 1];
        int counter = 0;
        for(int n : array){
            System.out.println("random Old" + ((int)(Math.random() * 50) + 100));
            System.out.println("random" + (random.nextInt(50) + 100));
            array[n] = random.nextInt(50) + 100;
        }
        System.out.println(Arrays.toString(array));
        for(int n : array){
            if(array[n] == 0){
                counter++;

            }
            System.out.println(counter);
        }
    }


    public static void electricalwatch() {
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 6; k++) {
                    for (int l = 0; l < 10; l++) {
                        if (i==l && j==k){
                            counter++;
                        }
                    }
                }
            }
        }
        System.out.println(counter);

    }

    public static  void  massinvertion(){
        int [] mass = new int[11];
        int counter = 0;
        int shag = 1;
        int d = mass[mass.length-shag];
        for (int i : mass){
            mass[i] = counter;
            counter++;
        }
        System.out.println("Old massive :" + mass);

        int [] mass1 = new int[11];
        for (int i : mass1){
            mass1[i]= mass[mass.length-shag];
            mass1[mass1.length-shag] = mass[i];
            shag++;
        }
        System.out.println("Inverted massive :" + mass1);
    }



//    public static void randomSecondLevelOfMassive(){
//        Random random = new Random();
//        int [][] mass = new int [10][random.nextInt(18) + 2];
//        int c =+ 3;
//        for (int i = 0; i <= 10; i++) {
//            for (int j = 0; j <= random.nextInt(18) + 2 ; j++) {
//            int [i][random.nextInt(18) + 2] = c;
//
//            }
//        }
//        System.out.println("Massive:" + Arrays.deepToString(mass));
//    }

    public static void fibbonaci(){
        int [] array = new int[11];
        array[1] = 1;
        array[2] = 1;
        for (int i = 3;i<=array.length-1;i++){
            array[i] = array[i-1] + array[i-2];

        }
        System.out.println("This is the massive of Fibonacci numbers:" + array);
    }


    public  static  void  happyTickets(){
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        for (int m = 0; m < 10; m++) {
                            for (int n = 0; n < 10; n++) {
                                if(i + j + k == l + m + n){
                                    counter++;
                                }
                            }
                        }
                    }
                }
            }

        }
        System.out.println("Number of happy tickets = " + counter);
    }


}

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int a = 7;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 120;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = -30000;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = 50000000;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 7.7F;
        System.out.println("Значение переменной e с типом float равно " + e);
        double g = 3.145234554;
        System.out.println("Значение переменной g с типом double равно " + g);


    }

    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12F;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        int e = -159;
        System.out.println(e);
        short f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);

    }

    public static void task3() {
        System.out.println("Задача 3");

        byte teacherOne = 23;
        int teacherTwo = 27;
        byte teacherThree = 30;
        long paper = 480;
        int allStudent = teacherOne + teacherTwo + teacherThree;
        long listPaper = paper / allStudent;
        System.out.println("На каждого ученика рассчитано " + listPaper + " листов бумаги.");

    }

    public static void task4() {
        System.out.println("Задача 4");
         byte minutes = 2;
         int bottle = 16;
         int oneMinutesBottle = bottle / minutes;

         long twentyMinutes = 20;
         long twentyMinutesBottle = oneMinutesBottle * twentyMinutes;
         System.out.println("За 20 минут машина произвела " + twentyMinutesBottle + " штук бутылок.");

         short day = 1440;
         int dayBottle = oneMinutesBottle * day ;
        System.out.println("За день машина произвела " + dayBottle + " штук бутылок.");

         int threeDay = day * 3;
         int threeDayBottle = oneMinutesBottle * threeDay;
        System.out.println("За три дня машина произвела " + threeDayBottle + " штук бутылок.");

         int month = threeDay * 10;
         long monthBottle = month * dayBottle;
         System.out.println("За 20 минут машина произвела " + monthBottle + " штук бутылок.");




    }

    public static void task5() {
        System.out.println("Задача 5");


    }

    public static void task6() {
        System.out.println("Задача 6");


    }

    public static void task7() {
        System.out.println("Задача 7");



    }

    public static void task8() {
        System.out.println("Задача 8");


    }
}
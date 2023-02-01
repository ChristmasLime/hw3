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
         System.out.println("За месяц машина произвела " + monthBottle + " штук бутылок.");

    }

    public static void task5() {
        System.out.println("Задача 5");

        int allBottle = 120;
        byte whiteBottle = 2;
        byte brownBottle = 4;
        int room = allBottle / (whiteBottle + brownBottle);
        int totalWhite = room * whiteBottle;
        int totalBrown = room * brownBottle;
        System.out.println("В школе, где " + room + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски.");

    }

    public static void task6() {
        System.out.println("Задача 6");

        int oneBanana = 80;
        int oneMilk = 105;
        byte iceCream = 100;
        short egg = 70;
        int allBanana = oneBanana * 5;
        int allMilk = oneMilk * 2 ;
        int allIceCream = iceCream * 2;
        int allEgg =  egg * 4;
        int mix = allBanana + allMilk + allIceCream + allEgg;
        System.out.println("Спорт завтрак весит " + mix + " грамм.");
        float mixKg = mix / 1000f;
        System.out.println("Спорт завтрак весит " + mixKg + " килограмм.");





    }

    public static void task7() {
        System.out.println("Задача 7");

        byte allWeight = 7;
        int a = 250;
        int b = 500;
        float lowKg = a / 1000f;
        float idealKg = b / 1000f;
        float lowKgDay = allWeight / lowKg;
        float idealKgDay = allWeight / idealKg;
        System.out.println(lowKgDay + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм.");
        System.out.println(idealKgDay + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм.");
        double medium = (lowKgDay + idealKgDay)/2;
        System.out.println(medium + " день может потребоваться в среднем, чтобы добиться результата похудения.");

    }

    public static void task8() {
        System.out.println("Задача 8");

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float monthM = (float) (masha * 0.1 + masha);
        System.out.println("Маша будет получать после повышения ЗП на 10% " + monthM + " рублей.");
        float monthD = (float) (denis * 0.1 + denis);
        System.out.println("Денис будет получать после повышения ЗП на 10% " + monthD + " рублей.");
        float monthK = (float) (kristina * 0.1 + kristina);
        System.out.println("Кристина будет получать после повышения ЗП на 10% " + monthK + " рублей.");
        int yearM = masha * 12;
        int yearD = denis * 12;
        int yearK = kristina * 12;
        float goodYearM = monthM * 12;
        float goodYearD = monthD * 12;
        float goodYearK = monthK * 12;
        double bonusM = goodYearM - yearM;
        double bonusD = goodYearD - yearD;
        double bonusK = goodYearK - yearK;
        System.out.println("Маша теперь получает " + goodYearM + " рублей. Годовой доход вырос на " + bonusM + " рублей.");
        System.out.println("Маша теперь получает " + goodYearD + " рублей. Годовой доход вырос на " + bonusD + " рублей.");
        System.out.println("Маша теперь получает " + goodYearK + " рублей. Годовой доход вырос на " + bonusK + " рублей.");







    }
}
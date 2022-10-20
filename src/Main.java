public class Main {
    public static void main(String[] args) {

        ///Task 1

        int vari1 = 1;
        byte vari2 = 126;
        short vari3 = 30001;
        long vari4 = 1337;
        float vari5 = 100000;
        double vari6 = 1000000;
        System.out.println("Значение переменной vari1 с типом int равно " + vari1);
        System.out.println("Значение переменной vari2 с типом byte равно " + vari2);
        System.out.println("Значение переменной vari3 с типом short равно " + vari3);
        System.out.println("Значение переменной vari4 с типом long равно " + vari4);
        System.out.println("Значение переменной vari5 с типом float равно " + vari5);
        System.out.println("Значение переменной vari6 с типом double равно " + vari6);

        ///Task 2

        byte tav1 = 67;
        short tav2 = -159;
        int tav3 = 27897;
        long tav4 = 987678965549L;
        float tav5 = 27.12F;
        double tav6 = 2.786;
        char tav7 = 569;
        boolean tav8 = false;
        System.out.println(tav1);
        System.out.println(tav2);
        System.out.println(tav3);
        System.out.println(tav4);
        System.out.println(tav5);
        System.out.println(tav6);
        System.out.println(tav7);
        System.out.println(tav8);

        ///Task 3

        byte ludPav = 23;
        byte annSer = 27;
        byte ekaAnd = 30;
        short paperTot = 480;
        int studTot = ludPav + annSer + ekaAnd;
        int paperStud = paperTot/studTot;
        System.out.println("На каждого ученика рассчитано " + paperStud + " листов бумаги.");

        ///Task 4

        int proizv = 480;
        int third = proizv / 3;
        int day = proizv * 24;
        int threeDay = proizv * 72;
        int mes = proizv * 720;

        System.out.println("За 20 минут машины произвела бутылок " + third + " штук");
        System.out.println("За день машины произвела бутылок " + day + " штук");
        System.out.println("За три дня машины произвела бутылок " + threeDay + " штук");
        System.out.println("За месяц машины произвела бутылок " + mes + " штук");

        ///Task 5

        byte klasBel = 2;
        byte klasKor = 4;
        int klasTot = klasBel + klasKor;
        int klassov = 120 / klasTot;
        int belTot = 2 * klassov;
        int korTot = 4 * klassov;
        System.out.println("В школе, где " + klassov + " классов, нужно " +belTot + " банок белой краски и " + korTot +
                " банок коричневой краски.");

        ///Task 6

        byte bananasAm = 5;
        byte bananaGr = 80;
        int milkGr = 210;
        byte icecrAm = 2;
        int icecrGr = 100;
        byte eggsAm = 4;
        int eggsGr = 70;
        float weightTotGr = bananasAm * bananaGr + milkGr +icecrAm * icecrGr + eggsAm * eggsGr;
        float weightTotKgAm = weightTotGr / 1000;

        System.out.printf("Общий вес завтрака равен " + weightTotKgAm + " кг.");

        ///Task 7

        double weightLoss = 7;
        double slowT = 0.25;
        double fastT = 0.5;
        double avgT = (slowT + fastT) / 2;

        double slowD = weightLoss / slowT;
        double fastD = weightLoss / fastT;
        double avgD = weightLoss / avgT;


        System.out.println("На быстрое похудение (500г. в день) уйдёт " + fastD + " дней.");
        System.out.println("На медленное похудение (250г. в день) уйдёт " + slowD + " дней.");
        System.out.println("На похудение со средней скоростью уйдёт " + Math.ceil(avgD) + " дней.");

        ///Task 8

        int mashaCurSal = 67760;
        int mashaNewSal = (mashaCurSal * 11 / 10);
        int mashaCurYear = mashaCurSal * 12;
        int mashaNewYear = mashaNewSal * 12;
        int mashaDifYear = mashaNewYear - mashaCurYear;

        System.out.println("Маша теперь получает " +  mashaNewYear + " рублей. Годовой доход вырос на "
                + mashaDifYear + " рублей.");

        int denisCurSal = 83690;
        int denisNewSal = (denisCurSal * 11 / 10);
        int denisCurYear = denisCurSal * 12;
        int denisNewYear = denisNewSal * 12;
        int denisDifYear = denisNewYear - denisCurYear;

        System.out.println("Денис теперь получает " +  denisNewYear + " рублей. Годовой доход вырос на "
                + denisDifYear + " рублей.");

        int krisCurSal = 76230;
        int krisNewSal = (krisCurSal * 11 / 10);
        int krisCurYear = krisCurSal * 12;
        int krisNewYear = krisNewSal * 12;
        int krisDifYear = krisNewYear - krisCurYear;

        System.out.println("Кристина теперь получает " +  krisNewYear + " рублей. Годовой доход вырос на "
                + krisDifYear + " рублей.");







    }
}
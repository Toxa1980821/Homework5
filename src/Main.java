//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        {
            int a = 30000000;
            System.out.println("Значение переменной а" + " с типом int" + " равно " + a);


            byte b = 120;
            System.out.println("Значение переменной b " + " с типом byte " + " равно " + b);

            short c = 30000;
            System.out.println("Значение переменной c " + " с типом short " + " равно " + c);

            long d = 3000000000000L;
            System.out.println("Значение переменной d " + " с типом long " + " равно " + d);

            float e = 2.4f;
            System.out.println("Значение переменной e " + " с типом float " + " равно " + e);

            double f = 3.4691;
            System.out.println("Значение переменной f " + " с типом double " + " равно " + f);
        }

        {
            int a = 27897;
            System.out.println(" int = " + a);

            byte b = 67;
            System.out.println(" byte = " + b);

            short c = 569;
            System.out.println(" short = " + c);

            long d = 987678965549L;
            System.out.println("long = " + d);

            float e = 27.12f;
            System.out.println("float = " + e);

            double f = 2.786;
            System.out.println("double = " + f);
        }
        {
            int ludmilaStud = 23;
            int annaStud = 27;
            int ekaterinaStud = 30;
            int totalPaper = 480;

            int totalStudents = ludmilaStud + annaStud + ekaterinaStud;
            int paperStudent = totalPaper / totalStudents;

            System.out.println("На каждого ученика рассчитано " + paperStudent + " листов бумаги");
        }

        {
            int bottlePerformance2Min = 16;
            int bottlePerformance1Min = bottlePerformance2Min / 2;

            int bottles20Minut = bottlePerformance1Min * 20;
            System.out.println("За 20 минут машина произвела " + bottles20Minut + " штук бутылок");
        }
        {
            byte totalCans = 120;
            byte whiteСans = 2;
            byte brownСans = 4;
            int cansClass = (whiteСans + brownСans);
            int numberClasses = (totalCans / cansClass);
            int totalWhiteCans = (numberClasses * whiteСans);
            int totalBrownCans = (numberClasses * brownСans);
            System.out.println("В школе, где " + numberClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");
        }
        {
            short banana = 5;
            short bananaWeight = 80;
            short milk = 200;
            short milkWeight = 105;
            short iceCream = 2;
            short iceСreamWeight = 100;
            short egg = 4;
            short eggWeight = 70;
            int bananaTotalWeight = banana * bananaWeight;
            int milkTotalWeight = milk * milkWeight;
            int iceСreamTotalWeight = iceCream * iceСreamWeight;
            int eggTotalWeight = egg * eggWeight ;
            double gramWeight = bananaTotalWeight + milkTotalWeight + iceСreamTotalWeight + eggTotalWeight;
            double weightKilograms = gramWeight / 1000;
            System.out.println("вес спортзавтрака в граммах  " + gramWeight + " , вес спортзавтрака в килограммах " + weightKilograms);
        }
        {
            byte generalWeightLoss = 7;
            float dailyWeightLoss1 = 0.250f;
            float dailyWeightLoss2 = 0.500f;
            double daysDailyWeightLoss1 = generalWeightLoss / dailyWeightLoss1;
            double daysDailyWeightLoss2 = generalWeightLoss / dailyWeightLoss2;
            double daysOnAverage = (daysDailyWeightLoss1 + daysDailyWeightLoss2) / 2;
            System.out.println("При потере 250 грамм в день потребуется " + daysDailyWeightLoss1 + " дней");
            System.out.println("При потере 500 грамм в день потребуется " + daysDailyWeightLoss2 + " дней");
            System.out.println("В среднем потребуется " + daysOnAverage + " дней");
        }
        {
            int mashasSalary = 67760;
            int denisSalary = 83690;
            int kristinaSalary = 76230;
            float indexing = 0.10f;
            double indexingMashas = (mashasSalary * indexing) + mashasSalary;
            double indexingDenis = (denisSalary * indexing) + denisSalary;
            double indexingKristina = (kristinaSalary * indexing) + kristinaSalary;
            int annualIncomeMasha = mashasSalary * 12;
            int annualIncomeDenis = denisSalary * 12;
            int annualIncomeKristina = kristinaSalary * 12;
            double newAnnualIncomeMasha = indexingMashas * 12;
            double newAnnualIncomeDenis = indexingDenis * 12;
            double newAnnualIncomeKristina = indexingKristina * 12;
            double incomeDifferenceMasha = newAnnualIncomeMasha - annualIncomeMasha;
            double incomeDifferenceDenis = newAnnualIncomeDenis - annualIncomeDenis;
            double incomeDifferenceKristina = newAnnualIncomeKristina - annualIncomeKristina;

            System.out.println( " Маша теперь получает " + indexingMashas + " рублей. Годовой доход вырос на " + incomeDifferenceMasha + " рублей");
            System.out.println( " Денис теперь получает " + indexingDenis + " рублей. Годовой доход вырос на " + incomeDifferenceDenis + " рублей");
            System.out.println( " Кристина теперь получает " + indexingKristina + " рублей. Годовой доход вырос на " + incomeDifferenceKristina + " рублей");
        }



        }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

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
            byte bottlePerformance2Min = 16;
            int bottlePerformance1Min = bottlePerformance2Min / 2;
            int bottles20Minutes = bottlePerformance1Min * 20;
            int minutesPerDay = 24 * 60;
            int bottlesPerDay = minutesPerDay * bottlePerformance1Min;
            int bottles3Days = bottlesPerDay * 3;
            int bottlesMonth = bottlesPerDay * 30;
            System.out.println("За 20 минут машина произвела " + bottles20Minutes + " штук бутылок");
            System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
            System.out.println("За 3 дня машина произвела " + bottles3Days + " штук бутылок");
            System.out.println("За 1 месяц машина произвела " + bottlesMonth + " штук бутылок");
        }
        {
            byte totalCans = 120;
            byte whiteCans = 2;
            byte brownCans = 4;
            int cansClass = (whiteCans + brownCans);
            int numberClasses = (totalCans / cansClass);
            int totalWhiteCans = (numberClasses * whiteCans);
            int totalBrownCans = (numberClasses * brownCans);
            System.out.println("В школе, где " + numberClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");
        }
        {
            byte bananaCount = 5;
            short bananaWeight = 80;
            short milk = 200;
            short milkWeight = 105;
            short iceCream = 2;
            short iceCreamWeight = 100;
            short egg = 4;
            short eggWeight = 70;
            int bananaTotalWeight = bananaCount * bananaWeight;
            int milkTotalWeight = milk * milkWeight;
            int iceCreamTotalWeight = iceCream * iceCreamWeight;
            int eggTotalWeight = egg * eggWeight;
            double gramWeight = bananaTotalWeight + milkTotalWeight + iceCreamTotalWeight + eggTotalWeight;
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

            double newMashasSalary = mashasSalary * (1 + indexing);
            double annualIncreaseMasha = mashasSalary * indexing * 12;
            System.out.println("Маша теперь получает " + (int)newMashasSalary + " рублей. Годовой доход вырос на " + (int)annualIncreaseMasha + " рублей ");

            double newDenisSalary = denisSalary * (1 + indexing);
            double annualIncreaseDenis = denisSalary * indexing * 12;
            System.out.println("Денис теперь получает " + (int)newDenisSalary + " рублей. Годовой доход вырос на " + (int)annualIncreaseDenis + " рублей ");

            double newKristinaSalary = kristinaSalary * (1 + indexing);
            double annualIncreaseKristina = kristinaSalary * indexing * 12;
            System.out.println("Кристина теперь получает " + (int)newKristinaSalary + " рублей. Годовой доход вырос на " + (int)annualIncreaseKristina + " рублей");
                }
            }

        }




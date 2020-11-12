package ua.ust.lab;

public class Values {
    //Для числа два
    public static final int divisionBy2 = 2;

    static void go(int divisionBy) {
        System.out.println("\nКратно " + divisionBy + " ==============================================");

        //Количество
        int countFor = 0;
        //Сумма
        int sumFor = 0;

        for (int i = 0; i <= 999; i++) {
            //Если же брать определение, в котором k должно быть натуральным, то ноль не может иметь делителей.
            if (i > 0 && (i % divisionBy == 0)) {
                countFor++;
                sumFor += i;
                if (sumFor > 400) {
                    System.out.println("Кратно " + divisionBy + ", больше 400, количество: " + countFor + ", сумма: " + sumFor);
                } else if (sumFor < 400) {


                    switch (sumFor) {
                        case 6,7,8,9,10: System.out.println(true + " (" + sumFor + ")");
                        default: System.out.println(false);
                    }
                } else if (sumFor == 6 && sumFor == 7 && sumFor == 8 && sumFor == 9 && sumFor == 10) {
                    System.out.println("Some text");
                }
            }
        }
    }
}
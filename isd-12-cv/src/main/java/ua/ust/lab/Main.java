package ua.ust.lab;

import org.apache.commons.lang3.math.NumberUtils;

public class Main {
    public static void main(String []args) {

        int sizeParam = (args == null ? 0 : args.length);

        if (sizeParam == 0) {
            Values.go(Values.divisionBy2);

        } else {
            for (int i = 0; i < sizeParam; i++) {
                //Для не написания обработчика
                int divisionBy = NumberUtils.toInt(args[i], 0);
                if (divisionBy > 0) {
                    Values.go(divisionBy);
                } else {
                    System.out.println("Ошибка, значение: " + divisionBy + " не может быть делителем");
                }
            }
        }

    }
}

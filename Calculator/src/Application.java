import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Throwable {
        Scanner Calc = new Scanner(System.in);
        int number1, number2;
        String sign;
        String str;

        while (true) {
            System.out.println("Введите первое число: ");
            str = Calc.next();
            if (str.compareToIgnoreCase("quit") == 0) {
                return;
            }
            try {
                number1 = Integer.parseInt(str);
                break;
            } catch (Throwable t) {
                System.out.println("Введено некорректное значение. Попробуйте еще раз");

            }
        }
        while (true) {
            System.out.println("Введите знак арифметического действия: ");
            sign = Calc.next();
            if (sign.compareToIgnoreCase("quit") == 0) {
                return;
            }
            try {
                sign = String.valueOf(sign);
                if (!sign.equals("+") && !sign.equals("-")) {
                    throw new Error();
                }
                break;
            } catch (Throwable t) {
                System.out.println("Введено некорректное значение. Попробуйте еще раз");

            }
        }
        while (true) {
            System.out.println("Введите второе число: ");
            str = Calc.next();
            if (str.compareToIgnoreCase("quit") == 0) {
                return;
            }
            try {
                number2 = Integer.parseInt(str);
                break;
            } catch (Throwable t) {
                System.out.println("Введено некорректное значение. Попробуйте еще раз");

            }
        }

        switch (sign) {
            case "+":
                System.out.println("Результат: " + Integer.toString(number1 + number2));
                break;
            case "-":
                System.out.println("Результат: " + Integer.toString(number1 - number2));
                break;
        }
    }
}





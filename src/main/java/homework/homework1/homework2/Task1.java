package homework.homework1.homework2;

import java.util.InputMismatchException;
import java.util.Scanner;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
// необходимо повторно запросить у пользователя ввод данных.
public class Task1 {
    public static void main(String[] args) {
//        float number = readFloatFromConsole();
//        System.out.println("Вы ввели число: " + number);

        fractionalNumberRequest();
    }

    public static float readFloatFromConsole() {
        Scanner scanner = new Scanner(System.in);
        float number;
        while (true) {
            System.out.print("Введите дробное число: ");
            try {
                number = Float.parseFloat(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введено некорректное значение. Попробуйте еще раз.");
            }
        }
        return number;
    }

    public static void fractionalNumberRequest() {
        boolean numbers = true;
        float number = 0;
        while (numbers) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите дробное число");
            try {
                number = scanner.nextFloat();
                System.out.println("Вы ввели: " + number);
                numbers = false;
            } catch (InputMismatchException e) {
                System.out.println("Не верный формат");
                System.out.println("Проверьте что вы ввели именно число!, и убедитесь что используйте запятую!");
            }
        }
    }
}

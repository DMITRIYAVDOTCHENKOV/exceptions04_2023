package seminar;

import java.util.Scanner;

//Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
// Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
//        если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
//        Eсли искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//        Eсли вместо массива пришел null, метод вернет -3
//        придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
//        Напишите метод, в котором реализуйте взаимодействие с пользователем.
//        То есть, этот метод запросит искомое число у пользователя, вызовет первый,
//        обработает возвращенное значение и покажет читаемый результат пользователю. Например, если вернулся -2,
//        пользователю выведется сообщение: “Искомый элемент не найден”.
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int number1 = scanner.nextInt();

        int[] array = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9,
        };
        System.out.println(array(array, number1));
        scanner.close();


        int result = array(array, number1);
        switch (result) {
            case -3 -> System.out.println("Массив не может быть null");
            case -4 -> System.out.println("Длина массива равно 0");
            case -1 -> System.out.println("Массив меньше заданной длины");
            case -2 -> System.out.printf("%d не найден в массиве ", number1);
            default -> System.out.printf("%d имеет индекс: %d", number1, result);
        }

    }

    private static int array(int[] array, int number) {
        for (int i : array) {
            if (array == null) {
                return -3;
            }
            if (array.length == 0) {
                return -4;
            }
            if (array.length < number) {
                return -1;
            }
            if (array[i] == number) {
                return i;
            }
        }
        return -2;
    }
}

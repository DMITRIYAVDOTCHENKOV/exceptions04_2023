package kurs16_04_23.hw1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
public class Task1 extends Exception {
    public static void main(String[] args) {

        divide(10, 0);
        fileNotFound();
        int[] array = {1, 3, 5, 6, 7, 8, 9, 5};
        goingOutsideTheArray(array, 10);


    }

    public static void divide(int a, int b) {
        try {
            int result = a / b;
        } catch (Exception e) {
            e.getMessage();
            System.out.println("На ноль делить нельзя");
        }
    }

    public static void goingOutsideTheArray(int[] array, int index) {
        if (index > array.length - 1) {
            throw new ArrayIndexOutOfBoundsException("Вы вышли за пределы массива");
        } else {
            System.out.printf("Элемент под индексом %d равен %d\n", index, array[index]);

        }

    }

    public static void fileNotFound() {
        try {
            // файл не существует
            File file = new File("E://file.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("файл не существует");
        }
    }
}





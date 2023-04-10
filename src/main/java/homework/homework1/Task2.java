package homework.homework1;

import java.util.Arrays;
import java.util.stream.IntStream;

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен сумме элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

public class Task2 {
    public static void main(String[] args) {
        int[] array = {8, 2, 6, 4, 5, 20};
        int[] array2 = {2, 4, 5, 6, 7,5};


        createTwoArraysAndGetTheThirdOne(array, array2);

    }

    public static void createTwoArraysAndGetTheThirdOne(int[] arr1, int[] arr2) {
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        if (arr1.length != arr2.length) {
            System.out.println("Операция не возможна, массивы разной длины!!");
        } else {
            System.out.println("Создаем новый массив, состоящий из суммы первых двух");
            int[] c = IntStream.range(0, arr1.length).map(i -> arr1[i] + arr2[i]).toArray();
            System.out.println(Arrays.toString(c));
        }
    }
}
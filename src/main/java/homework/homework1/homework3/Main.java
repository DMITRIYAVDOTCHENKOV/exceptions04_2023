package homework.homework1.homework3;

import homework.homework1.homework3.myException.MyArrayDataException;
import homework.homework1.homework3.myException.MyArraySizeException;

import static homework.homework1.homework3.TransformAndSum.transformAndSum;

public class Main {
    public static void main(String[] args) {

        String[][] stringArray0 = new String[][]{
                {"5", "g", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "5", "6"},
                {"1", "2", "4", "8"}
        };
        String[][] stringArray1 = new String[][]{
                {"5", "6", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "5", "6"},
                {"1", "2", "4", "8"}
        };
        String[][] stringArray2 = new String[][]{
                {"5", "g", "3"},
                {"1", "2", "3", "4"},
                {"1", "2", "5", "6"},
                {"1", "2", "4", "8"}
        };
        String[][] stringArray3 = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "5", "6"},
                {"1", "2", "4", "8"}
        };

        try {
            System.out.println("Сумма элементов массива 'stringArray0' равна " + transformAndSum(stringArray0));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("В массиве stringArray0: " + e.getMessage());
        }
        try {
            System.out.println("Сумма элементов массива 'stringArray1' равна " + transformAndSum(stringArray1));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("В массиве stringArray1: " + e.getMessage());
        }
        try {
            System.out.println("Сумма элементов массива 'stringArray2' равна " + transformAndSum(stringArray2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("В массиве stringArray2: " + e.getMessage());
        }
        try {
            System.out.println("Сумма элементов массива 'stringArray3' равна " + transformAndSum(stringArray3));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("В массиве stringArray3: " + e.getMessage());
        }
    }
}
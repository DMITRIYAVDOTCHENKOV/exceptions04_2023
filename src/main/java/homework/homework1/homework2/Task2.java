package homework.homework1.homework2;
// если надо исправьте код
//try {
//        int d = 0;
//        double catchedRes1 = intArray[8] / d;
//        System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//        }

import java.io.*;

public class Task2 {
    public static void main(String[] args) {

// наверно как то примитивно исправил и тут дело в другом !
//        добавил массив , так как его не было или может тут просто надо было сделат ьчерез if проверку
        try {
            int d = 0;
            int[] intArray = {1,2,4,5,6,7,83,2,4,};
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}

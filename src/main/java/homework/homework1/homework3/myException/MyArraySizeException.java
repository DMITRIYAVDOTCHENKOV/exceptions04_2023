package homework.homework1.homework3.myException;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(String msg) {
        super("Ошибка размерности массива.\n" + " " + msg);
    }

}
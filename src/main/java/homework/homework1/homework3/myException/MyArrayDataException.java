package homework.homework1.homework3.myException;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(String msg) {
        super("Ошибка преобразования элемента массива в целое число.\n" + " " + msg);
    }

}
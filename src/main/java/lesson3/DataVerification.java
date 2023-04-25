package lesson3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class DataVerification {

    final static String DATE_FORMAT = "dd.MM.yyyy";
    ArrayList<String> forms;
    String[] arrForma;

    public boolean TrouAndFalse(String[] arr) {
        arrForma = arr;
        checkingArrayIndexes();
        return checkingTheInputDataForValidity(arrForma);
    }

    public void checkingArrayIndexes() {
        if (arrForma.length < 6) {
            throw new IndexOutOfBoundsException("Вы ввели мало данных");
        } else if (arrForma.length > 6) {
            throw new IndexOutOfBoundsException("Вы ввели слишком много данных");
        }
    }

    public boolean checkingTheInputDataForValidity(String[] arr) {
        return checkTheLastName(arr) && checkTheFirstName(arr[1]) && checkThePatronymic(arr[2]) &&
                checkTheDate(arr[3]) && checkThePhoneNumber(arr[4]) &&
                checkTheGender(arr[5]);
    }

    private boolean checkTheLastName(String[] arrForma) {
        if (arrForma[0] == null) {
            throw new RuntimeException("Должны быть буквы");
        }
        return true;
    }



    private boolean checkTheFirstName(String arrForma) {
        checkingWhetherThisLineIs(arrForma != null, "Вы ввели не верный формат Имени, допустимы только буквы");
        return true;
    }

    private void checkingWhetherThisLineIs(boolean arrForma, String message) {
        if (arrForma){
        }else {
            throw new RuntimeException(message);
        }
    }

    private boolean checkThePatronymic(String arrForma) {
        checkingWhetherThisLineIs(arrForma != null, "Вы ввели не верный формат Имени, допустимы только буквы");
        return true;
    }

    private boolean checkTheDate(String arrForma) {

        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            df.parse(arrForma);
            return true;
        } catch (ParseException e) {
            System.out.println("Не верный формат даты (дд.мм.гггг");
            return false;
        }
    }
    private boolean checkThePhoneNumber(String arrForma) {
        if (arrForma.length() < 10 || arrForma.length() > 11){
            throw new RuntimeException("Не верный формат, должно быть 10-11 цифр");
        }
        try {
            long number = Long.parseLong(arrForma);
            return true;
        }catch (Exception e){
            throw new RuntimeException("Допустим только цифры");
        }
    }
    private boolean checkTheGender(String arrForma) {
        checkingWhetherThisLineIs(arrForma.equals("М") || arrForma.equals("м") || arrForma.equals("Ж") || arrForma.equals("ж"), "указан не верный формат допустимые симовыл: М м Ж ж ");
        return true;
    }
}

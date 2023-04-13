package homework.homework1.homework2;

import java.io.*;

public class Task4 {
    //    Исправьте код, примените подходящие способы обработки исключений:
    public static void main(String[] args) {

        InputStream inputStream;
        try {
            String[] strings = {"apple", "orange"};
            String strings1 = strings[1];
            test();
            int a = 1 / 0;
            inputStream = new FileInputStream("/broken_reference");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("На ноль делить нельзя");
        } catch (StackOverflowError error) {
            System.out.println("Что-то сломалось");
            // перенес данный клас в самый них, так как как бы главный, и он перехватывает все выше указанное,
            // следовательно его адо убрать вниз, для перехвата всех исключений который не выловили ранее
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println("Я все равно выполнился");
        }
        System.out.println("Я жив!");
    }


    private static void test() throws IOException {
//        // получается переполнение стека, и приводит к ошибки
//        File file = new File("1");
//        file.createNewFile();
//        FileReader reader = new FileReader(file);
//        reader.read();
//        test();

        //исправил на
        //проверил существует ли он
        File file = new File("1");
        FileReader reader = null;
        try {
            file.createNewFile();
            reader = new FileReader(file);
            reader.read();
            if (file.exists()) {
                test();
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}



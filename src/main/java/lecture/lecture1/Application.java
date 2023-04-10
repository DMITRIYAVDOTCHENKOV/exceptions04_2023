package lecture.lecture1;

import java.io.File;

public class Application {
    public static void main(String[] args) {
        System.out.println(getFileSize(new File("Test")));
        System.out.println(divide(10, 0));
    }


    public static int divide(int a1, int a2) {
        try {
            return a1 / a2;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return a1;
    }



    public static long getFileSize(File file) {
        if (!file.exists()) {
            return -1L;
        }
        return file.length();
    }
}

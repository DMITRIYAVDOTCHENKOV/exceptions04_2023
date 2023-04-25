package lesson3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreatingAfile {
    File files = new File("src/main/java/lesson3/info");

    File file1;

    public void writerFile(String[] forma) {
        try (FileWriter fileWriter = new FileWriter(checkingForFileAvailability(forma[0]), true)) {
            for (int i = 0; i < forma.length; i++) {
                fileWriter.write(forma[i] + " ");
            }
            fileWriter.append('\n');
            fileWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public File checkingForFileAvailability(String name) {
        file1 = new File(files, name + ".txt");
        if (!file1.exists()) {
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file1;
    }
}

package lesson3;

import java.util.ArrayList;
import java.util.List;

public class Anketa {
    String firstName;
    String lastName;
    String patronymic;
    String datas;
    long phone_number;
    String floor;
    String string = "";

    public  DataVerification DATA_VERIFICATION = new DataVerification();

    public  CreatingAfile CREATING_A_FILE = new CreatingAfile();


    public Anketa(String forma) {
        List<Anketa> arrayList = new ArrayList<>();
        String[] arr = forma.split(" ");
        if (DATA_VERIFICATION.TrouAndFalse(arr)) {
            this.firstName = arr[0];
            this.lastName = arr[1];
            this.patronymic = arr[2];
            this.datas = arr[3];
            this.phone_number = Long.parseLong(arr[4]);
            this.floor = arr[5];
//		string += String.join("<", ">", arr[i]);
        }
        CREATING_A_FILE.writerFile(arr);
    }

}

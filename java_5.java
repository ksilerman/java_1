/**
 * Java. level 1. Lesson 5. Example of homework, OOP
 * autor Rudenko Alexander
 * version date 04/12/2018
 *
 */
import java.util.Arrays;

public class Java_5 {


    public static void main (String[] args) {
        Sotrudnik[] persArray = new Sotrudnik[1];
        persArray[0] = new Sotrudnik("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", "10000", "20");
        //  persArray[1] = new Sotrudnik("Baranov Ivan", "Engineer", "3434n@mailbox.com", "892312562", 30000, 30);
        //  persArray[2] = new Sotrudnik("Antonov Ivan", "Engineer", "ivi465765@mailbox.com", "212312312", 45000, 40);
        //  persArray[3] = new Sotrudnik("Agaganov Ivan", "Engineer", "iv58678an@mailbox.com", "562312312", 50000, 45);
        //  persArray[4] = new Sotrudnik("Dadanov Ivan", "Engineer", "5685ivan@mailbox.com", "782312312", 60000, 50);
        for (int i = 0; i < 1; i++) {
            System.out.println(persArray[i].FIO + " " + persArray[i].Prof + " " + persArray[i].Mail +
                    " " + persArray[i].Tel + " " + persArray[i].Zp + " " + persArray[i].Age);
        }
    }

}

class Sotrudnik {
    String FIO;
    String Prof;
    String Mail;
    String Tel;
    String Zp;
    String Age;
    public Sotrudnik(String FIO, String Prof, String Mail, String Tel, String Zp, String Age) {
        this.FIO = FIO;
        this.Prof = Prof;
        this.Mail = Mail;
        this.Tel = Tel;
        this.Zp = Zp;
        this.Age = Age;
    }

}


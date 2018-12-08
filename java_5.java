/**
 * Java. level 1. Lesson 5. Example of homework, OOP
 * autor Rudenko Alexander
 * version date 07/12/2018
 *
 */


public class Java_5 {


    public static void main(String[] args) {
        Sotrudnik[] persArray = new Sotrudnik[5];
        persArray[0] = new Sotrudnik("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", "10000", 20);
        persArray[1] = new Sotrudnik("Baranov Ivan", "Engineer", "3434n@mailbox.com", "892312562", "30000", 30);
        persArray[2] = new Sotrudnik("Antonov Ivan", "Engineer", "ivi465765@mailbox.com", "212312312", "45000", 40);
        persArray[3] = new Sotrudnik("Agaganov Ivan", "Engineer", "iv58678an@mailbox.com", "562312312", "50000", 45);
        persArray[4] = new Sotrudnik("Dadanov Ivan", "Engineer", "5685ivan@mailbox.com", "782312312", "60000", 50);
        for (int i = 0; i < 5; i++) {
            if (persArray[i].getAge() >= 40) {
                System.out.println(persArray[i].getFIO() + " " + persArray[i].getProf() + " " + persArray[i].getMail() +
                        " " + persArray[i].getTel() + " " + persArray[i].getZp() + " " + persArray[i].getAge());
            }
        }
    }

}

class Sotrudnik {
    private String fio;
    private String prof;
    private String mail;
    private String tel;
    private String zp;
    private int age;
    public Sotrudnik(String fio, String prof, String mail, String tel, String zp, int age) {
        this.fio = fio;
        this.prof = prof;
        this.mail = mail;
        this.tel = tel;
        this.zp = zp;
        this.age = age;
    }
    public String getFIO() {
        return fio;
    }
    public String getProf() {
        return prof;
    }
    public String getMail() {
        return mail;
    }
    public String getTel() {
        return tel;
    }
    public String getZp() {
        return zp;
    }
    public int getAge() {
        return age;
    }

}

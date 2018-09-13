import java.util.Scanner;

public class MatchString {

    private String[] dictionary = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};

    public String insertPswd() {

        Scanner in = new Scanner(System.in);

        //faccio inserire la pswd all'utente
        System.out.print("Inserisci la password: ");
        String pswd = in.nextLine();
        System.out.print("Stampo quello che hai inserito: " + pswd);

        //converto la pswd in string array
        String pswdArr[] = pswd.split("");

        //inizializzo il contatore
        String matched = "";

        //ciclo la passwd e il dizionario
        for (int i=0; i<pswd.length(); i++) {
            for (int y=0; y<dictionary.length; y++) {
                if (dictionary[y] == pswdArr[i]) {
                    matched = matched + y;
                }
            }
        }
        System.out.println("\nQuesta è la tua password: " + matched);
        return matched;
    }
}

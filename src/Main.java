import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double kitle , kilo ,boy;
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Lutfen boyunuzu(metre cinsinden)giriniz :");
        boy = input.nextDouble();
        System.out.print("Lutfen kilonuzu girin:");
        kilo =input.nextDouble();
        kitle = (kilo)/ (boy * boy);
        System.out.println("Vucut kutle endeksiniz " + kitle);

    }
}

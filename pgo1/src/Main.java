// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner liczba = new Scanner(System.in);
            Double a = liczba.nextDouble();

            if(a>0){
            System.out.println("Liczba jest dodatnia");
            }else if(a<0){
            System.out.println("Liczba jest ujemna");
            }else{
            System.out.println("Wartość jest równa 0");
        }
    }
}
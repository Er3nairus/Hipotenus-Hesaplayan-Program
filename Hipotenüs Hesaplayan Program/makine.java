import java.util.Scanner;

public class makine {
    public static void main(String[] args) {
        double k , u , h;

       Scanner kenar = new Scanner(System.in);
       System.out.print("Kısa Kenarın uzunluğunu giriniz : ");

       k = kenar.nextDouble();

       System.out.print("Uzun Kenarı Giriniz : ");

       u = kenar.nextDouble();

       h = Math.sqrt (k * k + u * u);

       System.out.print("Üçgenin Hipotenüsü : "+ h);

    }
    
}

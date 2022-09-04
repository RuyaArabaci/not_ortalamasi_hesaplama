import java.util.Scanner;

public class not_ortalamasi_hesaplama {
    public static void main(String[] args) {
        
        double mat, fizik, kimya, turkce, tarih, muzik;
        Scanner input =new Scanner(System.in);

        System.out.print("Matemaktik notunuzu giriniz: ");
        mat = input.nextDouble();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextDouble();
        
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextDouble();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextDouble();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = input.nextDouble();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextDouble();
        
        Double ortalama = (mat + fizik + kimya + turkce + tarih + muzik)/6;
        System.out.println("Not ortalamanız: " + ortalama);

        boolean deger = ortalama >= 60;
        String sonuc = deger ? "Sınıfı Geçti" : "Sınıfta Kaldı" ;

        System.out.println(sonuc);
    }
}
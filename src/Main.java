// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        GlavnaTv glavnaTv = new GlavnaTv(10, false);
        System.out.println("Jacina tona sa metodom vratiJacinuTona: " + glavnaTv.vratiJacinuTona());
        System.out.println("Da li je tv ukljucen sa metodom daLiJeUkljucen: " + glavnaTv.daLiJeUkljucen());
        glavnaTv.pojacajTon();
        System.out.println("Jacina tona nakon poziva metode pojacajTon: " + glavnaTv.jacinaTona);
        glavnaTv.ukljuci();
        glavnaTv.smanjiTon();
        System.out.println("Ispis nakon poziva metoda ukljuci i smanji ton: " + glavnaTv);
        glavnaTv.pojacajTon();
        glavnaTv.pojacajTon();
        glavnaTv.pojacajTon();
        glavnaTv.pojacajTon();
        glavnaTv.iskljuci();
        System.out.println("Ispis nakon 4 puta pozvane metode pojacajTon i metode iskljuci> " + glavnaTv);
    }
}
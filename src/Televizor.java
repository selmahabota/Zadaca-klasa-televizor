public class Televizor {
    protected int jacinaTona = 0;
    protected boolean ukljucen = false;

    public Televizor() {
    }

    public Televizor(int jacinaTona) {
        this.jacinaTona = jacinaTona;
    }

    public Televizor(int jacinaTona, boolean ukljucen) {
        this.jacinaTona = jacinaTona;
        this.ukljucen = ukljucen;
    }

    public void pojacajTon() {

        if (jacinaTona < 20) this.jacinaTona++;
    }

    public void smanjiTon() {

        if (jacinaTona > 0) this.jacinaTona--;
    }

    public void ukljuci() {

        this.ukljucen = true;
    }

    public void iskljuci() {

        this.ukljucen = false;
    }

    public boolean daLiJeUkljucen() {
        return this.ukljucen;
    }

    public int vratiJacinuTona() {
        return this.jacinaTona;
    }

    @Override
    public String toString() {
        return "Televizor{" +
                "jacinaTona=" + jacinaTona +
                ", ukljucen=" + ukljucen +
                '}';
    }
}
  /*  Napraviti klasu Televizor koja ima:

        Polja
        - jacinaTona. Početna vrednost za jačinu tona je 0 (smatra se da je ton isključen tj. 0)
        - ukljucen. Početna vrednost za poljen ukljucen je false (televizor ugašen).

        Konstruktori
        - svi moguci parametrizovani i neparametrizovani konstruktori

        Metode
        - pojacajTon, pojacava ton televizora za jedan. (jacinaTona ne moze imati vecu vrednost od 20)
        - smanjiTon, smanjuje ton televizora za jedan.
        - ukljuci,  postavlja vrednost atributa ukljucen na true (tj. ukljucuje televizor)
        - iskljuci, koja postavlja vrednost atributa ukljucen na false (tj. iskljucuje televizor)
        - daLiJeUkljucen, vraca vrednost atributa ukljucen
        - vratiJacinuTona, koja vraca trenutnu vrednost jacine tona
        - TvOpis, koja ispisuje sve info iz polja o tv-u

        Napraviti klasu GlavnaTv koja u main metodi kreira jedan objekat klase Televizor i poziva
        njegove metode po vasem izboru i zatim TvOpis*/
package ohtu.kivipaperisakset;

import java.util.Scanner;

public abstract class KPS {

    protected static final Scanner scanner = new Scanner(System.in);
    protected Tuomari tuomari;
    protected Tekoaly tekoaly;

    // template metodi
    public void pelaa() {

        // siirto ensimmäiseltä pelaajalta
        System.out.print("Ensimmäisen pelaajan siirto: ");
        String ekanSiirto = scanner.nextLine();
        // siirto toiselta pelaajalta
        String tokanSiirto = tokanSiirto(ekanSiirto);

        // pelataan niin kauan kun siirrot ovat valideja
        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            System.out.println();

            System.out.print("Ensimmäisen pelaajan siirto: ");
            ekanSiirto = scanner.nextLine();

            tokanSiirto = tokanSiirto(ekanSiirto);

        }

        // peli päättyy
        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }

    // tämä on erilainen riippuen siitä onko ihmispelaaja vai tekoäly
    protected abstract String tokanSiirto(String ekanSiirto);

    // sisäinen metodi, joka tarkastaa onko siirto sallittu
    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }

}
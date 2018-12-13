package ohtu.kivipaperisakset;

public class KPSPelaajaVsPelaaja extends KPS {

    // Konstruktori, joka toteutettu riippuuvuuksien inketointia noudattaen
    public KPSPelaajaVsPelaaja(Tuomari tuomari) {   
        this.tuomari = tuomari;
    }

    @Override
    protected String tokanSiirto(String ekanSiirto) {
        System.out.print("Toisen pelaajan siirto: ");
        String tokanSiirto = scanner.nextLine();
        return tokanSiirto;
    }

}
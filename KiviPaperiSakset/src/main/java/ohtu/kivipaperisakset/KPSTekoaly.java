package ohtu.kivipaperisakset;

/**
 * Luokka ihmisen ja koneen väliselle pelille.
 * Aiemmin kaksi erillistä luokkaa eri vaikeustasoille.
 * Nyt Tekoäly annetaan parametrina konstruktorille, joten ei 
 * ole tarvetta enää kahdelle erilliselle yksinpelille, joiden
 * ainoa ero oli tekoälyn vaikeustaso.
 */
public class KPSTekoaly extends KPS {

    // Konstruktori, joka toteutettu riippuuvuuksien inketointia noudattaen
    public KPSTekoaly(Tuomari tuomari, Tekoaly tekoaly) {   
        this.tuomari = tuomari;
        this.tekoaly = tekoaly;
    }

    @Override
    protected String tokanSiirto(String ekanSiirto) {
        String tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        tekoaly.asetaSiirto(ekanSiirto);
        return tokanSiirto;
    }

}
package ohtu.kivipaperisakset;

public class KPSTehdas {

    public static KPS yksinpeliNormaali() {
        return new KPSTekoaly(new Tuomari(), new TekoalyNormaali());
    }

    public static KPS yksinpeliVaikea() {
        return new KPSTekoaly(new Tuomari(), new TekoalyParannettu(20));
    }

    public static KPS kaksinpeli() {
        return new KPSPelaajaVsPelaaja(new Tuomari());
    }

}
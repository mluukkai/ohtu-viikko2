package ohtu.verkkokauppa;

public class Pankki implements UusiPankki {
    
    private UusiKirjanpito kirjanpito;

    public Pankki(UusiKirjanpito uusikirjanpito) {
        kirjanpito = uusikirjanpito;
    }

    @Override
    public boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa) {
        kirjanpito.lisaaTapahtuma("tilisiirto: tililtä " + tilille + " tilille " + tilille
                + " viite " + viitenumero + " summa " + summa + "e");

        // täällä olisi koodi joka ottaa yhteyden pankin verkkorajapintaan
        return true;
    }
}

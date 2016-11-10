package AusleihSystem;

/**
 * Created by jwiczkowski on 08.11.16.
 */
public class Ski
{
    final float ZEHN_CENTIMETER = 0.10F;  // weil die 10 cm die man abziehen soll immer gleich bleiben :)
    static int anzahlDerObjekte;
    private String hersteller;
    private String modell;
    private float laenge;
    private char skityp;
    private int ausleihZeit;
    private boolean defekt;

    public float optimaleSkilaenge()
    {
        laenge = laenge - ZEHN_CENTIMETER;
        return laenge;
    }

    Ski(String derHersteller, String dasModell, float dieLaenge, char derSkityp)
    {
        setHersteller(derHersteller);
        setModell(dasModell);
        setLaenge(dieLaenge);
        setSkityp(derSkityp);
    }

    Ski(Ski DasOrginal)
    {
        setLaenge(DasOrginal.laenge);
        setModell(DasOrginal.modell);
        setHersteller(DasOrginal.hersteller);
        setSkityp(DasOrginal.skityp);
        setAusleihZeit(DasOrginal.ausleihZeit);
        setDefekt(DasOrginal.defekt);
    }

    public String getHersteller()
    {
        return hersteller;
    }

    public String getModell()
    {
        return modell;
    }

    public float getLaenge()
    {
        return laenge;
    }

    public char getSkityp()
    {
        return skityp;
    }

    public int getAusleihZeit()
    {
        return ausleihZeit;
    }

    public boolean getDefekt()
    {
        return defekt;
    }

    public void setModell(String modell)
    {
        this.modell = modell;
    }

    public void setLaenge(float laenge)
    {
        this.laenge = laenge;
    }

    public void setSkityp(char skityp)
    {
        this.skityp = skityp;
    }

    public void setAusleihZeit(int ausleihZeit)
    {
        this.ausleihZeit = ausleihZeit;
    }

    public void setHersteller(String hersteller)
    {
        this.hersteller = hersteller;
    }

    public void setDefekt(boolean defekt)
    {
        this.defekt = defekt;
    }

    public void datenAusgabe()
    {
        System.out.println("Hersteller ---> " + hersteller);
        System.out.println("Modell  ---> " + modell);
        System.out.println("Laenge  ---> " + laenge);
        System.out.println("Skityp ---> " + skityp);
        System.out.println("Ausleih Zeit ---> " + ausleihZeit);
        System.out.println("Defekt ---> " + defekt);
        System.out.println("--------------------------");
    }
}
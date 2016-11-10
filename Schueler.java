package AusleihSystem;

/**
 * Created by jwiczkowski on 07.11.16.
 */
public class Schueler
{

    private String name;
    private float groesse;
    private int gewicht;
    private char koennen;

    // Koennen 'F' = Fortgeschritten.
    // Koennen 'A' = Anfänger.

    public Schueler(String derName, float dieGroesse, int dasGewicht, char dasKoennen)
    {
        setName(derName);
        setGroesse(dieGroesse);
        setGewicht(dasGewicht);
        setKoennen(dasKoennen);

    }

    Schueler(Schueler DasOrginal)
    {
        setName(DasOrginal.name);
        setGroesse(DasOrginal.groesse);
        setGewicht(DasOrginal.gewicht);
        setKoennen(DasOrginal.koennen);
    }

    public String getName()
    {
        return name;
    }

    public float getGroesse()
    {
        return groesse;
    }

    public int getGewicht()
    {
        return gewicht;
    }

    public char getKoennen()
    {
        return koennen;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setGroesse(float groesse)
    {
        this.groesse = groesse;
    }

    public void setGewicht(int gewicht)
    {
        this.gewicht = gewicht;
    }
    public void setKoennen(char koennen)
    {
       this.koennen = koennen;
    }

    public void datenAusgabe()
    {
        System.out.println("Name ---> " + name);
        System.out.println("Groesse ---> " + groesse);
        System.out.println("Gewicht ---> " + gewicht);
        System.out.println("Koennen ---> " + koennen);
        System.out.println("--------------------------");
    }


    public void check ()
    {
        if (groesse != 0 | groesse > 0)
        {
            System.out.println("√");
        }
        else
        {
            System.out.println("Groesse muss > 0 sein!");
        }

        if (gewicht > 0)
        {
            System.out.println("√");
        }
        else
        {
            System.out.println("Gewicht muss > 0 sein!");
        }

        switch (koennen)
        {
            case 'A' : if (koennen =='A')
            {
                System.out.println("√");
            }

            else
            {
                System.out.println("A hat probleme");
            }
            break;


            case 'F' :  if (koennen == 'F')
            {
                System.out.println("√");
            }
            else
            {
                System.out.println("F hat probleme");
            }
        }
    }
}
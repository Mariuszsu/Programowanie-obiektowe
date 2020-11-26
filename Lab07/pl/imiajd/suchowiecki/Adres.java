package pl.imiajd.suchowiecki;

public class Adres {
    public Adres(String u,int nd,String m,String kp)
    {
        this(u,nd,"",m,kp);
    }
    public Adres(String u,int nd,String nm,String m,String kp)
    {
        this.ulica = u;
        this.numer_domu = nd;
        this.numer_mieszkania = nm;
        this.miasto = m;
        this.kod_pocztowy = kp;
    }

    public Adres()
    {
    }
    public String ulica()
    {
        return ulica;
    }
    public int numer_domu() { return numer_domu; }
    public String numer_mieszkania() { return numer_mieszkania; }
    public String miasto() { return miasto; }
    public String kod_pocztowy() { return kod_pocztowy; }
    public String ulica;
    public int numer_domu;
    public String  numer_mieszkania;
    public String miasto;
    public String kod_pocztowy;


}

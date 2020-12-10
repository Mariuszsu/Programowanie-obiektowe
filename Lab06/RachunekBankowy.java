public class RachunekBankowy {
    static double rocznaStopaProcentowa;
    public RachunekBankowy(double saldo)
    {
        this.saldo = saldo;
    }
    public double saldo()
    {
        return saldo;
    }
    private double saldo;
    public double obliczMiesieczneOdsetki()
    {
        double odsetki = (saldo * rocznaStopaProcentowa) / 12;
        saldo += odsetki;
        return (Math.floor(100*saldo))/100;
    }
    public static void setRocznaStopaProcentowa(double procent)
    {

        rocznaStopaProcentowa = procent/100;
    }
}

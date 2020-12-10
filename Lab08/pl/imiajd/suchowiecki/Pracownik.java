package pl.imiajd.suchowiecki;
import java.time.LocalDate;

class Pracownik extends Osoba
{
    private LocalDate dataZatrudnienia;
    private double pobory;
    public Pracownik(String nazwisko, String[] imiona, LocalDate dataUroddzenia, boolean płeć,double pobory,LocalDate dataZatrudnienia)
    {
        super(nazwisko, imiona, dataUroddzenia, płeć);
        this.pobory = pobory;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public double getPobory()
    {
        return pobory;
    }

    @Override
    public String toString() {
        return " zatrudniony " + dataZatrudnienia + ", z poborami w wysokośći " + pobory + '}';
    }

    public String getOpis()
    {
        return String.format(" pracownik z pensją %.2f zł", pobory);
    }
    public LocalDate getDataZatrudnienia()
    {
        return dataZatrudnienia;
    }


}
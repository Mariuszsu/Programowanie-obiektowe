package pl.imiajd.suchowiecki;
import java.time.LocalDate;
import java.util.Arrays;

abstract class Osoba {

    private String nazwisko;
    private String[] imiona;
    private LocalDate dataUroddzenia;
    private boolean płeć;

    public Osoba(String nazwisko, String[] imiona, LocalDate dataUroddzenia, boolean płeć)
    {
        this.nazwisko = nazwisko;
        this.imiona = imiona;
        this.dataUroddzenia = dataUroddzenia;
        this.płeć = płeć;
    }

    public abstract String getOpis();

    public String getNazwisko()
    {
        return nazwisko;
    }

    public String getImiona()
    {
        StringBuffer str = new StringBuffer();
        for(int i=0;i< imiona.length;i++){
            str.append(imiona[i]);
            str.append(" ");
        }
        return str.toString();
    }

    public LocalDate getDataUroddzenia()
    {
        return dataUroddzenia;
    }

    public boolean getPłeć()
    {
        return płeć;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "nazwisko='" + nazwisko + '\'' +
                ", imiona=" + Arrays.toString(imiona) +
                ", dataUroddzenia=" + dataUroddzenia +
                ", płeć=" + płeć +
                '}';
    }
}
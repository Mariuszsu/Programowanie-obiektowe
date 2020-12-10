package pl.imiajd.suchowiecki;
import java.time.LocalDate;
import java.util.Objects;

abstract class Instrument
{
    private String producent;
    private LocalDate rokProdukcji;
    public Instrument(String producent,int rok,int miesiac,int dzien)
    {
        this.producent = producent;
        rokProdukcji = LocalDate.of(rok,miesiac,dzien);
    }
    abstract void dzwiek();

    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }

    public String getProducent() {
        return producent;
    }

    @Override
    public String toString() {
        return "Instrument{" + "producent = " + producent + '\'' +
                ", rokProdukcji = " + rokProdukcji +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instrument that = (Instrument) o;
        return producent.equals(that.producent) &&
                rokProdukcji.equals(that.rokProdukcji);
    }

}

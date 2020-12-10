package pl.imiajd.suchowiecki;
public class Fortepian extends Instrument
{

    public Fortepian(String producent, int rok, int miesiac, int dzien) {
        super(producent, rok, miesiac, dzien);
    }

    @Override
    void dzwiek() {
        System.out.println("Dźwięk fortepiana");
    }
}

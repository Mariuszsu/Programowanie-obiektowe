package pl.imiajd.suchowiecki;
public class Flet extends Instrument
{

    public Flet(String producent, int rok, int miesiac, int dzien) {
        super(producent, rok, miesiac, dzien);
    }

    @Override
    void dzwiek() {
        System.out.println("Dźwięk fletu");
    }
}


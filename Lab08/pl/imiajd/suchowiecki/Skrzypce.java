package pl.imiajd.suchowiecki;
public class Skrzypce extends Instrument{
    public Skrzypce(String producent, int rok, int miesiac, int dzien) {
        super(producent, rok, miesiac, dzien);
    }

    @Override
    void dzwiek() {
        System.out.println("Dźwięk Skrzypce");
    }
}

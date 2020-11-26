package pl.imiajd.suchowiecki;
class Osoba {
   public Osoba(String nazwisko,int rokUrodzenia)
   {
       this.nazwisko = nazwisko;
       this.rokUrodzenia = rokUrodzenia;
   }
   public String toString()
   {
       return nazwisko + " " + rokUrodzenia;
   }
    public String getNazwisko(){return nazwisko;}

    public int getRokUrodzenia() {return rokUrodzenia;}
   private String nazwisko;
   private int rokUrodzenia;


}

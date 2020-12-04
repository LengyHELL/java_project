class Ital extends Termek {
  private String marka;
  private double alkohol;

  public Ital(String _nev, int _ar, Reszleg _reszleg, String _marka, double _alkohol) throws Exception {
    super(_nev, _ar, _reszleg);
    marka = _marka;
    alkohol = _alkohol;
  }

  public String toString() {
    return super.toString() +
      String.format("\n%5s| %-10s %-10s |\n%5s| %-10s %-10s |",
      "", "Marka: ", marka, "", "Alk.: ", String.format("%.2f", alkohol) + " %");
  }

  public boolean keres(String mit) {
    return super.keres(mit) || (marka.indexOf(mit) >= 0) || (String.valueOf(alkohol).indexOf(mit) >= 0);
  }

  public double getAlkohol() { return alkohol; }
}

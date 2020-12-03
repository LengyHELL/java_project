class Ital extends Termek {
  private String marka;
  private double alkohol;

  public Ital(String _nev, int _ar, Reszleg _reszleg, String _marka, double _alkohol) {
    super(_nev, _ar, _reszleg);
    marka = _marka;
    alkohol = _alkohol;
  }

  public String toString() {
    return String.format("| %-20s | %-10s | %-15s | %-10s | %-10s |",
      getNev(),
      String.valueOf(getAr()) + " Ft",
      getReszleg().getNev(),
      marka,
      String.format("%.2f", alkohol) + " %");
  }
}

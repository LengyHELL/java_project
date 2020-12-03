class Etel extends Termek {
  private Iz iz;

  public Etel(String _nev, int _ar, Reszleg _reszleg, Iz _iz) {
    super(_nev, _ar, _reszleg);
    iz = _iz;
  }

  public String toString() {
    return String.format("| %-20s | %-10s | %-15s | %-10s |",
    getNev(),
    String.valueOf(getAr()) + " Ft",
    getReszleg().getNev(),
    iz.getNev());
  }
}

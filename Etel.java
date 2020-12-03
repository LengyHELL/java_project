class Etel extends Termek {
  private Iz iz;

  public Etel(String _nev, int _ar, Reszleg _reszleg, Iz _iz) {
    super(_nev, _ar, _reszleg);
    iz = _iz;
  }

  public String toString() {
    return super.toString() + String.format("\n%5s| %-10s %-10s |", "", "Iz:", iz.getNev());
  }

  public boolean keres(String mit) {
    return super.keres(mit) || (iz.getNev().indexOf(mit) >= 0);
  }
}

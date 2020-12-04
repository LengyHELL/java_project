class TartosCikk extends Termek {
  private String gyarto;
  private int garancia;

  public TartosCikk(String _nev, int _ar, Reszleg _reszleg, String _gyarto, int _garancia) throws Exception {
    super(_nev, _ar, _reszleg);
    gyarto = _gyarto;
    garancia = _garancia;
  }

  public String toString() {
    return super.toString() +
      String.format("\n%5s| %-10s %-10s |\n%5s| %-10s %-10s |",
      "", "Gyarto: ", gyarto, "", "Garancia: ", String.valueOf(garancia) + " ev");
  }

  public boolean keres(String mit) {
    return super.keres(mit) || (gyarto.indexOf(mit) >= 0) || (String.valueOf(garancia).indexOf(mit) >= 0);
  }
}

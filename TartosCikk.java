class TartosCikk extends Termek {
  private String gyarto;
  private int garancia;

  public TartosCikk(String _nev, int _ar, Reszleg _reszleg, String _gyarto, int _garancia) {
    super(_nev, _ar, _reszleg);
    gyarto = _gyarto;
    garancia = _garancia;
  }
}

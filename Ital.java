class Ital extends Termek {
  private String marka;
  private float alkohol;

  public Ital(String _nev, int _ar, Reszleg _reszleg, String _marka, float _alkohol) {
    super(_nev, _ar, _reszleg);
    marka = _marka;
    alkohol = _alkohol;
  }
}

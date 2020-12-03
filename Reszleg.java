public enum Reszleg {
  NINCS("Nincs"),
  PEKARU("Pekaru"),
  HUS("Hus"),
  TEJ("Tejtermek"),
  ZOLDSEG("Zoldseg"),
  KEKSZ("Keksz"),
  SZESZES("Szeszesital"),
  ELEKTRONIKAI("Elektronikai");

  private String nev;

  Reszleg(String _nev) {
    nev = _nev;
  }

  public String getNev() { return nev; }
}

public enum Reszleg {
  NINCS("nincs"),
  PEKARU("pekaru"),
  HUS("hus"),
  TEJ("tejtermek"),
  ZOLDSEG("zoldseg"),
  KEKSZ("keksz"),
  SZESZES("szeszesital"),
  ELEKTRONIKAI("elektronikai");

  private String nev;

  Reszleg(String _nev) {
    nev = _nev;
  }

  public String getNev() { return nev; }
}

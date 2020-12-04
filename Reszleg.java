/*
  Keszitette: Lengyel Mark (LNXQYO)
  Tantargy:   Java programozas (GKNB_INTM037)
  GitHub:     https://github.com/LengyHELL/java_project
*/

public enum Reszleg {
  NINCS("Altalanos"),
  PEKARU("Pekaru"),
  HUS("Hus"),
  TEJ("Tejtermek"),
  ZOLDSEG("Zoldseg"),
  GYUMOLCS("Gyumolcs"),
  SZESZES("Szeszesital"),
  ELEKTRONIKAI("Elektronikai"),
  SZORAKOZTATO("Szorakoztatas"),
  HAZTARTASI("Haztartasi"),
  EPITES("Hazepites"),
  UDITO("Uditoital"),
  VIZ("Vizek");

  private String nev;

  Reszleg(String _nev) {
    nev = _nev;
  }

  public String getNev() { return nev; }
}

/*
  Keszitette: Lengyel Mark (LNXQYO)
  Tantargy:   Java programozas (GKNB_INTM037)
  GitHub:     https://github.com/LengyHELL/java_project
*/

public enum Iz {
  EDES("edes"),
  SOS("sos");

  private String nev;

  Iz(String _nev) {
    nev = _nev;
  }

  public String getNev() { return nev; }
}

/*
  Keszitette: Lengyel Mark (LNXQYO)
  Tantargy:   Java programozas (GKNB_INTM037)
  GitHub:     https://github.com/LengyHELL/java_project
*/

class Termek {
  private String nev = "";
  private int ar = 0;
  private Reszleg reszleg = Reszleg.NINCS;

  public Termek(String _nev, int _ar, Reszleg _reszleg) throws Exception {
    nev = _nev;
    setAr(_ar);
    reszleg = _reszleg;
  }

  public String toString() {
    return String.format("  | %-20s | %-10s | %-15s |", nev, String.valueOf(ar) + " Ft", reszleg.getNev());
  }

  public boolean keres(String mit) {
    return (nev.indexOf(mit) >= 0) ||
      (String.valueOf(ar).indexOf(mit) >= 0) ||
      (reszleg.getNev().indexOf(mit) >= 0);
  }

  public String getNev() { return nev; }
  public int getAr() { return ar; }
  public Reszleg getReszleg() { return reszleg; }

  public void setAr(int _ar) throws Exception {
    if (_ar <= 0) {
      throw new Exception("A megadott ar tul alacsony!");
    }
    else {
      ar = _ar;
    }
  }
}

class Termek {
  private String nev = "";
  private int ar = 0;
  private Reszleg reszleg = Reszleg.NINCS;

  public Termek(String _nev, int _ar, Reszleg _reszleg) {
    nev = _nev;
    ar = _ar;
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
}

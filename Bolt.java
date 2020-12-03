import java.util.ArrayList;

class Bolt {
  private String nev;
  private String cim;
  private ArrayList<Termek> termekek;

  public Bolt() {
    nev = "";
    cim = "";
    termekek = new ArrayList<Termek>();
  }

  public Bolt(String _nev, String _cim) {
    nev = _nev;
    cim = _cim;
    termekek = new ArrayList<Termek>();
  }

  public void hozzaad(Termek termek) {
    termekek.add(termek);
  }

  public void eltavolit(Termek termek) {
    for (int i = 0; i < termekek.size();) {
      if (termekek.get(i) == termek) {
        termekek.remove(i);
      }
      else {
        ++i;
      }
    }
  }

  public void eltavolit(String nev) {
    for (int i = 0; i < termekek.size();) {
      if (termekek.get(i).getNev() == nev) {
        termekek.remove(i);
      }
      else {
        ++i;
      }
    }
  }

  public int osszegar() {
    int osszeg = 0;
    for (int i = 0; i < termekek.size(); ++i) {
      osszeg += termekek.get(i).getAr();
    }
    return osszeg;
  }
}

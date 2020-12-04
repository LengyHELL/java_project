/*
  Keszitette: Lengyel Mark (LNXQYO)
  Tantargy:   Java programozas (GKNB_INTM037)
  GitHub:     https://github.com/LengyHELL/java_project
*/

import java.util.List;
import java.util.ArrayList;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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

  public String toString() {
    String kimenet = "";
    for (int i = 0; i < termekek.size(); ++i) {
      kimenet += termekek.get(i).toString() + "\n";
    }
    return kimenet;
  }

  public String toString(Reszleg reszleg) {
    String kimenet = "";
    for (int i = 0; i < termekek.size(); ++i) {
      if (termekek.get(i).getReszleg() == reszleg) {
        kimenet += termekek.get(i).toString() + "\n";
      }
    }
    if (kimenet.length() > 0) {
      kimenet = "-" + reszleg.getNev() + "-\n" + kimenet;
    }
    return kimenet;
  }

  public String bejaras() {
    String kimenet = "";
    for (Reszleg r : Reszleg.values()) {
      String temp = toString(r);
      if (temp.length() > 0) {
        kimenet += temp + "\n";
      }
    }
    return kimenet;
  }

  public List<Termek> altalanosKereses(String mit) {
    ArrayList<Termek> talalat = new ArrayList<Termek>();
    for (int i = 0; i < termekek.size(); ++i) {
      if (termekek.get(i).keres(mit)) {
        talalat.add(termekek.get(i));
      }
    }
    return talalat;
  }

  public List<Termek> alkoholosTermekek() {
    ArrayList<Termek> talalat = new ArrayList<Termek>();
    for (int i = 0; i < termekek.size(); ++i) {
      if (termekek.get(i) instanceof Ital) {
        Ital ital = (Ital)termekek.get(i);
        if (ital.getAlkohol() > 0) {
          talalat.add(termekek.get(i));
        }
      }
    }
    return talalat;
  }

  public void mentes() {
    try {
      String fajlnev = "Bevasarlolista_" + getNev() + ".txt";
      File fajl = new File(fajlnev);
      if (fajl.createNewFile()) {
        FileWriter fajlIro = new FileWriter(fajlnev);
        fajlIro.write(bejaras());
        fajlIro.write("Osszesen: " + String.valueOf(osszegar()) + " Ft");
        fajlIro.close();
      }
      else {
        System.out.println("A '" + fajlnev + "' fajl mar letezik!");
      }
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }

  public String getNev() { return nev; }
}

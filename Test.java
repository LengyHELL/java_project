import java.util.List;

class Test {
  public static void main(String args[]) {
    Bolt bolt = new Bolt("asd", "fgh");
    Termek sajt = new Etel("Trappista", 1100, Reszleg.TEJ, Iz.SOS);

    bolt.hozzaad(new Termek("Tej", 300, Reszleg.TEJ));
    bolt.hozzaad(new Etel("Oreo", 520, Reszleg.KEKSZ, Iz.EDES));
    bolt.hozzaad(sajt);
    bolt.hozzaad(new TartosCikk("Monitor", 50000, Reszleg.ELEKTRONIKAI, "Samsung", 2));
    bolt.hozzaad(new Ital("Bor", 1200, Reszleg.SZESZES, "Tokaji", 5.2345));
    System.out.println(bolt.toString());
    System.out.println(bolt.toString(Reszleg.TEJ));
    System.out.println(bolt.bejaras());
    System.out.println(bolt.osszegar());

    List talalat = bolt.altalanosKereses("tej");
    for (int i = 0; i < talalat.size(); ++i) {
      System.out.println(talalat.get(i).toString());
    }
    
    bolt.eltavolit("Tej");
    bolt.eltavolit(sajt);
    System.out.println(bolt.osszegar());

  }
}

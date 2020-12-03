class Test {
  public static void main(String args[]) {
    Bolt bolt = new Bolt("asd", "fgh");
    Termek sajt = new Etel("Trappista", 1100, Reszleg.TEJ, Iz.SOS);

    bolt.hozzaad(new Termek("Tej", 300, Reszleg.TEJ));
    bolt.hozzaad(new Etel("Oreo", 520, Reszleg.KEKSZ, Iz.EDES));
    bolt.hozzaad(sajt);
    System.out.println(bolt.toString());
    System.out.println(bolt.osszegar());

    bolt.eltavolit("Tej");
    bolt.eltavolit(sajt);
    System.out.println(bolt.osszegar());
  }
}

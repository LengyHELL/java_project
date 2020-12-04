/*
  Keszitette: Lengyel Mark (LNXQYO)
  Tantargy:   Java programozas (GKNB_INTM037)
  GitHub:     https://github.com/LengyHELL/java_project
*/

import java.util.List;
import java.util.Scanner;

class Teszt {
  public static void main(String args[]) {
    try {

      Ital tej = new Ital("Tej", 290, Reszleg.TEJ, "Mizo", 0);

      Bolt tesco = new Bolt("Tesco", "Gyor, Szigethy Attila ut 112, 9023");
      tesco.hozzaad(new Ital("Asvanyviz", 60, Reszleg.VIZ, "Mizse", 0));
      tesco.hozzaad(new Ital("Szoda", 45, Reszleg.VIZ, "Szoda", 0));
      tesco.hozzaad(new Termek("Csirke comb", 750, Reszleg.HUS));
      tesco.hozzaad(new Termek("Daralt hus", 1200, Reszleg.HUS));
      tesco.hozzaad(new Ital("Kola", 310, Reszleg.UDITO, "Coca Cola", 0));
      tesco.hozzaad(new Etel("Zsemle", 50, Reszleg.PEKARU, Iz.SOS));
      tesco.hozzaad(tej);

      System.out.println(tesco.getNev() + "\n");
      System.out.println(tesco.bejaras());
      System.out.println("Osszesen: " + String.valueOf(tesco.osszegar()) + " Ft\n");

      Bolt spar = new Bolt("Spar", "Gyor, Ronay Jacint u. 14, 9026");
      spar.hozzaad(new Termek("Paradicsom", 100, Reszleg.ZOLDSEG));
      spar.hozzaad(new Termek("Salata", 120, Reszleg.ZOLDSEG));
      spar.hozzaad(new Termek("Barack", 150, Reszleg.GYUMOLCS));
      spar.hozzaad(new Ital("Bor", 1200, Reszleg.SZESZES, "Tokaji", 18.322));
      spar.hozzaad(new Ital("Sor", 350, Reszleg.SZESZES, "Soproni", 5));
      spar.hozzaad(new Etel("Ropi", 200, Reszleg.NINCS, Iz.SOS));
      spar.hozzaad(new Etel("Milka csoki", 250, Reszleg.NINCS, Iz.EDES));

      System.out.println(spar.getNev() + "\n");
      System.out.println(spar.bejaras());
      System.out.println("Osszesen: " + String.valueOf(spar.osszegar()) + " Ft\n");

      Bolt obi = new Bolt("OBI", "Gyor, Fehervari ut 3, 9023");
      obi.hozzaad(new TartosCikk("Villanykorte", 1300, Reszleg.ELEKTRONIKAI, "Osram", 1));
      obi.hozzaad(new TartosCikk("Karacsonyfa", 69999, Reszleg.SZORAKOZTATO, "Fenyo", 2));
      obi.hozzaad(new Termek("Falfestek", 5000, Reszleg.EPITES));

      System.out.println(obi.getNev() + "\n");
      System.out.println(obi.bejaras());
      System.out.println("Osszesen: " + String.valueOf(obi.osszegar()) + " Ft\n");

      Bolt mediamarkt = new Bolt("Media Markt", "Gyor, Budai ut 1, 9027");
      mediamarkt.hozzaad(new TartosCikk("Billentyuzet", 11000, Reszleg.ELEKTRONIKAI, "Asus", 4));
      mediamarkt.hozzaad(new TartosCikk("Eger", 7500, Reszleg.ELEKTRONIKAI, "Razer", 2));
      mediamarkt.hozzaad(new TartosCikk("Monitor", 140000, Reszleg.ELEKTRONIKAI, "Samsung", 2));
      mediamarkt.hozzaad(new TartosCikk("Porszivo", 45000, Reszleg.HAZTARTASI, "Samsung", 2));

      System.out.println(mediamarkt.getNev() + "\n");
      System.out.println(mediamarkt.bejaras());
      System.out.println("Osszesen: " + String.valueOf(mediamarkt.osszegar()) + " Ft\n");

      tesco.mentes();
      spar.mentes();
      obi.mentes();
      mediamarkt.mentes();

      System.out.println("\nMinden bolt osszesen: " +
        String.valueOf(tesco.osszegar() + spar.osszegar() + obi.osszegar() + mediamarkt.osszegar()) + " Ft\n");

      Scanner input = new Scanner(System.in);
      System.out.println("Adja meg a keresett szot:");
      String mit = input.nextLine();
      System.out.println("Talalat:");

      List<Termek> talalat = tesco.altalanosKereses(mit);
      talalat.addAll(spar.altalanosKereses(mit));
      talalat.addAll(obi.altalanosKereses(mit));
      talalat.addAll(mediamarkt.altalanosKereses(mit));

      for (int i = 0; i < talalat.size(); ++i) {
        System.out.println(talalat.get(i).toString());
      }

      // triggering exception on purpose
      tej.setAr(0);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}

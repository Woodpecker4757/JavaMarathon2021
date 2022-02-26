package day12.task4;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
      List<String> members1 = new ArrayList<>();
      members1.add("Grace Slick");
      members1.add("Marty Slick");
      members1.add("Paul Kantner");
      members1.add("Jorma Kaukonen");
      members1.add("Jack Casady");
      members1.add("Spencer Dryden");

      MusicBand band1 = new MusicBand("JEfferson Airplane",1965, members1);

      List<String> members2 = new ArrayList<>();
      members2.add("John Lennon");
      members2.add("Paul McCarntey");
      members2.add("Ringo Starr");
      members2.add("George Harrison");

      MusicBand band2 = new MusicBand("The Beatles",1960, members2 );

      MusicBand.transferMembers(band1,band2);
      band2.printMembers();
    }
}

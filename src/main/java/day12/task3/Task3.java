package day12.task3;
//3. *Выполнять в подпапке task3 в day12*
//        Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year (название музыкальной группы и год основания). Создать 10 или более экземпляров класса MusicBand , добавить их в список (выбирайте такие музыкальные группы, которые были созданы как до 2000 года, так и после, жанр не важен). Перемешать список. Создать статический метод в классе Task3:
//public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
//        Этот метод принимает список групп в качестве аргумента и возвращает новый список, состоящий из групп, основанных после 2000 года. Вызвать метод groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке из 10 групп. Вывести в консоль оба списка (оригинальный и с группами, основанными после 2000 года).

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Team Impala",2007);
        MusicBand musicBand2 = new MusicBand("The Cure",1976);
        MusicBand musicBand3 = new MusicBand("The Beatles",1960);
        MusicBand musicBand4 = new MusicBand("Gruppa Skryptonite",2018);
        MusicBand musicBand5 = new MusicBand("Pompeya",2006);
        MusicBand musicBand6 = new MusicBand("Пасош",2014);
        MusicBand musicBand7 = new MusicBand("Jefferson Airplane",1965);
        MusicBand musicBand8 = new MusicBand("Jimi Hendrix Experience",1966);
        MusicBand musicBand9 = new MusicBand("Kedr Livanskiy",2008);
        MusicBand musicBand10 = new MusicBand("Кровосток",2003);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(musicBand1);
        musicBands.add(musicBand2);
        musicBands.add(musicBand3);
        musicBands.add(musicBand4);
        musicBands.add(musicBand5);
        musicBands.add(musicBand6);
        musicBands.add(musicBand7);
        musicBands.add(musicBand8);
        musicBands.add(musicBand9);
        musicBands.add(musicBand10);
        System.out.println(musicBands);

        Collections.shuffle(musicBands);

        List<MusicBand> musicBandAfter2000 = new ArrayList<>();
        for(MusicBand band : musicBands){
            if(2000 < band.getYear()){
                musicBandAfter2000.add(band);
            }
        }
        System.out.println(musicBandAfter2000);
    }
}

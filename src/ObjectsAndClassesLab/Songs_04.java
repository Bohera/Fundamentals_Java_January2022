package ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scanner.nextLine());

        List<Song> songList = new ArrayList<>();

        for (int i = 0; i < numberOfSongs; i++) {
            String[] newSong = scanner.nextLine().split("_");
            Song song = new Song(newSong[0], newSong[1], newSong[2]);
            songList.add(song);
        }
        String finalCommand = scanner.nextLine();

        if (finalCommand.equals("all")) {
            songList.stream().forEach(song -> System.out.println(song.getName()));
        } else {
            songList.stream().filter(song -> song.getTypeList().equals(finalCommand)).forEach(song -> System.out.println(song.getName()));
        }

    }

    static class Song {
        String typeList;
        String name;
        String time;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return typeList;
        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

}

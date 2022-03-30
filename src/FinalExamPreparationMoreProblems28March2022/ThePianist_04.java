package FinalExamPreparationMoreProblems28March2022;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Song> songList = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] songInfo = scanner.nextLine().split("\\|");
            Song song = new Song(songInfo[0], songInfo[1], songInfo[2]);
            songList.put(songInfo[0], song);
        }

        String commandLine = scanner.nextLine();

        while (!commandLine.equals("Stop")) {
            String[] commandData = commandLine.split("\\|");
            String command = commandData[0];
            switch (command) {
                case "Add":
                    //{piece}|{composer}|{key}":
                    if (songList.containsKey(commandData[1])) {
                        System.out.printf("%s is already in the collection!%n", commandData[1]);
                    } else {
                        Song song = new Song(commandData[1], commandData[2], commandData[3]);
                        songList.put(commandData[1], song);
                        System.out.printf("%s by %s in %s added to the collection!%n", commandData[1], commandData[2], commandData[3]);
                    }
                    break;
                case "Remove":
                    if (songList.containsKey(commandData[1])) {
                        songList.remove(commandData[1]);
                        System.out.printf("Successfully removed %s!%n", commandData[1]);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", commandData[1]);
                    }
                    break;
                case "ChangeKey":
                    if (songList.containsKey(commandData[1])){
                        songList.get(commandData[1]).setKey(commandData[2]);
                        System.out.printf("Changed the key of %s to %s!%n", commandData[1], commandData[2]);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", commandData[1]);
                    }
                    break;
            }

            commandLine = scanner.nextLine();
        }

        songList.forEach((k,v) -> System.out.printf("%s -> Composer: %s, Key: %s%n", songList.get(k).getPiece(), songList.get(k).getComposer(), songList.get(k).getKey()));
    }

   public static class Song {
        String piece;
        String composer;
        String key;

        public Song(String piece, String composer, String key) {
            this.piece = piece;
            this.composer = composer;
            this.key = key;
        }

        public String getPiece() {
            return piece;
        }

        public void setPiece(String piece) {
            this.piece = piece;
        }

        public String getComposer() {
            return composer;
        }

        public void setComposer(String composer) {
            this.composer = composer;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }
    }
}

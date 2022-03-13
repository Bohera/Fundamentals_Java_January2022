package ObjectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles20_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        List<Article> articles = new ArrayList<>();
        String[] data = scanner.nextLine().split(", ");
        Article article = new Article(data[0], data[1], data[2]);
        articles.add(article);


        for (int i = 1; i < lines; i++) {
            data = scanner.nextLine().split(", ");

            article = new Article(data[0], data[1], data[2]);
            articles.add(article);
        }
        String command = scanner.nextLine();

        articles.stream().forEach(a -> System.out.println(a.toString()));

    }


    static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }
    }
}

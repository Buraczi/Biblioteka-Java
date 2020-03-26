package pl.myApp.library.io;

import pl.myApp.library.model.Book;

import java.util.Scanner;

public class DataReader {
    private Scanner reader = new Scanner(System.in);

    public Book readAndCreateBook() {
        System.out.println("Podaj tytuł: ");
        String title = reader.nextLine();
        System.out.println("Podaj autora: ");
        String author = reader.nextLine();
        System.out.println("Podaj date wydania: ");
        int releaseData = reader.nextInt();
        reader.nextLine();
        System.out.println("Podaj ilość stron: ");
        int pages = reader.nextInt();
        reader.nextLine();
        System.out.println("Podaj wydawcę: ");
        String publisher = reader.nextLine();
        System.out.println("Podaj numer ISBN: ");
        String isbn = reader.nextLine();

        return new Book(title, author, releaseData, pages, publisher, isbn);
    }

    public void close() {
        reader.close();
    }
}

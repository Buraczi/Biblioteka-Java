package pl.myApp.library.app;

import pl.myApp.library.io.DataReader;
import pl.myApp.library.model.Book;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        final String appName = "Library v0.8";

        Book[] books = new Book[1000];
        DataReader dataReader = new DataReader();

        books[0] = dataReader.readAndCreateBook();
        books[1] = dataReader.readAndCreateBook();
        dataReader.close();

        System.out.println(appName + "\n");
        System.out.println("Książki dostępne w bibliotece: ");
        books[0].printInfo();
        books[1].printInfo();

    }
}

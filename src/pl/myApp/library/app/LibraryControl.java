package pl.myApp.library.app;

import pl.myApp.library.app.exceptions.NoSuchOptionException;
import pl.myApp.library.io.ConsolePrinter;
import pl.myApp.library.io.DataReader;
import pl.myApp.library.model.Book;
import pl.myApp.library.model.Library;
import pl.myApp.library.model.Magazine;
import pl.myApp.library.model.Publication;

import java.util.InputMismatchException;

public class LibraryControl {

    private ConsolePrinter printer = new ConsolePrinter();
    private DataReader dataReader = new DataReader();
    private Library library = new Library();

    public void controlLoop() {
        Option option;

        do {
            printOption();
            option = getOption();
            switch (option) {
                case ADD_BOOK:
                    addBook();
                    break;
                case ADD_MAGAZINE:
                    addMagazine();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                case PRINT_MAGAZINES:
                    printMagazines();
                    break;
                case EXIT:
                    exit();
                    break;
                default:
                    printer.printLine("Wybrano błędną opcje!");
            }
        } while (option != Option.EXIT);
    }

    private Option getOption() {
        boolean optionOk = false;
        Option option = null;
        while (!optionOk) {
            try {
                option = Option.createFromInt(dataReader.getInt());
                optionOk = true;
            } catch (NoSuchOptionException e) {
                printer.printLine(e.getMessage());
            } catch (InputMismatchException e) {
                printer.printLine("Wprowadzono wartość która nie jest liczbą!");
            }
        }
        return option;
    }

    private void exit() {
        printer.printLine("Do widzenia!");
        dataReader.close();
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void addMagazine() {
        Magazine magazine = dataReader.readAndCreateMagazine();
        library.addMagazine(magazine);
    }

    private void printBooks() {
        Publication[] publications = library.getPublications();
        printer.printBooks(publications);
    }

    private void printMagazines() {
        Publication[] publications = library.getPublications();
        printer.printMagazines(publications);
    }

    private void printOption() {
        printer.printLine("Wybierz opcje programu: ");
        for (Option option : Option.values()) {
            printer.printLine(option.toString());
        }
    }

}

package pl.myApp.library.app;

import pl.myApp.library.app.exceptions.NoSuchOptionException;

public enum Option {
    EXIT(0, "wyjście z programu"),
    ADD_BOOK(1, "dodanie nowej książki"),
    ADD_MAGAZINE(2, "dodanie nowego magazynu"),
    PRINT_BOOKS(3, "wyświetl dostępne książki"),
    PRINT_MAGAZINES(4, "wyświetl dostępne magazyny");

    private final int value;
    private final String descryption;

    Option(int value, String descryption) {
        this.value = value;
        this.descryption = descryption;
    }

    public int getValue() {
        return value;
    }

    public String getDescryption() {
        return descryption;
    }

    @Override
    public String toString() {
        return value + " - " + descryption;
    }

    static Option createFromInt(int option) throws NoSuchOptionException {
        try {
            return Option.values()[option];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoSuchOptionException("Brak opcji o id " + option + " !");
        }
    }
}

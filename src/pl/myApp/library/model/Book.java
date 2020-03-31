package pl.myApp.library.model;

public class Book extends Publication {
    private String author;
    private int pages;
    private String isbn;

    public Book(String title, String author, int year, int pages, String publisher, String isbn) {
        super(title, publisher, year);
        this.author = author;
        this.pages = pages;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

/*    pl.myapp.library.model.Book(String Title, String Author, int ReleaseDate, int Pages, String Publisher, String Isbn) {
        this (Title, Author, ReleaseDate, Pages, Publisher);
        isbn = Isbn;
    }

    pl.myapp.library.model.Book(String Title, String Author, int ReleaseDate, int Pages, String Publisher) {
        title = Title;
        author = Author;
        releaseDate = ReleaseDate;
        pages = Pages;
        publisher = Publisher;
    }*/ //stara wersja konstruktorów (bez operatora 'this')

    //metoda wyświetlająca info o książce
    @Override
    public void printInfo() {
        String info = getTitle() + "; " + author + "; " + getYear() + "; " + pages + "; " + getPublisher();

        if (isbn != null)
            info += "; " + isbn;
        System.out.println(info);
    }
}

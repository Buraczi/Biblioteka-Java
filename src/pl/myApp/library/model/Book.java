package pl.myApp.library.model;

public class Book {
    private String title;
    private String author;
    private int releaseDate;
    private int pages;
    private String publisher;
    private String isbn;

    // konstruktor 1
    public Book(String title, String author, int releaseDate, int pages, String publisher, String isbn) {
        this (title, author, releaseDate, pages, publisher);
        this.isbn = isbn;
    }
    // konstruktor 2
    public Book(String title, String author, int releaseDate, int pages, String publisher) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.pages = pages;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
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
    public void printInfo() {
        String info = title + "; " + author + "; " + releaseDate + "; " + pages + "; " + publisher;

        if (isbn != null)
            info += "; " + isbn;
        System.out.println(info);
    }
}
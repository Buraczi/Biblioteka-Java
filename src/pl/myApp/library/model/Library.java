package pl.myApp.library.model;

// klasa do przechowywania książek
public class Library {

//    private static final int MAX_BOOKS = 1000;
//    private static final int MAX_MAGAZINES = 1000;
//    private Book[] books = new Book[MAX_BOOKS];
//    private Magazine[] magazines = new Magazine[MAX_MAGAZINES];
//    private int booksNumber = 0;
//    private int magazinesNumber = 0;

    private static final int MAX_PUBLICATIONS = 2000;
    private int publicationsNumber = 0;
    private Publication[] publications = new Publication[MAX_PUBLICATIONS];



    public void addBook(Book publication) {
        if (publicationsNumber < MAX_PUBLICATIONS) {
            publications[publicationsNumber] = publication;
            publicationsNumber++;
        } else {
            System.out.println("Osiągnięto maksymalną ilość miejsca w bibliotece!");
        }

    }

    public void printBooks() {
        int countBooks = 0;
        for (int i = 0; i < publicationsNumber; i++) {
            if (publications[i] instanceof Book)
            publications[i].printInfo();
            countBooks++;
        }
        if (countBooks == 0) {
            System.out.println("Brak książek w bibliotece!");
        }
    }

    public void addMagazine(Magazine publication) {
        if (publicationsNumber < MAX_PUBLICATIONS) {
            publications[publicationsNumber] = publication;
            publicationsNumber++;
        } else {
            System.out.println("Osiągnięto maksymalną ilość miejsca w bibliotece!");
        }

    }

    public void printMagazines() {
        if (publicationsNumber == 0) {
            System.out.println("Brak magazynów w bibliotece!");
        }

        for (int i = 0; i < publicationsNumber; i++) {
            publications[i].printInfo();
        }
    }

}

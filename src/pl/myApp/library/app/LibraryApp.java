package pl.myApp.library.app;

public class LibraryApp {
    private static String APP_VERSION = "Biblioteka v1.1";

    public static void main(String[] args) {
        System.out.println(APP_VERSION);

        LibraryControl libraryControl = new LibraryControl();
        libraryControl.controlLoop();
    }
}

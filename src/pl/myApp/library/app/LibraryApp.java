package pl.myApp.library.app;

public class LibraryApp {
    public static void main(String[] args) {
        final String appVersion = "Biblioteka v0.9";
        System.out.println(appVersion);
        LibraryControl libraryControl = new LibraryControl();
        libraryControl.controlLoop();
    }
}

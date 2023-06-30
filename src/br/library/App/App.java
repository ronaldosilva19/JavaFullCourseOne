package br.library.App;

import br.library.model.Book;
import br.library.util.ShowScreen;
import br.library.screens.BookRegistration;

/**
 * @author Jose Ronaldo da Silva
 */
public class App {
    public static void main(String[] args) {
        ShowScreen showScreen = new ShowScreen();
        BookRegistration bookRegistration = new BookRegistration();
        Book book = new Book("Autobiography", 156.8);
        System.out.println(book);
        showScreen.ShowScreenNow();
        bookRegistration.Registration();

    }
}

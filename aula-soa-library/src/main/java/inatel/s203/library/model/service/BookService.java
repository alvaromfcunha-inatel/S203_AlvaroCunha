package inatel.s203.library.model.service;

import inatel.s203.library.model.entity.Book;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private List<Book> bookList = new ArrayList<Book>();

    public List<Book> getBookList() {
        return bookList;
    }

    @PostConstruct
    public void setup() {
        Book b1 = new Book(1L, "T1", "C1");
        Book b2 = new Book(2L, "T2", "C2");
        Book b3 = new Book(3L, "T3", "C3");
        Book b4 = new Book(4L, "T4", "C4");
        Book b5 = new Book(5L, "T5", "C5");
        Book b6 = new Book(6L, "T6", "C6");

        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
        bookList.add(b5);
        bookList.add(b6);
    }
}

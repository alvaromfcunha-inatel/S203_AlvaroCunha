package inatel.s203.library.controller;

import inatel.s203.library.model.entity.Book;
import inatel.s203.library.model.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    private BookService service;

    @GetMapping
    public List<Book> getAllBooks() {
        return service.getBookList();
    }
}

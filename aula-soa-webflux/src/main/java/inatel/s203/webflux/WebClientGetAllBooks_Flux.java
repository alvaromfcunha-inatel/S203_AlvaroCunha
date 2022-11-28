package inatel.s203.webflux;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

public class WebClientGetAllBooks_Flux {

    public static void main(String[] args) {
        Flux<BookDTO> fluxBook = WebClient.create("http://localhost:8080")
                .get()
                .uri("/book")
                .retrieve()
                .bodyToFlux(BookDTO.class);

        List<BookDTO> bookList = new ArrayList<BookDTO>();

        fluxBook.subscribe(book -> bookList.add(book));

        fluxBook.blockLast();

        for (BookDTO dto : bookList) {
            System.out.println(dto.toString());
        }
    }
}

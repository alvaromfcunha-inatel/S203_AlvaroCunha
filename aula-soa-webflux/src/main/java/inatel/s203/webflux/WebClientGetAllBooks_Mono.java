package inatel.s203.webflux;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class WebClientGetAllBooks_Mono {
    public static void main(String[] args) {
        Mono<BookDTO[]> monoArrBook = WebClient.create("http://localhost:8080")
                .get()
                .uri("/book")
                .retrieve()
                .bodyToMono(BookDTO[].class);

        monoArrBook.subscribe();

        BookDTO[] arrBook = monoArrBook.block();

        for(BookDTO dto : arrBook) {
            System.out.println(dto.toString());
        }
    }
}

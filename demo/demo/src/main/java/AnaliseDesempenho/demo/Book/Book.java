package AnaliseDesempenho.demo.Book;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", length = 255)
    private String title;

    @Column(name = "publicationyear")
    private String publicationYear;

    @Column(name = "author", length = 255)
    private String author;

    @Column(name = "summary", columnDefinition = "TEXT")
    private String summary;

    public Book() {
    }

    public Book(BookDTO bookDTO) {
        this.title = bookDTO.title();
        this.publicationYear = bookDTO.publicationYear();
        this.author = bookDTO.author();
        this.summary = bookDTO.summary();
    }
}
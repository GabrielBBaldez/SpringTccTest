package AnaliseDesempenho.demo.Book;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book save(Book bookDTO) {
        return bookRepository.save(bookDTO);
    }

    public Book findById(Long id) {
        return bookRepository.findById(id).orElseThrow();
    }

    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }

    public Book update(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
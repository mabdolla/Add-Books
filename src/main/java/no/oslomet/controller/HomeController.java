package no.oslomet.controller;

import no.oslomet.model.Author;
import no.oslomet.model.Book;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.transaction.Transactional;
import java.util.LinkedList;
import java.util.List;

@Controller
public class HomeController {

    // Dependency injection
    @Autowired
    SessionFactory sessionFactory;

    Book  book = new Book("Drageløperen", "2004","Khalid Hussein");
    Author author = new Author("Khalid", "Hussein ", "Norwegian");


    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping({"/listOfBooks"})
    @Transactional
    public String listOfBooks(Model model){
        List<Book> book = getAllBooks();
        model.addAttribute("books", book);
        return "bookList";
    }

    @GetMapping({"/listOfAuthors"})
    @Transactional
    public String listOfAuthors(Model model){
        List<Author> author = getAllAuthors();
        model.addAttribute("authors", author);
        return "authorList";
    }

    @GetMapping("/addBook")
    @Transactional
    public String addBook(Model model){
        Book newBook = new Book();
        model.addAttribute("book",newBook);
        return "bookForm";
    }

    @GetMapping("/addAuthor")
    @Transactional
    public String addAuthor(Model model){
        Author newAuthor = new Author();
        model.addAttribute("author",newAuthor);
        return "authorForm";
    }

    @PostMapping("/bookSave")
    @Transactional
    public String bookSave(){
        saveBook(book);
        return "redirect:/listOfBooks";
    }

    @PostMapping("/authorSave")
    @Transactional
    public String authorSave(){
        auhorSave(author);
        return "redirect:/listOfAuthors";
    }

    @GetMapping("/bookUpdate/{ISBN}")
    @Transactional
    public String bookUpdate(@PathVariable("ISBN") String ISBNPram ){
        long ISBN = Long.parseLong(ISBNPram);
        book = getBookByISBN(ISBN);
        book.setTitle("");
        book.setReleaseYear("");
        book.setAuthor("");
        bookUpdate(book);
        return "redirect:/listOfBooks";
    }

    @GetMapping("/authorUpdate/{id}")
    @Transactional
    public String authorUpdate(@PathVariable("id") String idPram ){
        long id = Long.parseLong(idPram);
        author = getAuthorById(id);
        author.setFirstName("");
        author.setLastName("");
        author.setNationality("");
        authorUpdate(author);
        return "redirect:/listOfAuthors";
    }

    @GetMapping("/bookDelete/{ISBN}")
    @Transactional
    public String bookDelete(@PathVariable("ISBN") String ISBNPram){
        book = getBookByISBN(Long.parseLong(ISBNPram));
        bookDelete(book);
        return "redirect:/listOfBooks";
    }

    @GetMapping("/authorDelete/{id}")
    @Transactional
    public String authorDelete(@PathVariable("id") String idPram){
        author = getAuthorById(Long.parseLong(idPram));
        authorDelete(author);
        return "redirect:/listOfAuthors";
    }


    private List<Book> getAllBooks() {
        return  sessionFactory.getCurrentSession().
                createCriteria(Book.class).list();
    }

    public void saveBook(Book book){
        sessionFactory.getCurrentSession().saveOrUpdate(book);
    }

    public Book getBookByISBN(long ISBN){
        return sessionFactory.getCurrentSession().find(Book.class, ISBN);
    }

    public void bookUpdate(Book book){
        sessionFactory.getCurrentSession().update(book);
    }

    public void bookDelete(Book book){
        sessionFactory.getCurrentSession().delete(book);
    }

    private List<Author> getAllAuthors() {
        return  sessionFactory.getCurrentSession().
                createCriteria(Author.class).list();
    }

    public void auhorSave(Author author){
        sessionFactory.getCurrentSession().saveOrUpdate(author);
    }

    public Author getAuthorById(long id){
        return sessionFactory.getCurrentSession().find(Author.class, id);
    }

    public void authorUpdate(Author author){
        sessionFactory.getCurrentSession().update(author);
    }

    public void authorDelete(Author author){
        sessionFactory.getCurrentSession().delete(author);
    }


}

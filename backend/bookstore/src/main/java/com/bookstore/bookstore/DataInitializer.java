package com.bookstore.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository){ this.bookRepository = bookRepository; }

    @Override
    public void run(String... args){
        if(bookRepository.count() > 0) return;

        bookRepository.save(new Book("Java Programming","James Gosling",25,"Programming",10,"Learn Java basics to advanced","https://via.placeholder.com/150x200.png?text=Java+Programming"));
        bookRepository.save(new Book("Python Essentials","Guido van Rossum",30,"Programming",8,"Master Python programming quickly","https://via.placeholder.com/150x200.png?text=Python+Essentials"));
        bookRepository.save(new Book("HTML & CSS Design","Jon Duckett",20,"Web Design",15,"Learn HTML & CSS beautifully","https://via.placeholder.com/150x200.png?text=HTML+CSS+Design"));
        bookRepository.save(new Book("Node JS Basics","Ryan Dahl",32,"Programming",12,"Learn Node.js basics","https://via.placeholder.com/150x200.png?text=Node+JS"));
        bookRepository.save(new Book("Networking","Andrew Tanenbaum",26,"Networking",9,"Networking concepts","https://via.placeholder.com/150x200.png?text=Networking"));
        bookRepository.save(new Book("React Essentials","Dan Abramov",30,"Web Development",8,"Learn React step by step","https://via.placeholder.com/150x200.png?text=React"));
        bookRepository.save(new Book("Python Advanced","Guido van Rossum",35,"Programming",6,"Advanced Python programming","https://via.placeholder.com/150x200.png?text=Python+Advanced"));
        bookRepository.save(new Book("JavaScript Guide","Brendan Eich",28,"Programming",10,"Complete JavaScript guide","https://via.placeholder.com/150x200.png?text=JavaScript"));
        bookRepository.save(new Book("CSS Mastery","Eric Meyer",22,"Web Design",15,"Master CSS techniques","https://via.placeholder.com/150x200.png?text=CSS+Mastery"));
        bookRepository.save(new Book("Database Design","C.J. Date",40,"Database",7,"Learn database design","https://via.placeholder.com/150x200.png?text=Database+Design"));
        bookRepository.save(new Book("Cloud Computing","Tom White",38,"IT",5,"Cloud fundamentals","https://via.placeholder.com/150x200.png?text=Cloud+Computing"));
        bookRepository.save(new Book("Node JS","Ryan Dahl",32,"Web",10,"Server side JS","https://via.placeholder.com/150x200.png?text=NodeJS"));
    }
}
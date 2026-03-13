package com.bookstore.bookstore;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/cart")
@CrossOrigin(origins="*")
public class CartController {

    private final BookRepository bookRepository;
    private final List<CartItem> cart = Collections.synchronizedList(new ArrayList<>());

    public CartController(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @PostMapping("/add")
    public ResponseEntity<CartItem> addToCart(@RequestBody Book request){
        Book book = bookRepository.findById(request.getId())
                .orElseThrow(()-> new RuntimeException("Book not found"));

        synchronized (cart){
            for(CartItem item : cart){
                if(item.getBook().getId().equals(book.getId())){
                    item.increment();
                    return ResponseEntity.ok(item);
                }
            }
            CartItem newItem = new CartItem(book);
            cart.add(newItem);
            return ResponseEntity.ok(newItem);
        }
    }

    @GetMapping
    public ResponseEntity<List<CartItem>> getCart(){ return ResponseEntity.ok(cart); }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> removeFromCart(@PathVariable Long id){
        cart.removeIf(item->item.getBook().getId().equals(id));
        return ResponseEntity.ok("Removed");
    }

    @PostMapping("/update")
    public ResponseEntity<CartItem> updateQuantity(@RequestParam Long id, @RequestParam int qty){
        for(CartItem item : cart){
            if(item.getBook().getId().equals(id)){
                item.setQuantity(qty);
                return ResponseEntity.ok(item);
            }
        }
        return ResponseEntity.notFound().build();
    }
}
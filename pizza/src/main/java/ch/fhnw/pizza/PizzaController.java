package ch.fhnw.pizza;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/menu")
public class PizzaController {
    
    @GetMapping(path="/{id}", produces = "application/json")
    public Pizza getPizza(@PathVariable Long id) {
        return new Pizza();
    }

    @PostMapping(path="/", consumes="application/json", produces = "application/json")
    public ResponseEntity<Void> addPizza(@RequestBody Pizza pizza) {
        return ResponseEntity.ok().build();
    }
}

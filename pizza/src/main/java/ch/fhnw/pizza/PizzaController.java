package ch.fhnw.pizza;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping(path="/menu")
public class PizzaController {

    //get list of pizzas
    @GetMapping(path="/pizzas", produces = "application/json")
    public ResponseEntity getPizzaList() {
        List<Pizza> pizzaList = new ArrayList();

        Pizza pizza1 = new Pizza();
        pizza1.setId(1);
        pizza1.setPizzaName("Margherita");
        pizza1.setPizzaToppings("Mozzarella, Tomato Sauce, Basil");

        Pizza pizza2 = new Pizza();
        pizza2.setId(2);
        pizza2.setPizzaName("Quattro Stagioni");
        pizza2.setPizzaToppings("Mozzarella, Tomato Sauce, Ham, Mushrooms, Artichokes, Olives");

        pizzaList.add(pizza1);
        pizzaList.add(pizza2);

        if(pizzaList.isEmpty())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(pizzaList);
    }
    
    @GetMapping(path="/pizzas/{id}", produces = "application/json")
    public ResponseEntity getPizza(@PathVariable Long id) {
        Pizza pizza1 = new Pizza();
        pizza1.setId(1);
        pizza1.setPizzaName("Margherita");
        pizza1.setPizzaToppings("Mozzarella, Tomato Sauce, Basil");

        if (id == 1) {
            return ResponseEntity.ok(pizza1);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping(path="/pizzas", consumes="application/json", produces = "application/json")
    public ResponseEntity addPizza(@RequestBody Pizza pizza) {
        //TODO: process POST request

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping(path="/pizzas/{id}", consumes="application/json", produces = "application/json")
    public ResponseEntity updatePizza(@PathVariable Long id, @RequestBody Pizza pizza) {
        //TODO: process PUT request
        
        return ResponseEntity.ok(pizza);
    }

    @DeleteMapping(path="/pizzas/{id}")
    public ResponseEntity deletePizza(@PathVariable Long id) {
        //TODO: process DELETE request
        
        return ResponseEntity.noContent().build();
    }
}

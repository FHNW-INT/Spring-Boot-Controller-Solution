package ch.fhnw.pizza;

public class Pizza {
    private int id = 10;
    private String pizzaName = "Margherita";
    private String pizzaToppings = "Mozzarella, Tomato Sauce, Basil";

    public void setId(int id) {
        this.id = id;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public void setPizzaToppings(String pizzaToppings) {
        this.pizzaToppings = pizzaToppings;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public String getPizzaToppings() {
        return pizzaToppings;
    }

    public int getId() {
        return id;
    }
}

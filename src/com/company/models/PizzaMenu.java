package com.company.models;

import java.util.List;

public class PizzaMenu {
    private List PizzaMenuItem;
    

    public void setPizzaMenuItem(List pizzaMenuItem) {
        PizzaMenuItem = pizzaMenuItem;
    }

    public List getPizzaMenuItem() {
        return PizzaMenuItem;
    }

    public PizzaMenu(List pizzaMenuItem) {
        PizzaMenuItem = pizzaMenuItem;
    }
}

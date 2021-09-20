package com.company.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PizzaMenu {
    private List<PizzaMenuItem> items;
    private LocalDateTime ingredients;

    public PizzaMenu() {
        items = new ArrayList<>();
    }
    public void AddItem(PizzaMenuItem Item) {
        items.add(Item);
        LastUpdate = LocalDateTime.now();
    }
    public int itemsCount(){
        return items size();
    }

}

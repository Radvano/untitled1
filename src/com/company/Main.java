package com.company;

import com.company.models.PizzaMenu;
import com.company.models.PizzaMenuItem;

public class Main {

    public static void main(String[] args) {
        PizzaMenu item = new PizzaMenu();
        item.AddItem(new PizzaMenuItem("Šunková", "Dobrá", 50));
        item.AddItem(new PizzaMenuItem("Sýrová", "Dobrá", 50));
    }
}

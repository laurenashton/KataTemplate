package com.elsevier.kata.service;

import java.util.ArrayList;
import java.util.List;

public class ToDoListService {

    private final List<String> items = new ArrayList<>();

    public void addItemToList(String item) {
        items.add(item);
    }

    public List<String> getItemsOnList() {
        return items;
    }

    public void removeItemFromList(String item) {
        items.remove(item);
    }

    public String printItemsOnList() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String item : items) {
            stringBuilder.append("- ").append(item).append("\n");
        }
        return stringBuilder.toString();

    }
}

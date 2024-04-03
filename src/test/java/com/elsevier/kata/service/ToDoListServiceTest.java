package com.elsevier.kata.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ToDoListServiceTest {

    @Test
    void willAllowAUserToAddItemsToTheToDoList() {
        ToDoListService toDoListService = new ToDoListService();
        toDoListService.addItemToList("item1");
        toDoListService.addItemToList("item2");
        toDoListService.addItemToList("item3");

        assertEquals(3, toDoListService.getItemsOnList().size());
    }

    @Test
    void willAllowAUserToRemoveAnItemFromTheToDoList() {
        ToDoListService toDoListService = new ToDoListService();
        toDoListService.addItemToList("item1");
        toDoListService.addItemToList("item2");
        toDoListService.addItemToList("item3");

        toDoListService.removeItemFromList("item2");

        assertEquals(2, toDoListService.getItemsOnList().size());

    }

    @Test
    void willPrintOutTheToDoListInOrder() {
        ToDoListService toDoListService = new ToDoListService();
        toDoListService.addItemToList("item1");
        toDoListService.addItemToList("item2");
        toDoListService.addItemToList("item3");

        String expected = "- item1\n - item2\n -item 3";
        toDoListService.printItemsOnList();

        assertEquals(expected, toDoListService.printItemsOnList());
    }
}

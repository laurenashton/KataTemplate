package com.elsevier.kata.controller;

import com.elsevier.kata.service.ToDoListService;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import static org.mockito.MockitoAnnotations.openMocks;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class ToDoListControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ToDoListService mockToDoListService;

    @InjectMocks
    private ToDoListController toDoListController;

    @BeforeEach
    void setUp() {
        openMocks(this);
    }

    @Test
    void willReturnAcceptedOnPostRequestAndCallService() throws Exception {
        mockMvc.perform(post("add/item1")).andExpect(status().isOk());

        verify(mockToDoListService, times(1)).addItemToList("item1");
    }

}

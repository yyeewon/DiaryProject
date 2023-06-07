package com.diary.Diary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoListController {

    @RequestMapping("/todolist")
    public String todoList() {
        // To-do list 페이지 처리
        return "todolist";
    }
}

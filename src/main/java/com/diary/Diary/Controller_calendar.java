package com.diary.Diary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller_calendar {
    @RequestMapping("/calendar")
    public String Calendar() {
        return "calendar";
    }
}


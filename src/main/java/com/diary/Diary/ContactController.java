package com.diary.Diary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController {

    @RequestMapping("/contact")
    public String contact() {
        // Contact 페이지 처리
        return "contact";
    }
}

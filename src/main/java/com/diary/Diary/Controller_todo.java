package com.diary.Diary;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
public class Controller_todo {

    private final ToDoService toDoService;


    // todolist 화면
    @RequestMapping("/todo")
    public String list(Model model){
        List<Entity_todo> todoEntityList = this.toDoService.getList();
        model.addAttribute("todoEntityList", todoEntityList);
        return "todolist";
    }

    // 기본 접속 경로 설정
    @RequestMapping("/")
    public String root(){
        return "redirect:/calendar";
    }

    // 할 일 작성 버튼 구현
    @PostMapping("/todo/create")
    public String createToDo(@RequestParam String content){
        this.toDoService.create(content);
        return "redirect:/todo";
    }

    // 삭제 버튼 구현
    @DeleteMapping("/todo/delete/{id}")
    public String deleteToDo(@PathVariable Integer id){
        this.toDoService.delete(id);
        return "redirect:/todo";
    }

    // 수정 버튼 구현
    @PutMapping("/todo/update/{id}")
    public String updateToDo(@RequestBody String content, @PathVariable Integer id){
        this.toDoService.update(id, content);
        return "redirect:/todo";

    }

}

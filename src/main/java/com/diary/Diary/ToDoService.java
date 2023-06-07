package com.diary.Diary;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ToDoService {

    private final Repository todoRepository;

    public List<Entity_todo> getList(){
        return this.todoRepository.findAll();
    }

    public void create(String content){
        Entity_todo toDoEntity = new Entity_todo();
        toDoEntity.setContent(content);
        toDoEntity.setCompleted(false);
        this.todoRepository.save(toDoEntity);
    }

    @Transactional
    public void delete(Integer id) {
        Entity_todo toDoEntity = todoRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("해당 아이템이 없습니다. id=" + id));

        this.todoRepository.delete(toDoEntity);
    }

    @Transactional
    public void update(Integer id, String content) {
        Entity_todo toDoEntity = todoRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("해당 아이템이 없습니다. id=" + id));
        toDoEntity.setContent(content);
        this.todoRepository.save(toDoEntity);
    }
}
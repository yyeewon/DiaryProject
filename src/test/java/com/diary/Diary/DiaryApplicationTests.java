package com.diary.Diary;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DiaryApplicationTests {
	@Autowired
	private Repository todoRepository;

	@Test
	void testJpa() {
		Entity_todo todo1 = new Entity_todo();
		todo1.setContent("밥먹기");
		todo1.setCompleted(Boolean.TRUE);
		this.todoRepository.save(todo1);

		Entity_todo todo2 = new Entity_todo();
		todo2.setContent("스프링 공부하기");
		todo2.setCompleted(Boolean.FALSE);
		this.todoRepository.save(todo2);
	}

}

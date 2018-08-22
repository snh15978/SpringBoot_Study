package net.springboot.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Question {
	@Id
	@GeneratedValue // id의 값을 가져와 1을 증가시켜줌
	private Long id;

	private String writer;
	private String title;
	private String contents;

	public Question() {

	}

	public Question(String writer, String title, String contents) {
		super();
		this.writer = writer;
		this.title = title;
		this.contents = contents;
	}
}

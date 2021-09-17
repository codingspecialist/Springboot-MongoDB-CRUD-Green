package com.cos.mongoapp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "board")
public class Board {
	
	@Id
	private String _id;
	private String title;
	private String content;
}

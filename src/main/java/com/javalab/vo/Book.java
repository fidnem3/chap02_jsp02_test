package com.javalab.vo;

import java.io.Serializable;

/********************************************
 * 도서 자바빈즈(도메인 클래스)
 * @author 재석
 * - 2024.06.11
 * 도서 정보를 저장하는 자바빈즈
 * - 롬복 애노테이션으로 간단하게 구현
 * - 자바빈즈 직렬화시 안정성 확보차원에서 Serializable 구현
 ********************************************/

// 롬북 애노테이션 - 메타데이터
import lombok.AllArgsConstructor; // 기본 생성자
import lombok.Getter; // 게터 메소드 
import lombok.NoArgsConstructor; // 오버로딩생성자
import lombok.Setter; //세터 메소드
import lombok.ToString; //toString() 메소드

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Book implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String title;
	private String author;
	private int publicationYear; 
		
}



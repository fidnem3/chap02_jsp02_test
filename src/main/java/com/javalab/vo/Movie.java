package com.javalab.vo;

import java.io.Serializable;

/********************************************
 * 영화 자바빈즈(도메인 클래스)
 * @author 재석
 * - 2024.06.11
 * 영화정보를 저장하는 자바빈즈
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
public class Movie implements Serializable {

	/**
	 * 
	 * 직렬화(Serializable) 
	 * - 자바 객체를 바이트 스트림 형태로 만들어서 전송
	 * 받는 쪽에서는 역직렬화를 해서 받아야 한다. 역직렬화는 
	 * 문자열 형태로 만들어진 문자열을 자바 객체로 실제 자바 
	 * 객체로 완성할 떄 처음 만들어진 자바 객체와 역직렬화 되어
	 * 다시 재조립된 자바 객체(자바빈즈)가 같은지 확인하기 위해
	 * 다름과 같은 serialVersionUID가 필요하다. 
	 */
	private static final long serialVersionUID = 1L;
	private String title; // 영화제목
	private String director; // 제작자
	private int releaseYear; // 개봉년도
	
	

}

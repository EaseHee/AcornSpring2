package com.acorn.dto.openfeign.kakao.blog;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Getter;
import lombok.ToString;

/**
 * 카카오 API - "블로그 검색하기" API 데이터의 meta에 해당하는 데이터를 받을 response DTO 클래스
 * 
 * 참고 자료
 * https://developers.kakao.com/docs/latest/ko/daum-search/dev-guide#search-blog
 * 
 * @author JeroCaller (JJH)
 */
@Getter
@ToString  // For Logging
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class BlogMetaDto {
	private int totalCount = 0;
	private int pageableCount = 0;
	private boolean isEnd;
}

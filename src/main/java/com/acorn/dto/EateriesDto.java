package com.acorn.dto;

import java.math.BigDecimal;

import com.acorn.entity.Categories;
import com.acorn.entity.Eateries;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EateriesDto {
	private Integer no;
	
	private String name;
	private int viewCount;
	private int favoritesCount;
	private String thumbnail;
	private String description;
	
	private BigDecimal rating;
	
	private BigDecimal longitude;
	
	private BigDecimal latitude;
	
	private Categories category;
	
}

package com.wrengenharia.listgame.dto;

import com.wrengenharia.listgame.entities.Game;
import com.wrengenharia.listgame.projections.GameMinProjection;

public class GameMinDTO {

	private Long id;
	private String title;

	/*
	 * modified field table for avoid conflict with word key BD
	 */

	private Integer year;
	private String genre;

	private String imgUrl;

	/*
	 * modified the fields variables for values greater than 255 characters
	 */

	private String shortDescription;

	public GameMinDTO() {

	}

	public GameMinDTO(Game entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.genre = entity.getGenre();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShortDescription();
	}


	public GameMinDTO(GameMinProjection projection) {
		this.id = projection.getId();
		this.title = projection.getTitle();
		this.year = projection.getYear();
		this.imgUrl = projection.getImgUrl();
		this.shortDescription = projection.getShortDescription();
	}
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getGenre() {
		return genre;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
	
	

}

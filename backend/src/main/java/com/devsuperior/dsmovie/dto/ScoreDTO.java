package com.devsuperior.dsmovie.dto;

public class ScoreDTO {

	private Long MoveId;
	private String email;
	private Double score;
	
	public ScoreDTO() {
		
	}

	public Long getMoveId() {
		return MoveId;
	}

	public void setMoveId(Long moveId) {
		MoveId = moveId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}
	
	
}

package com.devsuperior.dslearnbds.entities;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_task")
public class Task extends Lesson{
	private static final long serialVersionUID = 1L;
	
	private String desciption;
	
	private String questionCount;

	private Integer aprovalCount;
	
	private Double wight;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant dueDate;

	public Task() {

	}

	public Task(Long id, String title, Integer position, Section section, String desciption, String questionCount,
			Integer aprovalCount, Double wight, Instant dueDate) {
		super(id, title, position, section);
		this.desciption = desciption;
		this.questionCount = questionCount;
		this.aprovalCount = aprovalCount;
		this.wight = wight;
		this.dueDate = dueDate;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	public String getQuestionCount() {
		return questionCount;
	}

	public void setQuestionCount(String questionCount) {
		this.questionCount = questionCount;
	}

	public Integer getAprovalCount() {
		return aprovalCount;
	}

	public void setAprovalCount(Integer aprovalCount) {
		this.aprovalCount = aprovalCount;
	}

	public Double getWight() {
		return wight;
	}

	public void setWight(Double wight) {
		this.wight = wight;
	}

	public Instant getDueDate() {
		return dueDate;
	}

	public void setDueDate(Instant dueDate) {
		this.dueDate = dueDate;
	}
	
}

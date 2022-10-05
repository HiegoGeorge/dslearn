package com.devsuperior.dslearnbds.entities;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.devsuperior.dslearnbds.entities.chavePrimaria.EnrollmentPK;


@Entity
@Table(name = "tb_enrollment")
public class Enrollment {
	
	@EmbeddedId
	private EnrollmentPK id = new EnrollmentPK();	//chave primaria do atributo de uma classe de associação
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant enrollMoment;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant refoundMoment;
	
	private Boolean availabel;
	
	private Boolean onlyUpdate;
	
	@ManyToMany(mappedBy = "enrollmentsDone")
	private Set<Lesson> lessonsDone = new HashSet<>();// set pois é uma coleçao e nao lista
	
	public Enrollment() {
		
	}
	
	public Enrollment(User user, Offer offer, Instant enrollMoment, Instant refoundMoment, Boolean availabel,
			Boolean onlyUpdate) {
		super();
		id.setUser(user);
		id.setOffer(offer);
		this.enrollMoment = enrollMoment;
		this.refoundMoment = refoundMoment;
		this.availabel = availabel;
		this.onlyUpdate = onlyUpdate;
	}

///-------------------------------------------------------------------------
	public User getStudent() { //quem e estudante desta matricula
		return id.getUser();
	}
	
	public void setStudent(User user) {
		id.setUser(user);;
	}

	
	public Offer getOffer() { //quem e estudante matriculado nesta oferta
		return id.getOffer();
	}
	
	public void setOffer(Offer offer) {
		id.setOffer(offer);
	}
	
	///-------------------------------------------------------------------------
	
	public Instant getEnrollMoment() {
		return enrollMoment;
	}

	public void setEnrollMoment(Instant enrollMoment) {
		this.enrollMoment = enrollMoment;
	}

	public Instant getRefoundMoment() {
		return refoundMoment;
	}

	public void setRefoundMoment(Instant refoundMoment) {
		this.refoundMoment = refoundMoment;
	}

	public Boolean getAvailabel() {
		return availabel;
	}

	public void setAvailabel(Boolean availabel) {
		this.availabel = availabel;
	}

	public Boolean getOnlyUpdate() {
		return onlyUpdate;
	}

	public void setOnlyUpdate(Boolean onlyUpdate) {
		this.onlyUpdate = onlyUpdate;
	}
	
	

	
}

package com.example.startstart.model;

import java.util.Set;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "customer")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)

public class Customer {

	@Id
	@GeneratedValue()
	private Long id;

	@NotNull
	private String name;

	@JsonIgnore
	@ManyToMany(mappedBy = "customers", cascade = CascadeType.ALL)
	private Set<FeatureToggle> features;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<FeatureToggle> getFeatures() {
		return features;
	}

	public void setFeatures(Set<FeatureToggle> features) {
		this.features = features;
	}

}

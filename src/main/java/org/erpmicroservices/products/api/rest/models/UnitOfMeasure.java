package org.erpmicroservices.products.api.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import java.util.UUID;

@Entity(name = "unit_of_measure")
public class UnitOfMeasure extends AbstractPersistable<UUID> {
 private String description;
 private String abbreviation;

 public String getDescription() {
	return description;
 }

 public void setDescription(String description) {
	this.description = description;
 }

 public String getAbbreviation() {
	return abbreviation;
 }

 public void setAbbreviation(String abbreviation) {
	this.abbreviation = abbreviation;
 }
}

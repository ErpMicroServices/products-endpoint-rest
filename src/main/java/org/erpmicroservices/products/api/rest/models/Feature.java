package org.erpmicroservices.products.api.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import java.util.UUID;

@Entity(name = "feature")
public class Feature extends AbstractPersistable<UUID> {
 @NotEmpty
 private String description;
 @ManyToOne
 @JoinColumn(name = "feature_category_id")
 private FeatureCategory category;
 @ManyToOne
 private UnitOfMeasure unitOfMeasure;

 public FeatureCategory getCategory() {
	return category;
 }

 public void setCategory(FeatureCategory category) {
	this.category = category;
 }

 public UnitOfMeasure getUnitOfMeasure() {
	return unitOfMeasure;
 }

 public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
	this.unitOfMeasure = unitOfMeasure;
 }

 public String getDescription() {
	return description;
 }

 public void setDescription(String description) {
	this.description = description;
 }
}

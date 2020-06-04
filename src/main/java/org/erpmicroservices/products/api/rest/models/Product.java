package org.erpmicroservices.products.api.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "product")
public class Product extends AbstractPersistable<UUID> {

 @NotEmpty
 private String name;

 @Column(name = "introduction_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate introductionDate;

 @Column(name = "sales_discontinuation_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate salesDiscontinuationDate;

 private String comment;

 @Column(name = "manufactured_by_id")
 private UUID manufacturedBy;

 @ManyToOne
 @JoinColumn(name = "product_type_id")
 private ProductType type;

 @OneToMany(
	 cascade = CascadeType.ALL,
	 orphanRemoval = true)
 @JoinColumn(name = "product_id")
 private List<FeatureInteraction> featureInteractions;

// @OneToMany(
//	 cascade = CascadeType.ALL,
//	 orphanRemoval = true)
// private List<FeatureApplicability> features;
// @OneToMany(
//	 cascade = CascadeType.ALL,
//	 orphanRemoval = true)
// private List<Suppplier> suppliers = new ArrayList<>();


 public List<FeatureInteraction> getFeatureInteractions() {
	return featureInteractions;
 }

 public void setFeatureInteractions(List<FeatureInteraction> interactions) {
	this.featureInteractions = interactions;
 }

 public ProductType getType() {
	return type;
 }

 public void setType(ProductType type) {
	this.type = type;
 }

 public LocalDate getIntroductionDate() {
	return introductionDate;
 }

 public void setIntroductionDate(LocalDate introductionDate) {
	this.introductionDate = introductionDate;
 }

 public LocalDate getSalesDiscontinuationDate() {
	return salesDiscontinuationDate;
 }

 public void setSalesDiscontinuationDate(LocalDate salesDiscontinuationDate) {
	this.salesDiscontinuationDate = salesDiscontinuationDate;
 }

 public String getComment() {
	return comment;
 }

 public void setComment(String comment) {
	this.comment = comment;
 }

 public UUID getManufacturedBy() {
	return manufacturedBy;
 }

 public void setManufacturedBy(UUID manufacturedBy) {
	this.manufacturedBy = manufacturedBy;
 }

 public String getName() {
	return name;
 }

 public void setName(String name) {
	this.name = name;
 }

 @Override
 public String toString() {
	return new ToStringBuilder(this)
		.append("name", name)
		.toString();
 }
}

package org.erpmicroservices.products.api.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;
import java.util.ArrayList;
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

 @OneToMany(
	 cascade = CascadeType.ALL,
	 orphanRemoval = true)
 @JoinColumn(name = "product_id")
 private List<FeatureApplicability> featureApplicabilities;

 @OneToMany(
	 cascade = CascadeType.ALL,
	 orphanRemoval = true)
 @JoinColumn(name = "product_id")
 private List<Supplier> suppliers = new ArrayList<>();

 @OneToMany(
	 cascade = CascadeType.ALL,
	 orphanRemoval = true)
 @JoinColumn(name = "product_id")
 private List<PriceComponent> priceComponents = new ArrayList<>();

 @OneToMany(
	 cascade = CascadeType.ALL,
	 orphanRemoval = true)
 @JoinColumn(name = "product_id")
 private List<EstimatedProductCost> estimatedProductCosts = new ArrayList<>();

 @OneToMany(
	 cascade = CascadeType.ALL,
	 orphanRemoval = true)
 @JoinColumn(name = "from_product_id")
 private List<ProductAssociation> fromProductAssociations = new ArrayList<>();

 @OneToMany(
	 cascade = CascadeType.ALL,
	 orphanRemoval = true)
 @JoinColumn(name = "to_product_id")
 private List<ProductAssociation> toProductAssociations = new ArrayList<>();


 public List<ProductAssociation> getFromProductAssociations() {
	return fromProductAssociations;
 }

 public void setFromProductAssociations(List<ProductAssociation> fromProductAssociations) {
	this.fromProductAssociations = fromProductAssociations;
 }

 public List<ProductAssociation> getToProductAssociations() {
	return toProductAssociations;
 }

 public void setToProductAssociations(List<ProductAssociation> toProductAssociations) {
	this.toProductAssociations = toProductAssociations;
 }

 public List<EstimatedProductCost> getEstimatedProductCosts() {
	return estimatedProductCosts;
 }

 public void setEstimatedProductCosts(List<EstimatedProductCost> estimatedProductCosts) {
	this.estimatedProductCosts = estimatedProductCosts;
 }

 public List<FeatureApplicability> getFeatureApplicabilities() {
	return featureApplicabilities;
 }

 public void setFeatureApplicabilities(List<FeatureApplicability> featureApplicabilities) {
	this.featureApplicabilities = featureApplicabilities;
 }

 public List<Supplier> getSuppliers() {
	return suppliers;
 }

 public void setSuppliers(List<Supplier> suppliers) {
	this.suppliers = suppliers;
 }

 public List<PriceComponent> getPriceComponents() {
	return priceComponents;
 }

 public void setPriceComponents(List<PriceComponent> priceComponents) {
	this.priceComponents = priceComponents;
 }

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

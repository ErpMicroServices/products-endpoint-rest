package org.erpmicroservices.products.api.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.UUID;

@Entity(name = "feature_applicability")
public class FeatureApplicability extends AbstractPersistable<UUID> {

 @Column(name = "from_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate fromDate;

 @Column(name = "thru_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate thruDate;

 @ManyToOne
 @JoinColumn(name = "feature_applicability_type_id")
 private FeatureApplicabilityType type;

 @ManyToOne
 @JoinColumn(name = "feature_id")
 private Feature feature;

 @ManyToOne
 private Product product;

 public Product getProduct() {
	return product;
 }

 public void setProduct(Product product) {
	this.product = product;
 }

 public LocalDate getFromDate() {
	return fromDate;
 }

 public void setFromDate(LocalDate fromDate) {
	this.fromDate = fromDate;
 }

 public LocalDate getThruDate() {
	return thruDate;
 }

 public void setThruDate(LocalDate thruDate) {
	this.thruDate = thruDate;
 }

 public FeatureApplicabilityType getType() {
	return type;
 }

 public void setType(FeatureApplicabilityType type) {
	this.type = type;
 }

 public Feature getFeature() {
	return feature;
 }

 public void setFeature(Feature feature) {
	this.feature = feature;
 }
}

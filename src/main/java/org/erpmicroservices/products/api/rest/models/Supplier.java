package org.erpmicroservices.products.api.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vladmihalcea.hibernate.type.interval.PostgreSQLIntervalType;
import org.hibernate.annotations.TypeDef;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.Duration;
import java.time.LocalDate;
import java.util.UUID;

@Entity(name = "supplier_product")
@TypeDef(
	typeClass = PostgreSQLIntervalType.class,
	defaultForType = Duration.class
)
public class Supplier extends AbstractPersistable<UUID> {

 @Column(name = "available_from_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate availableFromDate;

 @Column(name = "available_thru_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate availableThruDate;

 @Column(name = "standard_lead_time", columnDefinition = "interval")
 @JsonProperty(value = "duration")
 private Duration standardLeadTime;

 private String comment;

 @ManyToOne
 private Product product;

 private UUID organizationId;

 @ManyToOne
 @JoinColumn(name = "preference_type_id")
 private PreferenceType preferenceType;

 @ManyToOne
 @JoinColumn(name = "rating_type_id")
 private RatingType ratingType;

 public LocalDate getAvailableFromDate() {
	return availableFromDate;
 }

 public void setAvailableFromDate(LocalDate availableFromDate) {
	this.availableFromDate = availableFromDate;
 }

 public LocalDate getAvailableThruDate() {
	return availableThruDate;
 }

 public void setAvailableThruDate(LocalDate availableThruDate) {
	this.availableThruDate = availableThruDate;
 }

 public Duration getStandardLeadTime() {
	return standardLeadTime;
 }

 public void setStandardLeadTime(Duration standardLeadTime) {
	this.standardLeadTime = standardLeadTime;
 }

 public String getComment() {
	return comment;
 }

 public void setComment(String comment) {
	this.comment = comment;
 }

 public Product getProduct() {
	return product;
 }

 public void setProduct(Product product) {
	this.product = product;
 }

 public UUID getOrganizationId() {
	return organizationId;
 }

 public void setOrganizationId(UUID organizationId) {
	this.organizationId = organizationId;
 }

 public PreferenceType getPreferenceType() {
	return preferenceType;
 }

 public void setPreferenceType(PreferenceType preferenceType) {
	this.preferenceType = preferenceType;
 }

 public RatingType getRatingType() {
	return ratingType;
 }

 public void setRatingType(RatingType ratingType) {
	this.ratingType = ratingType;
 }
}

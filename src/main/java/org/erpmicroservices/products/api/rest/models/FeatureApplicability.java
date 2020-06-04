package org.erpmicroservices.products.api.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.UUID;

@Entity(name = "feature_applicability")
public class FeatureApplicability extends AbstractPersistable<UUID> {
 private LocalDate fromDate;
 private LocalDate thruDate;
 @ManyToOne
 @JoinColumn(name = "feature_applicability_type_id")
 private FeatureApplicabilityType type;
 @ManyToOne
 @JoinColumn(name = "feature_id")
 private Feature feature;

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

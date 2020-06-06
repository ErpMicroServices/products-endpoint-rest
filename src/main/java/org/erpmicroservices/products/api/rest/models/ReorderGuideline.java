package org.erpmicroservices.products.api.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.UUID;

@Entity(name = "reorder_guideline")
public class ReorderGuideline extends AbstractPersistable<UUID> {
 @Column(name = "from_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate fromDate;

 @Column(name = "thru_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate thruDate;

 private int reorderQuantity;

 private int reorderLevel;

 private UUID basedOnGeographicBoundary;

 private UUID basedOnFacility;

 private UUID basedOnInternalOrganization;

 @ManyToOne
 private Product good;

 public Product getGood() {
	return good;
 }

 public void setGood(Product good) {
	this.good = good;
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

 public int getReorderQuantity() {
	return reorderQuantity;
 }

 public void setReorderQuantity(int reorderQuantity) {
	this.reorderQuantity = reorderQuantity;
 }

 public int getReorderLevel() {
	return reorderLevel;
 }

 public void setReorderLevel(int reoderLevel) {
	this.reorderLevel = reoderLevel;
 }

 public UUID getBasedOnGeographicBoundary() {
	return basedOnGeographicBoundary;
 }

 public void setBasedOnGeographicBoundary(UUID basedOnGeographicBoundary) {
	this.basedOnGeographicBoundary = basedOnGeographicBoundary;
 }

 public UUID getBasedOnFacility() {
	return basedOnFacility;
 }

 public void setBasedOnFacility(UUID basedOnFacility) {
	this.basedOnFacility = basedOnFacility;
 }

 public UUID getBasedOnInternalOrganization() {
	return basedOnInternalOrganization;
 }

 public void setBasedOnInternalOrganization(UUID basedOnInternalOrganization) {
	this.basedOnInternalOrganization = basedOnInternalOrganization;
 }
}

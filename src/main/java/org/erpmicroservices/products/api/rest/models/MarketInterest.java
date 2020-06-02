package org.erpmicroservices.products.api.rest.models;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;

@Entity(name = "market_interest")
public class MarketInterest extends AbstractPersistable<UUID> {

 @NotNull
 private LocalDate fromDate = LocalDate.now();
 private LocalDate thruDate;
 @ManyToOne
 @JoinColumn(name = "product_category_id")
 private ProductCategory productCategory;
 @NotNull
 private UUID partyClassificationTypeId;

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

 public ProductCategory getProductCategory() {
	return productCategory;
 }

 public void setProductCategory(ProductCategory productCategory) {
	this.productCategory = productCategory;
 }

 public UUID getPartyClassificationTypeId() {
	return partyClassificationTypeId;
 }

 public void setPartyClassificationTypeId(UUID partyClassificationTypeId) {
	this.partyClassificationTypeId = partyClassificationTypeId;
 }

 @Override
 public String toString() {
	return new ToStringBuilder(this)
		.append("fromDate", fromDate)
		.append("thruDate", thruDate)
		.append("productCategory", productCategory)
		.append("partyClassificationTypeId", partyClassificationTypeId)
		.toString();
 }
}

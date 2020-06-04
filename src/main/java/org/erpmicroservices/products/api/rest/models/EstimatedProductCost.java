package org.erpmicroservices.products.api.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;


@Entity
@Table(name = "estimated_product_cost")
public class EstimatedProductCost extends AbstractPersistable<UUID> {

 @Column(name = "from_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate fromDate;
 @Column(name = "thru_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate thruDate;
 private BigDecimal cost;
 @NotNull
 @ManyToOne
 @JoinColumn(name = "estimated_product_cost_type_id", nullable = false)
 private EstimatedProductCostType type;
 @NotNull
 @ManyToOne
 @JoinColumn(name = "product_id", nullable = false)
 private Product product;
 @ManyToOne
 private Feature feature;
 private UUID geographicBoundaryId;
 private UUID organizationId;

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

 public BigDecimal getCost() {
	return cost;
 }

 public void setCost(BigDecimal cost) {
	this.cost = cost;
 }

 public EstimatedProductCostType getType() {
	return type;
 }

 public void setType(EstimatedProductCostType type) {
	this.type = type;
 }

 public Product getProduct() {
	return product;
 }

 public void setProduct(Product product) {
	this.product = product;
 }

 public Feature getFeature() {
	return feature;
 }

 public void setFeature(Feature feature) {
	this.feature = feature;
 }

 public UUID getGeographicBoundaryId() {
	return geographicBoundaryId;
 }

 public void setGeographicBoundaryId(UUID geographicBoundaryId) {
	this.geographicBoundaryId = geographicBoundaryId;
 }

 public UUID getOrganizationId() {
	return organizationId;
 }

 public void setOrganizationId(UUID organizationId) {
	this.organizationId = organizationId;
 }

 @Override
 public String toString() {
	return new ToStringBuilder(this)
		.append("fromDate", fromDate)
		.append("thruDate", thruDate)
		.append("cost", cost)
		.append("type", type)
		.append("product", product)
		.append("feature", feature)
		.append("geographicBoundaryId", geographicBoundaryId)
		.append("organizationId", organizationId)
		.toString();
 }
}

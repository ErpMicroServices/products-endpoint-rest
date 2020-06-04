package org.erpmicroservices.products.api.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity(name = "price_component")
public class PriceComponent extends AbstractPersistable<UUID> {
 @Column(name = "from_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate fromDate;

 @Column(name = "thru_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate thruDate;

 private BigDecimal price;

 private BigDecimal percent;

 private String comment;

 private UUID geographicBoundaryId;

 private UUID partyType;

 @ManyToOne
 @JoinColumn(name = "product_category_id")
 private ProductCategory category;

 @OneToOne
 @JoinColumn(name = "quantity_break_id")
 private QuantityBreak quantityBreak;

 @OneToOne
 @JoinColumn(name = "order_value_id")
 private OrderValue orderValue;

 @OneToOne
 @JoinColumn(name = "sale_type_id")
 private SaleType saleType;

 @ManyToOne
 @JoinColumn(name = "unit_of_measure_id")
 private UnitOfMeasure unitOfMeasure;

 private UUID partyId;

 @ManyToOne
 @JoinColumn(name = "feature_id")
 private Feature feature;

 @ManyToOne
 private Product product;

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

 public BigDecimal getPrice() {
	return price;
 }

 public void setPrice(BigDecimal price) {
	this.price = price;
 }

 public BigDecimal getPercent() {
	return percent;
 }

 public void setPercent(BigDecimal percent) {
	this.percent = percent;
 }

 public String getComment() {
	return comment;
 }

 public void setComment(String comment) {
	this.comment = comment;
 }

 public UUID getGeographicBoundaryId() {
	return geographicBoundaryId;
 }

 public void setGeographicBoundaryId(UUID geographicBoundaryId) {
	this.geographicBoundaryId = geographicBoundaryId;
 }

 public UUID getPartyType() {
	return partyType;
 }

 public void setPartyType(UUID party_type) {
	this.partyType = party_type;
 }

 public ProductCategory getCategory() {
	return category;
 }

 public void setCategory(ProductCategory category) {
	this.category = category;
 }

 public QuantityBreak getQuantityBreak() {
	return quantityBreak;
 }

 public void setQuantityBreak(QuantityBreak quantityBreak) {
	this.quantityBreak = quantityBreak;
 }

 public OrderValue getOrderValue() {
	return orderValue;
 }

 public void setOrderValue(OrderValue orderValue) {
	this.orderValue = orderValue;
 }

 public SaleType getSaleType() {
	return saleType;
 }

 public void setSaleType(SaleType saleType) {
	this.saleType = saleType;
 }

 public UnitOfMeasure getUnitOfMeasure() {
	return unitOfMeasure;
 }

 public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
	this.unitOfMeasure = unitOfMeasure;
 }

 public UUID getPartyId() {
	return partyId;
 }

 public void setPartyId(UUID partyId) {
	this.partyId = partyId;
 }

 public Feature getFeature() {
	return feature;
 }

 public void setFeature(Feature feature) {
	this.feature = feature;
 }

 public Product getProduct() {
	return product;
 }

 public void setProduct(Product product) {
	this.product = product;
 }
}

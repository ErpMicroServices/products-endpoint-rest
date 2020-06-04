package org.erpmicroservices.products.api.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity(name = "price_component")
public class PriceComponent extends AbstractPersistable<UUID> {
 private LocalDate fromDate;
 private LocalDate thruDate;
 private BigDecimal price;
 private BigDecimal percent;
 private String comment;
 private UUID geographic_boundary_id;
 private UUID party_type;
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
 @JoinColumn(name = "product_id")
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

 public UUID getGeographic_boundary_id() {
	return geographic_boundary_id;
 }

 public void setGeographic_boundary_id(UUID geographic_boundary_id) {
	this.geographic_boundary_id = geographic_boundary_id;
 }

 public UUID getParty_type() {
	return party_type;
 }

 public void setParty_type(UUID party_type) {
	this.party_type = party_type;
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

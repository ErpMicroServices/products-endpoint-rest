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

@Entity(name = "product_association")
public class ProductAssociation extends AbstractPersistable<UUID> {

 @Column(name = "from_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate fromDate;

 @Column(name = "thru_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate thruDate;

 private String reason;

 private long quantityUsed;

 private String instruction;

 private long quantity;

 @ManyToOne
 @JoinColumn(name = "product_association_type_id")
 private ProductAssociationType type;

 @ManyToOne
 private Product fromProduct;

 @ManyToOne
 private Product toProduct;

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

 public String getReason() {
  return reason;
 }

 public void setReason(String reason) {
  this.reason = reason;
 }

 public long getQuantityUsed() {
  return quantityUsed;
 }

 public void setQuantityUsed(long quantityUsed) {
  this.quantityUsed = quantityUsed;
 }

 public String getInstruction() {
  return instruction;
 }

 public void setInstruction(String instruction) {
  this.instruction = instruction;
 }

 public long getQuantity() {
  return quantity;
 }

 public void setQuantity(long quantity) {
  this.quantity = quantity;
 }

 public ProductAssociationType getType() {
  return type;
 }

 public void setType(ProductAssociationType type) {
  this.type = type;
 }

 public Product getFromProduct() {
  return fromProduct;
 }

 public void setFromProduct(Product fromProduct) {
  this.fromProduct = fromProduct;
 }

 public Product getToProduct() {
  return toProduct;
 }

 public void setToProduct(Product toProduct) {
  this.toProduct = toProduct;
 }
}

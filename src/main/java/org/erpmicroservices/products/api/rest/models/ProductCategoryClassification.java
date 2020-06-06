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

@Entity(name = "product_category_classification")
public class ProductCategoryClassification extends AbstractPersistable<UUID> {

 @Column(name = "from_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate fromDate;

 @Column(name = "thru_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate thruDate;

 private boolean primaryFlag;

 private String comment;

 @ManyToOne
 private Product product;

 @ManyToOne
 @JoinColumn(name = "product_category_id")
 private ProductCategory category;

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

 public boolean isPrimaryFlag() {
  return primaryFlag;
 }

 public void setPrimaryFlag(boolean primaryFlag) {
  this.primaryFlag = primaryFlag;
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

 public ProductCategory getCategory() {
  return category;
 }

 public void setCategory(ProductCategory category) {
  this.category = category;
 }
}

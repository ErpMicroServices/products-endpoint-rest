package org.erpmicroservices.products.api.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class Lot extends AbstractPersistable<UUID> {

 private LocalDate creationDate;

 private long quantity;

 private LocalDate expirationDate;

 @OneToMany(mappedBy = "lot")
 private List<InventoryItem> items = new ArrayList<>();

 public LocalDate getCreationDate() {
  return creationDate;
 }

 public void setCreationDate(LocalDate creationDate) {
  this.creationDate = creationDate;
 }

 public long getQuantity() {
  return quantity;
 }

 public void setQuantity(long quantity) {
  this.quantity = quantity;
 }

 public LocalDate getExpirationDate() {
  return expirationDate;
 }

 public void setExpirationDate(LocalDate expirationDate) {
  this.expirationDate = expirationDate;
 }

 public List<InventoryItem> getItems() {
  return items;
 }

 public void setItems(List<InventoryItem> items) {
  this.items = items;
 }
}

package org.erpmicroservices.products.api.rest.models;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity(name = "inventory_item_variance")
public class InventoryItemVariance extends AbstractPersistable<UUID> {

 private String comment;
 private Long quantity;
 @ManyToOne
 @JoinColumn(name = "reason_id")
 private Reason reason;
 @ManyToOne
 @JoinColumn(name = "inventory_item_id")
 private InventoryItem item;

 public InventoryItem getItem() {
	return item;
 }

 public void setItem(InventoryItem item) {
	this.item = item;
 }

 public String getComment() {
	return comment;
 }

 public void setComment(String comment) {
	this.comment = comment;
 }

 public Long getQuantity() {
	return quantity;
 }

 public void setQuantity(Long quantity) {
	this.quantity = quantity;
 }

 public Reason getReason() {
	return reason;
 }

 public void setReason(Reason reason) {
	this.reason = reason;
 }

 @Override
 public String toString() {
	return new ToStringBuilder(this)
		.append("comment", comment)
		.append("quantity", quantity)
		.append("reason", reason)
		.toString();
 }
}

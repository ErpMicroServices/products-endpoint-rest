package org.erpmicroservices.products.api.rest.models;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "inventory_item")
public class InventoryItem extends AbstractPersistable<UUID> {
 private String serialNum;

 private long quantityOnHand;

 @ManyToOne
 @JoinColumn(name = "inventory_item_status_type_id")
 private InventoryItemStatusType statusType;

 @ManyToOne
 @JoinColumn(name = "lot_id")
 private Lot lot;

 @ManyToOne
 @JoinColumn(name = "container_id")
 private Container container;

 @ManyToOne
 @JoinColumn(name = "good_id")
 private Product good;

 private UUID facilityId;

 public Product getGood() {
	return good;
 }

 public void setGood(Product good) {
	this.good = good;
 }

 public String getSerialNum() {
	return serialNum;
 }

 public void setSerialNum(String serialNum) {
	this.serialNum = serialNum;
 }

 public long getQuantityOnHand() {
	return quantityOnHand;
 }

 public void setQuantityOnHand(long quantityOnHand) {
	this.quantityOnHand = quantityOnHand;
 }

 public InventoryItemStatusType getStatusType() {
	return statusType;
 }

 public void setStatusType(InventoryItemStatusType statusType) {
	this.statusType = statusType;
 }

 public Lot getLot() {
	return lot;
 }

 public void setLot(Lot lot) {
	this.lot = lot;
 }

 public Container getContainer() {
	return container;
 }

 public void setContainer(Container container) {
	this.container = container;
 }

 public UUID getFacilityId() {
	return facilityId;
 }

 public void setFacilityId(UUID facilityId) {
	this.facilityId = facilityId;
 }

 @Override
 public String toString() {
	return new ToStringBuilder(this)
		.append("serialNum", serialNum)
		.append("quantityOnHand", quantityOnHand)
		.append("statusType", statusType)
		.append("lot", lot)
		.append("container", container)
		.append("facilityId", facilityId)
		.toString();
 }
}

package org.erpmicroservices.products.api.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import java.util.UUID;

@Entity(name = "quantity_break")
public class QuantityBreak extends AbstractPersistable<UUID> {
 private long fromQuantity;
 private long thruQuantity;

 public long getFromQuantity() {
	return fromQuantity;
 }

 public void setFromQuantity(long fromQuantity) {
	this.fromQuantity = fromQuantity;
 }

 public long getThruQuantity() {
	return thruQuantity;
 }

 public void setThruQuantity(long thruQuantity) {
	this.thruQuantity = thruQuantity;
 }
}

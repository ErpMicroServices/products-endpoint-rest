package org.erpmicroservices.products.api.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.UUID;

@Entity(name = "order_value")
public class OrderValue extends AbstractPersistable<UUID> {
 private BigDecimal fromAmount;
 private BigDecimal thruAmount;

 public BigDecimal getFromAmount() {
	return fromAmount;
 }

 public void setFromAmount(BigDecimal fromAmount) {
	this.fromAmount = fromAmount;
 }

 public BigDecimal getThruAmount() {
	return thruAmount;
 }

 public void setThruAmount(BigDecimal thruAmount) {
	this.thruAmount = thruAmount;
 }
}

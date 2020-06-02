package org.erpmicroservices.products.api.rest.models;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "good_identification_id_value")
public class GoodIdentification extends AbstractPersistable<UUID> {
 private String value;
 @ManyToOne
 private Product good;
 @ManyToOne
 @JoinColumn(name = "good_identification_type_id")
 private GoodIdentificationType type;

 public String getValue() {
	return value;
 }

 public void setValue(String value) {
	this.value = value;
 }

 public Product getGood() {
	return good;
 }

 public void setGood(Product good) {
	this.good = good;
 }

 public GoodIdentificationType getType() {
	return type;
 }

 public void setType(GoodIdentificationType type) {
	this.type = type;
 }

 @Override
 public String toString() {
	return new ToStringBuilder(this)
		.append("value", value)
		.append("good", good)
		.append("type", type)
		.toString();
 }
}

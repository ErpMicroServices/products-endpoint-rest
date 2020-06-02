package org.erpmicroservices.products.api.rest.models;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class Reason extends AbstractPersistable<UUID> {

 private String description;

 public String getDescription() {
	return description;
 }

 public void setDescription(String description) {
	this.description = description;
 }

 @Override
 public String toString() {
	return new ToStringBuilder(this)
		.append("description", description)
		.toString();
 }
}

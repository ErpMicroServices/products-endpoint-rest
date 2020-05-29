package org.erpmicroservices.products.api.rest.models;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import java.util.UUID;

@Entity
public class Product extends AbstractPersistable<UUID> {

 @NotEmpty
 private String name;

 public String getName() {
	return name;
 }

 public void setName(String name) {
	this.name = name;
 }

 @Override
 public String toString() {
	return new ToStringBuilder(this)
		.append("name", name)
		.toString();
 }
}

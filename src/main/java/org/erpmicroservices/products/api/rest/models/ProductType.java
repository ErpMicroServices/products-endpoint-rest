package org.erpmicroservices.products.api.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import java.util.UUID;

@Entity
public class ProductType extends AbstractPersistable<UUID> {

 @NotEmpty
 private String description = "";

 public String getDescription() {
	return description;
 }

 public void setDescription(String description) {
	this.description = description;
 }

}

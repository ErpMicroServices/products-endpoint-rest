package org.erpmicroservices.products.api.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class FeatureCategory extends AbstractPersistable<UUID> {
 private String description;

 public String getDescription() {
	return description;
 }

 public void setDescription(String description) {
	this.description = description;
 }
}

package org.erpmicroservices.products.api.rest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity()
public class CostComponentType {

 @Id
 @GeneratedValue(generator = "uuid")
 private UUID id;
 private String description;

 public UUID getId() {
	return id;
 }

 public void setId(UUID id) {
	this.id = id;
 }

 public String getDescription() {
	return description;
 }

 public void setDescription(String description) {
	this.description = description;
 }

}

package org.erpmicroservices.products.api.rest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.util.UUID;

@Entity()
public class ContainerType {

 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private UUID id;

 @NotEmpty
 private String description = "";

 public String getDescription() {
	return description;
 }

 public void setDescription(String description) {
	this.description = description;
 }

 public UUID getId() {
	return id;
 }

 public void setId(UUID id) {
	this.id = id;
 }
}

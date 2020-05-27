package org.erpmicroservices.products.api.rest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.util.Objects;
import java.util.UUID;

@Entity
public class CostComponentType {

 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private UUID id;
 @NotEmpty
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

 @Override
 public boolean equals(Object o) {
	if (this == o) return true;
	if (!(o instanceof CostComponentType)) return false;
	CostComponentType that = (CostComponentType) o;
	return getId().equals(that.getId());
 }

 @Override
 public int hashCode() {
	return Objects.hash(getId());
 }
}

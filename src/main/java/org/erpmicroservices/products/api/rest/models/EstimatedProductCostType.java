package org.erpmicroservices.products.api.rest.models;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.util.Objects;
import java.util.UUID;

@Entity
public class EstimatedProductCostType {
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

 @Override
 public boolean equals(Object o) {
	if (this == o) return true;
	if (!(o instanceof ContainerType)) return false;
	ContainerType that = (ContainerType) o;
	return getId().equals(that.getId());
 }

 @Override
 public int hashCode() {
	return Objects.hash(getId());
 }

 @Override
 public String toString() {
	return new ToStringBuilder(this)
		.append("id", id)
		.append("description", description)
		.toString();
 }
}

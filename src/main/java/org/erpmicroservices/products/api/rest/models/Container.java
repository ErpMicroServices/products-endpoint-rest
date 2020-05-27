package org.erpmicroservices.products.api.rest.models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Objects;
import java.util.UUID;

@Entity
public class Container {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private UUID id;

 @NotEmpty
 private String description;

 @NotNull
 @ManyToOne
 @JoinColumn(name = "container_type_id", nullable = false)
 private ContainerType type;

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

 public ContainerType getType() {
	return type;
 }

 public void setType(ContainerType type) {
	this.type = type;
 }

 @Override
 public boolean equals(Object o) {
	if (this == o) return true;
	if (!(o instanceof Container)) return false;
	Container container = (Container) o;
	return getId().equals(container.getId());
 }

 @Override
 public int hashCode() {
	return Objects.hash(getId());
 }

 @Override
 public String toString() {
	return new org.apache.commons.lang3.builder.ToStringBuilder(this)
		.append("id", id)
		.append("description", description)
		.append("type", type)
		.toString();
 }
}

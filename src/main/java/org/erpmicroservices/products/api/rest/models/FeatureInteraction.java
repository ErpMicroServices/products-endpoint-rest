package org.erpmicroservices.products.api.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.UUID;

@Entity(name = "feature_interaction")
@Table(name = "feature_interaction")
public class FeatureInteraction extends AbstractPersistable<UUID> {
 @ManyToOne
 @JoinColumn(name = "feature1_id")
 private Feature feature1;
 @ManyToOne
 @JoinColumn(name = "feature2_id")
 private Feature feature2;
 @ManyToOne
 @JoinColumn(name = "product_id")
 private Product product;
 @ManyToOne
 @JoinColumn(name = "feature_interaction_type_id")
 private FeatureInteractionType type;

 public Feature getFeature1() {
	return feature1;
 }

 public void setFeature1(Feature betweenThis) {
	this.feature1 = betweenThis;
 }

 public Feature getFeature2() {
	return feature2;
 }

 public void setFeature2(Feature andThis) {
	this.feature2 = andThis;
 }

 public Product getProduct() {
	return product;
 }

 public void setProduct(Product contextOf) {
	this.product = contextOf;
 }

 public FeatureInteractionType getType() {
	return type;
 }

 public void setType(FeatureInteractionType type) {
	this.type = type;
 }
}

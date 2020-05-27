package org.erpmicroservices.products.api.rest.repositories;

import org.erpmicroservices.products.api.rest.models.PriceComponentType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource
public interface PriceComponentTypeRepository extends PagingAndSortingRepository<PriceComponentType, UUID> {

}

package org.erpmicroservices.products.api.rest.repositories;

import org.erpmicroservices.products.api.rest.models.SaleType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource
public interface SaleTypeRepository extends PagingAndSortingRepository<SaleType, UUID> {

}

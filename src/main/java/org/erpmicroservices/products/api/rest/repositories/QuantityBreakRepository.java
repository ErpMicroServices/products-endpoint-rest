package org.erpmicroservices.products.api.rest.repositories;

import org.erpmicroservices.products.api.rest.models.QuantityBreak;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource
public interface QuantityBreakRepository extends PagingAndSortingRepository<QuantityBreak, UUID> {

}

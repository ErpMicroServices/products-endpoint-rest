package org.erpmicroservices.products.api.rest.repositories;

import org.erpmicroservices.products.api.rest.models.ContainerType;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface ContainerTypeRepository extends PagingAndSortingRepository<ContainerType, UUID> {

}

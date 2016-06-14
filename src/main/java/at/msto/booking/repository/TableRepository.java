package at.msto.booking.repository;

import at.msto.booking.model.Table;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.math.BigInteger;

/**
 * Created by mladenstojanovic on 13.06.16.
 */
@RepositoryRestResource(collectionResourceRel = "tables", path = "tables")
public interface TableRepository extends MongoRepository<Table, BigInteger> {
}

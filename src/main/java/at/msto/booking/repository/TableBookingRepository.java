package at.msto.booking.repository;

import at.msto.booking.model.TablesBooking;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.math.BigInteger;

/**
 * Created by mladenstojanovic on 13.06.16.
 */
@RepositoryRestResource(collectionResourceRel = "tablebookings", path = "tablebookings")
public interface TableBookingRepository extends MongoRepository<TablesBooking, BigInteger> {
}
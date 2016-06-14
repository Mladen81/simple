package at.msto.partner.repository;

import at.msto.partner.model.Partner;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.math.BigInteger;

/**
 * Created by mladenstojanovic on 13.06.16.
 */
@RepositoryRestResource(collectionResourceRel = "partners", path = "partners")
public interface PartnerRepository extends MongoRepository<Partner, BigInteger> {
}

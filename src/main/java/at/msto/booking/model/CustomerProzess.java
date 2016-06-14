package at.msto.booking.model;

import at.msto.partner.model.Customer;
import org.springframework.data.annotation.Id;

import java.math.BigInteger;

/**
 * Created by mladenstojanovic on 13.06.16.
 */
public class CustomerProzess {
    @Id
    private BigInteger id;

    private Customer customer;

    public BigInteger getId() {
        return id;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
}

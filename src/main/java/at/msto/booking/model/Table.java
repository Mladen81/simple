package at.msto.booking.model;

import org.springframework.data.annotation.Id;

import java.math.BigInteger;

/**
 * Created by mladenstojanovic on 13.06.16.
 */
public class Table {
    @Id
    private BigInteger id;
    private String name;

    public BigInteger getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

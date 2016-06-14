package at.msto.partner.model;

import org.springframework.data.annotation.Id;

import java.math.BigInteger;

/**
 * Created by mladenstojanovic on 13.06.16.
 */
public class Partner {
    @Id
    private BigInteger id;
    private String name;
    private EMail email;

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(EMail email) {
        this.email = email;
    }

    public EMail getEmail() {
        return email;
    }
}

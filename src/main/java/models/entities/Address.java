package models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

    @Column(nullable = false)
    private String address1;
    @Column(nullable = false)
    private String address2;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String country;
}

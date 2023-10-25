package models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter @Setter
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50,unique = true,nullable = false)
    private String name;

    //Si je veux faire une relation bidirrectionnel
//    @OneToMany(mappedBy = "author")
//    private Set<Book> books;

    @Embedded
    private Address address;
}

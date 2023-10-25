package models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100,unique = true,nullable = false)
    private String title;

    private String description;

    @ManyToOne
    @JoinColumn(name = "trucID",foreignKey = @ForeignKey(name = "FK_Machin"))
    private Author author;
}

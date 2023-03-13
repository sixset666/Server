//localhost123$
package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Getter
@Setter
@Entity
@AllArgsConstructor
@Table(name = "book")
@RequiredArgsConstructor
@Data

public class BookEntity {
    @Column(name = "book_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String title;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "author_id")
    private AuthorEntity author;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "publishing_id")
    private PublisherEntity publishing;
    private int year;
    private String kind;
}

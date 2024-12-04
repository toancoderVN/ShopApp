package com.example.shopapp.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "roles")
@Data//toString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Khôn có bản ghi nào giống nhau cả
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
}

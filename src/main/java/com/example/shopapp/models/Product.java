package com.example.shopapp.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "products")
@Data//toString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Khôn có bản ghi nào giống nhau cả
    private Long id;

    @Column(name = "name", nullable = false, length = 350)
    private String name;

    private Float price;

    @Column(name = "thumbnail", nullable = true, length = 300)
    //Bạn thấy true báo mờ, nghĩa là đang thừa, mình có thể bỏ câu lệnh đó đi được
    private String thumbnail;

    @Column(name = "description")
    //Như trường hợp này, ta đã loại bỏ nullable = true rồi
    private String description;

    @ManyToOne // Nhiều sang một
    @JoinColumn(name = "category_id")
    private Category category;
}

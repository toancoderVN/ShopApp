package com.example.shopapp.repositories;

import com.example.shopapp.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Thường sẽ viết thêm cái này, nhưng khi này extends JpaRepository thì nó không cần thiết
public interface CategoryRepository extends JpaRepository<Category, Long> {

}

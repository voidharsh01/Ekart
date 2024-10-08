package com.dailycodework.ekart.repository;

import com.dailycodework.ekart.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByUserId(Long userId);
}

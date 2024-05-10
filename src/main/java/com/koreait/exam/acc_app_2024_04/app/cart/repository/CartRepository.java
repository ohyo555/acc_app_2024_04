package com.koreait.exam.acc_app_2024_04.app.cart.repository;

import com.koreait.exam.acc_app_2024_04.app.cart.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}

package com.github.luisgabrieldev.ecommerce_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.luisgabrieldev.ecommerce_api.entities.OrderItem;
import com.github.luisgabrieldev.ecommerce_api.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
package com.example.shopapp.responses;

import com.example.shopapp.models.Order;
import com.example.shopapp.models.OrderDetail;
import com.example.shopapp.models.Product;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDetailResponses {
    private Long id;

    @JoinColumn(name = "order_id")
    private Long orderId;

    @JoinColumn(name = "product_id")
    private Long productId;

    @Column(name = "price")
    private Float price;

    @Column(name = "number_of_products")
    private int numberOfProducts;

    @Column(name = "total_money")
    private Float totalMoney;

    private String color;

    public static OrderDetailResponses fromOrderDetail(OrderDetail orderDetail){
        return OrderDetailResponses
                .builder()
                .id(orderDetail.getId())
                .orderId(orderDetail.getOrder().getId())
                .productId(orderDetail.getProduct().getId())
                .price(orderDetail.getPrice())
                .numberOfProducts(orderDetail.getNumberOfProducts())
                .totalMoney(orderDetail.getTotalMoney())
                .color(orderDetail.getColor())
                .build();
    }

}

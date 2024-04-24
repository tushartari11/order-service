package com.telefonica.prepaid.order.entity;

import com.telefonica.prepaid.order.dto.FoodItemsDTO;
import com.telefonica.prepaid.order.dto.Restaurant;
import com.telefonica.prepaid.order.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("order")
public class Order {
    private Integer orderId;
    private List<FoodItemsDTO> foodItemsList;
    private Restaurant restaurant;
    private UserDTO userDTO;

}

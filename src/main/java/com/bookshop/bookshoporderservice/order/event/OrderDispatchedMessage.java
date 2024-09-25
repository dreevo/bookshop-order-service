package com.bookshop.bookshoporderservice.order.event;

public record OrderDispatchedMessage (
        Long orderId
){}
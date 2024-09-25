package com.bookshop.bookshoporderservice.order.event;

public record OrderAcceptedMessage (
        Long orderId
){}
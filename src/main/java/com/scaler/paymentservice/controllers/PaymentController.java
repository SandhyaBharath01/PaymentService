package com.scaler.paymentservice.controllers;

import com.razorpay.RazorpayException;
import com.scaler.paymentservice.dtos.GeneratePaymentLinkRequestDto;
import com.scaler.paymentservice.services.PaymentService;
import com.stripe.exception.StripeException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/payments")

public class PaymentController {
    private PaymentService paymentService;

    public PaymentController(@Qualifier("stripePaymentGateway") PaymentService paymentService){
        this.paymentService = paymentService;
    }
    @PostMapping()
    public String generatePaymentLink(@RequestBody GeneratePaymentLinkRequestDto requestDto) throws RazorpayException, StripeException{
        return paymentService.generatePaymentLink(requestDto.getOrderId());
    }
    @PostMapping("/webhook")
    public void handleWebHook(@RequestBody Object object){
        System.out.println("Webhook Triggered");
    }
}

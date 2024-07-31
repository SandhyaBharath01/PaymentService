//package com.scaler.paymentservice.services;
//
//import com.razorpay.PaymentLink;
//import com.razorpay.RazorpayClient;
//import com.razorpay.RazorpayException;
//import com.stripe.exception.StripeException;
//import org.json.JSONObject;
//import org.springframework.stereotype.Service;
//
//@Service("razorpayPaymentGateway")
//public class RazorpayPaymentGateway implements PaymentService{
//    public RazorpayClient razorpayClient;
//
//    public RazorpayPaymentGateway(RazorpayClient razorpayClient){
//        this.razorpayClient = razorpayClient;
//    }
//
//    @Override
//    public String generatePaymentLink(Long orderId) throws RazorpayException, StripeException {
//        JSONObject paymentLinkRequest = new JSONObject();
//
//        paymentLinkRequest.put("amount", 1000); //10.00 //98.76 = 98.76 * 100 => 9876
//        paymentLinkRequest.put("currency","INR");
////        paymentLinkRequest.put("accept_partial",true);
////        paymentLinkRequest.put("first_min_partial_amount",100);
//        paymentLinkRequest.put("expire_by", System.currentTimeMillis() + 10 * 60 * 1000);
//        paymentLinkRequest.put("reference_id", orderId.toString());
//        paymentLinkRequest.put("description","Payment for a chocolate.");
//        JSONObject customer = new JSONObject();
//
//        customer.put("name","Sandhya");
//        customer.put("contact","+9553729939");
//        customer.put("email","sandhyateegula@gmail.com");
//        paymentLinkRequest.put("customer", customer);
//        JSONObject notify = new JSONObject();
//        notify.put("sms",true);
//        notify.put("email",true);
//        paymentLinkRequest.put("reminder_enable",true);
//        JSONObject notes = new JSONObject();
////        notes.put("policy_name","Jeevan Bima");
////        paymentLinkRequest.put("notes",notes);
//        paymentLinkRequest.put("callback_url","www.google.com");
//        paymentLinkRequest.put("callback_method","get");
//
//        PaymentLink payment = razorpayClient.paymentLink.create(paymentLinkRequest);
//
//        return payment.get("short_url");
//    }
//}

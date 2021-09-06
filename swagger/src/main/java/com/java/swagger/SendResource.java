package com.java.swagger;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/send")
public class SendResource {

    @GetMapping
    public String SendVoice(String numberA, String numberB, int duration, String location) {
        return String.format("Made %d-minute call from %s to %s in %s", duration,numberA,numberB,location);
    }

    @PostMapping
    public String SendSms(String numberA,String numberB,String location) {
        return String.format("Sms sent from %s to %s in %s", numberA,numberB,location);
    }

    @GetMapping
    public String SendData (String numberA,int mb,String ratingGroup,String location){
        return String.format("%d mb used by %s in group %s in %s", mb,numberA,ratingGroup,location);
    }
}

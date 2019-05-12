package com.gonnect.flowable;

import org.springframework.stereotype.Service;

@Service
public class ReviewFlowService {

    public void review(String execution) {
        System.out.println(">>>>>>>>>>>" + ReviewFlowService.class.getSimpleName() + "#" + "review(execution)");
    }
}

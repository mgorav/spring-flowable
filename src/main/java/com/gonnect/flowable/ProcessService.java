package com.gonnect.flowable;

import org.springframework.stereotype.Service;

@Service
public class ProcessService {

    public void execute(String execution) {
        System.out.println(">>>>>>>>>>>" + ProcessService.class.getSimpleName() + "#" + "execute(execution)");
    }
}

package com.gonnect.flowable;

import org.springframework.stereotype.Service;

@Service
public class LoadService {

    public void execute(String execution) {
        System.out.println(">>>>>>>>>>>" + LoadService.class.getSimpleName() + "#" + "execute(execution)");
    }
}

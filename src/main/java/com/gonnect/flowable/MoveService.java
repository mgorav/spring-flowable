package com.gonnect.flowable;

import org.springframework.stereotype.Service;

@Service
public class MoveService {

    public void execute(String execution) {
        System.out.println(">>>>>>>>>>>" + MoveService.class.getSimpleName() + "#" + "execute(execution)");
    }
}

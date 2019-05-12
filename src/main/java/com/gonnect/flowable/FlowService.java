package com.gonnect.flowable;

import org.springframework.stereotype.Service;

@Service
public class FlowService {

    private boolean isMoveStep;
    private boolean isProcessStep;
    private boolean isLoadStep = true;
    private boolean isException;
    private boolean isNextDataEngineeringFlow;

    public boolean isMoveStep(String execution) {
        System.out.println("isMoveStep = " + isMoveStep);
        return isMoveStep;
    }

    public boolean isProcessStep(String execution) {
        System.out.println("isProcessStep = " + isProcessStep);
        return isProcessStep;
    }

    public boolean isLoadStep(String execution) {
        System.out.println("isLoadStep = " + isLoadStep);
        return isLoadStep;
    }

    public boolean isException(String execution) {
        System.out.println("isException = " + isException);
        return isException;
    }

    public boolean isNextDataEngineeringFlow(String execution) {
        System.out.println("isNextDataEngineeringFlow = " + isNextDataEngineeringFlow);
        return isNextDataEngineeringFlow;
    }
}

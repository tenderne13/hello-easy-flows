package org.feuyeux.workflow.works;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.jeasy.flows.work.DefaultWorkReport;
import org.jeasy.flows.work.WorkContext;
import org.jeasy.flows.work.WorkReport;
import org.jeasy.flows.work.WorkStatus;
import org.springframework.stereotype.Service;

import java.util.Random;

@Slf4j
@Service("C")
public class CWork extends ZeroWork {

    @PostConstruct
    public void init() {
        this.random = new Random();
    }

    public String getName() {
        return "CWork";
    }
}

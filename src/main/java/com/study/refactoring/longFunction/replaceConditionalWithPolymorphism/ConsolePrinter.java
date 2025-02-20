package com.study.refactoring.longFunction.replaceConditionalWithPolymorphism;

import java.io.IOException;
import java.util.List;

public class ConsolePrinter extends StudyPrinter {
    public ConsolePrinter(int totalNumberOfEvents, List<Participant> participants) {
        super(totalNumberOfEvents, participants);
    }

    @Override
    public void execute() throws IOException {
        this.participants.forEach(p -> {
            System.out.printf("%s %s:%s\n", p.username(), checkMark(p), p.getRate(this.totalNumberOfEvents));
        });
    }
}

package com.study.refactoring.longFunction.replaceConditionalWithPolymorphism;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public abstract class StudyPrinter {

    protected final int totalNumberOfEvents; //상속 받은 클래스에서 사용할 수 있도록 protected 로 변경

    protected final List<Participant> participants;

    public StudyPrinter(int totalNumberOfEvents, List<Participant> participants) {
        this.totalNumberOfEvents = totalNumberOfEvents;
        this.participants = participants;
        this.participants.sort(Comparator.comparing(Participant::username));
    }

    // 조건문을 다형성으로 바꾸기
    public abstract void execute() throws IOException;

    /**
     * |:white_check_mark:|:white_check_mark:|:white_check_mark:|:x:|
     */
    protected String checkMark(Participant p) {
        StringBuilder line = new StringBuilder();
        for (int i = 1 ; i <= this.totalNumberOfEvents ; i++) {
            if(p.homework().containsKey(i) && p.homework().get(i)) {
                line.append("|:white_check_mark:");
            } else {
                line.append("|:x:");
            }
        }
        return line.toString();
    }
}

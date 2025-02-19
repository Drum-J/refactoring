package com.study.refactoring.longFunction.preserveWholeObject;

import java.util.HashMap;
import java.util.Map;

public record Participant(String username, Map<Integer, Boolean> homework) {
    public Participant(String username) {
        this(username, new HashMap<>());
    }

    public void setHomeworkDone(int index) {
        this.homework.put(index, true);
    }

    // String username, Map<Integer, Boolean> homework -> Participant participant 로 리팩토링
    // 2. 해당 메서드의 위치가 적절한가? StudyDashboard 에서 Participant 로 이동 StudyDashboard.totalNumberOfEvents 를 넘겨 받고 있다.
    double getRate(int studyDashboard) {
        long count = homework().values().stream()
                .filter(v -> v == true)
                .count();
        return (double) (count * 100 / studyDashboard);
    }
}

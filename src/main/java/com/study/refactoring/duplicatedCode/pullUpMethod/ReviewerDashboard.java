package com.study.refactoring.duplicatedCode.pullUpMethod;

import java.io.IOException;

public class ReviewerDashboard extends Dashboard{

    public void printReviewers() throws IOException {
        super.printUsernames(30);
    }
}

package com.study.refactoring.duplicatedCode.extractFunction;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class StudyDashboard {

    private void printParticipants(int eventId) throws IOException {
        // Get github issue to check homework
        GHIssue issue = getGhIssue(eventId);

        // Get participants
        Set<String> participants = getUsernames(issue);

        // Print participants
        print(participants);
    }

    private void printReviewers() throws IOException {
        //메서드로 바꿔서 주석이 필요 없어짐.
        GHIssue issue = getGhIssue(30);
        Set<String> reviewers = getUsernames(issue);
        print(reviewers);
    }

    private static GHIssue getGhIssue(int eventId) throws IOException {
        GitHub gitHub = new GitHubBuilder().withOAuthToken("").build();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
        return repository.getIssue(eventId);
    }

    private static Set<String> getUsernames(GHIssue issue) throws IOException {
        HashSet<String> usernames = new HashSet<>();
        issue.getComments().forEach(c -> usernames.add(c.getUserName()));
        return usernames;
    }

    private static void print(Set<String> participants) {
        participants.forEach(System.out::println);
    }

    public static void main(String[] args) throws IOException {
        StudyDashboard studyDashboard = new StudyDashboard();
        studyDashboard.printReviewers();
        studyDashboard.printParticipants(15);
    }
}

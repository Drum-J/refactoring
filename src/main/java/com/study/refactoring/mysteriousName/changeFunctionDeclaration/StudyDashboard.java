package com.study.refactoring.mysteriousName.changeFunctionDeclaration;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueComment;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudyDashboard {
    private Set<String> username = new HashSet<>();
    private Set<String> reviews = new HashSet<>();
    
    private void loadReviews() throws IOException {
        GitHub gitHub = new GitHubBuilder().withOAuthToken("").build();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
        GHIssue issue = repository.getIssue(30);

        List<GHIssueComment> comments = issue.getComments();
        for (GHIssueComment comment : comments) {
            username.add(comment.getUser().getName());
            reviews.add(comment.getBody());
        }
    }

    private Set<String> getUsernames() {
        return username;
    }

    private Set<String> getReviews() {
        return reviews;
    }

    public static void main(String[] args) throws IOException {
        StudyDashboard studyDashboard = new StudyDashboard();
        studyDashboard.loadReviews();
        studyDashboard.getUsernames().forEach(System.out::println);
        studyDashboard.getReviews().forEach(System.out::println);
    }
}

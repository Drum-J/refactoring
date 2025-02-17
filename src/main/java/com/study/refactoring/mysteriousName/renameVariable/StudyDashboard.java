package com.study.refactoring.mysteriousName.renameVariable;

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

        //로컬 변수명 comments -> reviews 변경
        List<GHIssueComment> reviews = issue.getComments();
        for (GHIssueComment review : reviews) {
            username.add(review.getUser().getName());
            this.reviews.add(review.getBody());
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

        //람다식 사용, 명시적으로 name, review 사용
        studyDashboard.getUsernames().forEach(name -> System.out.println(name));
        studyDashboard.getReviews().forEach(review -> System.out.println(review));

        //람다식 -> 메서드 레퍼런스 사용
        //studyDashboard.getUsernames().forEach(System.out::println);
        //studyDashboard.getReviews().forEach(System.out::println);
    }
}

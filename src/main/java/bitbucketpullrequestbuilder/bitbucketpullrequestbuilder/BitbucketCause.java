package bitbucketpullrequestbuilder.bitbucketpullrequestbuilder;

import hudson.model.Cause;

/**
 * Created by nishio
 */
public class BitbucketCause extends Cause {
    private final String sourceBranch;
    private final String targetBranch;
    private final String repositoryOwner;
    private final String repositoryName;
    private final String pullRequestId;
    private final String destinationRepositoryOwner;
    private final String destinationRepositoryName;
    private final String pullRequestTitle;
    private final String commitHash;
    private final String buildStartCommentId;
    public static final String BITBUCKET_URL = "https://bitbucket.org/";

    public BitbucketCause(String sourceBranch,
                          String targetBranch,
                          String repositoryOwner,
                          String repositoryName,
                          String pullRequestId,
                          String destinationRepositoryOwner,
                          String destinationRepositoryName,
                          String pullRequestTitle,
                          String commitHash,
                          String buildStartCommentId) {
        this.sourceBranch = sourceBranch;
        this.targetBranch = targetBranch;
        this.repositoryOwner = repositoryOwner;
        this.repositoryName = repositoryName;
        this.pullRequestId = pullRequestId;
        this.destinationRepositoryOwner = destinationRepositoryOwner;
        this.destinationRepositoryName = destinationRepositoryName;
        this.pullRequestTitle = pullRequestTitle;
        this.commitHash = commitHash;
        this.buildStartCommentId = buildStartCommentId;
    }

    public String getSourceBranch() {
        return sourceBranch;
    }
    public String getTargetBranch() {
        return targetBranch;
    }

    public String getRepositoryOwner() {
        return repositoryOwner;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public String getPullRequestId() {
        return pullRequestId;
    }


    public String getDestinationRepositoryOwner() {
        return destinationRepositoryOwner;
    }

    public String getDestinationRepositoryName() {
        return destinationRepositoryName;
    }

    public String getPullRequestTitle() {
        return pullRequestTitle;
    }

    public String getCommitHash() { return commitHash; }

    public String getBuildStartCommentId() { return buildStartCommentId; }

    @Override
    public String getShortDescription() {
        String description = "<a href=" + BITBUCKET_URL + this.getDestinationRepositoryOwner() + "/";
        description += this.getDestinationRepositoryName() + "/pull-request/" + this.getPullRequestId();
        description += ">#" + this.getPullRequestId() + " " + this.getPullRequestTitle() + "</a>";
        return description;
    }
}

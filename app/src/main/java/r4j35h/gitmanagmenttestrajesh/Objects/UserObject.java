package r4j35h.gitmanagmenttestrajesh.Objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserObject {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("node_id")
@Expose
private String nodeId;
@SerializedName("name")
@Expose
private String name;
@SerializedName("full_name")
@Expose
private String fullName;
@SerializedName("private")
@Expose
private Boolean _private;
@SerializedName("owner")
@Expose
private Owner owner;
@SerializedName("html_url")
@Expose
private String htmlUrl;
@SerializedName("description")
@Expose
private String description;
@SerializedName("fork")
@Expose
private Boolean fork;
@SerializedName("url")
@Expose
private String url;
@SerializedName("forks_url")
@Expose
private String forksUrl;
@SerializedName("keys_url")
@Expose
private String keysUrl;
@SerializedName("collaborators_url")
@Expose
private String collaboratorsUrl;
@SerializedName("teams_url")
@Expose
private String teamsUrl;
@SerializedName("hooks_url")
@Expose
private String hooksUrl;
@SerializedName("issue_events_url")
@Expose
private String issueEventsUrl;
@SerializedName("events_url")
@Expose
private String eventsUrl;
@SerializedName("assignees_url")
@Expose
private String assigneesUrl;
@SerializedName("branches_url")
@Expose
private String branchesUrl;
@SerializedName("tags_url")
@Expose
private String tagsUrl;
@SerializedName("blobs_url")
@Expose
private String blobsUrl;
@SerializedName("git_tags_url")
@Expose
private String gitTagsUrl;
@SerializedName("git_refs_url")
@Expose
private String gitRefsUrl;
@SerializedName("trees_url")
@Expose
private String treesUrl;
@SerializedName("statuses_url")
@Expose
private String statusesUrl;
@SerializedName("languages_url")
@Expose
private String languagesUrl;
@SerializedName("stargazers_url")
@Expose
private String stargazersUrl;
@SerializedName("contributors_url")
@Expose
private String contributorsUrl;
@SerializedName("subscribers_url")
@Expose
private String subscribersUrl;
@SerializedName("subscription_url")
@Expose
private String subscriptionUrl;
@SerializedName("commits_url")
@Expose
private String commitsUrl;
@SerializedName("git_commits_url")
@Expose
private String gitCommitsUrl;
@SerializedName("comments_url")
@Expose
private String commentsUrl;
@SerializedName("issue_comment_url")
@Expose
private String issueCommentUrl;
@SerializedName("contents_url")
@Expose
private String contentsUrl;
@SerializedName("compare_url")
@Expose
private String compareUrl;
@SerializedName("merges_url")
@Expose
private String mergesUrl;
@SerializedName("archive_url")
@Expose
private String archiveUrl;
@SerializedName("downloads_url")
@Expose
private String downloadsUrl;
@SerializedName("issues_url")
@Expose
private String issuesUrl;
@SerializedName("pulls_url")
@Expose
private String pullsUrl;
@SerializedName("milestones_url")
@Expose
private String milestonesUrl;
@SerializedName("notifications_url")
@Expose
private String notificationsUrl;
@SerializedName("labels_url")
@Expose
private String labelsUrl;
@SerializedName("releases_url")
@Expose
private String releasesUrl;
@SerializedName("deployments_url")
@Expose
private String deploymentsUrl;

/**
* No args constructor for use in serialization
* 
*/
public UserObject() {
}

/**
* 
* @param releasesUrl
* @param notificationsUrl
* @param eventsUrl
* @param teamsUrl
* @param contributorsUrl
* @param gitTagsUrl
* @param contentsUrl
* @param blobsUrl
* @param tagsUrl
* @param id
* @param issueEventsUrl
* @param htmlUrl
* @param nodeId
* @param _private
* @param commentsUrl
* @param description
* @param hooksUrl
* @param commitsUrl
* @param name
* @param treesUrl
* @param labelsUrl
* @param issuesUrl
* @param assigneesUrl
* @param mergesUrl
* @param subscriptionUrl
* @param fork
* @param compareUrl
* @param stargazersUrl
* @param gitRefsUrl
* @param deploymentsUrl
* @param archiveUrl
* @param url
* @param languagesUrl
* @param keysUrl
* @param collaboratorsUrl
* @param milestonesUrl
* @param gitCommitsUrl
* @param downloadsUrl
* @param pullsUrl
* @param issueCommentUrl
* @param subscribersUrl
* @param owner
* @param forksUrl
* @param branchesUrl
* @param fullName
* @param statusesUrl
*/
public UserObject(Integer id, String nodeId, String name, String fullName, Boolean _private, Owner owner, String htmlUrl, String description, Boolean fork, String url, String forksUrl, String keysUrl, String collaboratorsUrl, String teamsUrl, String hooksUrl, String issueEventsUrl, String eventsUrl, String assigneesUrl, String branchesUrl, String tagsUrl, String blobsUrl, String gitTagsUrl, String gitRefsUrl, String treesUrl, String statusesUrl, String languagesUrl, String stargazersUrl, String contributorsUrl, String subscribersUrl, String subscriptionUrl, String commitsUrl, String gitCommitsUrl, String commentsUrl, String issueCommentUrl, String contentsUrl, String compareUrl, String mergesUrl, String archiveUrl, String downloadsUrl, String issuesUrl, String pullsUrl, String milestonesUrl, String notificationsUrl, String labelsUrl, String releasesUrl, String deploymentsUrl) {
super();
this.id = id;
this.nodeId = nodeId;
this.name = name;
this.fullName = fullName;
this._private = _private;
this.owner = owner;
this.htmlUrl = htmlUrl;
this.description = description;
this.fork = fork;
this.url = url;
this.forksUrl = forksUrl;
this.keysUrl = keysUrl;
this.collaboratorsUrl = collaboratorsUrl;
this.teamsUrl = teamsUrl;
this.hooksUrl = hooksUrl;
this.issueEventsUrl = issueEventsUrl;
this.eventsUrl = eventsUrl;
this.assigneesUrl = assigneesUrl;
this.branchesUrl = branchesUrl;
this.tagsUrl = tagsUrl;
this.blobsUrl = blobsUrl;
this.gitTagsUrl = gitTagsUrl;
this.gitRefsUrl = gitRefsUrl;
this.treesUrl = treesUrl;
this.statusesUrl = statusesUrl;
this.languagesUrl = languagesUrl;
this.stargazersUrl = stargazersUrl;
this.contributorsUrl = contributorsUrl;
this.subscribersUrl = subscribersUrl;
this.subscriptionUrl = subscriptionUrl;
this.commitsUrl = commitsUrl;
this.gitCommitsUrl = gitCommitsUrl;
this.commentsUrl = commentsUrl;
this.issueCommentUrl = issueCommentUrl;
this.contentsUrl = contentsUrl;
this.compareUrl = compareUrl;
this.mergesUrl = mergesUrl;
this.archiveUrl = archiveUrl;
this.downloadsUrl = downloadsUrl;
this.issuesUrl = issuesUrl;
this.pullsUrl = pullsUrl;
this.milestonesUrl = milestonesUrl;
this.notificationsUrl = notificationsUrl;
this.labelsUrl = labelsUrl;
this.releasesUrl = releasesUrl;
this.deploymentsUrl = deploymentsUrl;
}

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getNodeId() {
return nodeId;
}

public void setNodeId(String nodeId) {
this.nodeId = nodeId;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getFullName() {
return fullName;
}

public void setFullName(String fullName) {
this.fullName = fullName;
}

public Boolean getPrivate() {
return _private;
}

public void setPrivate(Boolean _private) {
this._private = _private;
}

public Owner getOwner() {
return owner;
}

public void setOwner(Owner owner) {
this.owner = owner;
}

public String getHtmlUrl() {
return htmlUrl;
}

public void setHtmlUrl(String htmlUrl) {
this.htmlUrl = htmlUrl;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public Boolean getFork() {
return fork;
}

public void setFork(Boolean fork) {
this.fork = fork;
}

public String getUrl() {
return url;
}

public void setUrl(String url) {
this.url = url;
}

public String getForksUrl() {
return forksUrl;
}

public void setForksUrl(String forksUrl) {
this.forksUrl = forksUrl;
}

public String getKeysUrl() {
return keysUrl;
}

public void setKeysUrl(String keysUrl) {
this.keysUrl = keysUrl;
}

public String getCollaboratorsUrl() {
return collaboratorsUrl;
}

public void setCollaboratorsUrl(String collaboratorsUrl) {
this.collaboratorsUrl = collaboratorsUrl;
}

public String getTeamsUrl() {
return teamsUrl;
}

public void setTeamsUrl(String teamsUrl) {
this.teamsUrl = teamsUrl;
}

public String getHooksUrl() {
return hooksUrl;
}

public void setHooksUrl(String hooksUrl) {
this.hooksUrl = hooksUrl;
}

public String getIssueEventsUrl() {
return issueEventsUrl;
}

public void setIssueEventsUrl(String issueEventsUrl) {
this.issueEventsUrl = issueEventsUrl;
}

public String getEventsUrl() {
return eventsUrl;
}

public void setEventsUrl(String eventsUrl) {
this.eventsUrl = eventsUrl;
}

public String getAssigneesUrl() {
return assigneesUrl;
}

public void setAssigneesUrl(String assigneesUrl) {
this.assigneesUrl = assigneesUrl;
}

public String getBranchesUrl() {
return branchesUrl;
}

public void setBranchesUrl(String branchesUrl) {
this.branchesUrl = branchesUrl;
}

public String getTagsUrl() {
return tagsUrl;
}

public void setTagsUrl(String tagsUrl) {
this.tagsUrl = tagsUrl;
}

public String getBlobsUrl() {
return blobsUrl;
}

public void setBlobsUrl(String blobsUrl) {
this.blobsUrl = blobsUrl;
}

public String getGitTagsUrl() {
return gitTagsUrl;
}

public void setGitTagsUrl(String gitTagsUrl) {
this.gitTagsUrl = gitTagsUrl;
}

public String getGitRefsUrl() {
return gitRefsUrl;
}

public void setGitRefsUrl(String gitRefsUrl) {
this.gitRefsUrl = gitRefsUrl;
}

public String getTreesUrl() {
return treesUrl;
}

public void setTreesUrl(String treesUrl) {
this.treesUrl = treesUrl;
}

public String getStatusesUrl() {
return statusesUrl;
}

public void setStatusesUrl(String statusesUrl) {
this.statusesUrl = statusesUrl;
}

public String getLanguagesUrl() {
return languagesUrl;
}

public void setLanguagesUrl(String languagesUrl) {
this.languagesUrl = languagesUrl;
}

public String getStargazersUrl() {
return stargazersUrl;
}

public void setStargazersUrl(String stargazersUrl) {
this.stargazersUrl = stargazersUrl;
}

public String getContributorsUrl() {
return contributorsUrl;
}

public void setContributorsUrl(String contributorsUrl) {
this.contributorsUrl = contributorsUrl;
}

public String getSubscribersUrl() {
return subscribersUrl;
}

public void setSubscribersUrl(String subscribersUrl) {
this.subscribersUrl = subscribersUrl;
}

public String getSubscriptionUrl() {
return subscriptionUrl;
}

public void setSubscriptionUrl(String subscriptionUrl) {
this.subscriptionUrl = subscriptionUrl;
}

public String getCommitsUrl() {
return commitsUrl;
}

public void setCommitsUrl(String commitsUrl) {
this.commitsUrl = commitsUrl;
}

public String getGitCommitsUrl() {
return gitCommitsUrl;
}

public void setGitCommitsUrl(String gitCommitsUrl) {
this.gitCommitsUrl = gitCommitsUrl;
}

public String getCommentsUrl() {
return commentsUrl;
}

public void setCommentsUrl(String commentsUrl) {
this.commentsUrl = commentsUrl;
}

public String getIssueCommentUrl() {
return issueCommentUrl;
}

public void setIssueCommentUrl(String issueCommentUrl) {
this.issueCommentUrl = issueCommentUrl;
}

public String getContentsUrl() {
return contentsUrl;
}

public void setContentsUrl(String contentsUrl) {
this.contentsUrl = contentsUrl;
}

public String getCompareUrl() {
return compareUrl;
}

public void setCompareUrl(String compareUrl) {
this.compareUrl = compareUrl;
}

public String getMergesUrl() {
return mergesUrl;
}

public void setMergesUrl(String mergesUrl) {
this.mergesUrl = mergesUrl;
}

public String getArchiveUrl() {
return archiveUrl;
}

public void setArchiveUrl(String archiveUrl) {
this.archiveUrl = archiveUrl;
}

public String getDownloadsUrl() {
return downloadsUrl;
}

public void setDownloadsUrl(String downloadsUrl) {
this.downloadsUrl = downloadsUrl;
}

public String getIssuesUrl() {
return issuesUrl;
}

public void setIssuesUrl(String issuesUrl) {
this.issuesUrl = issuesUrl;
}

public String getPullsUrl() {
return pullsUrl;
}

public void setPullsUrl(String pullsUrl) {
this.pullsUrl = pullsUrl;
}

public String getMilestonesUrl() {
return milestonesUrl;
}

public void setMilestonesUrl(String milestonesUrl) {
this.milestonesUrl = milestonesUrl;
}

public String getNotificationsUrl() {
return notificationsUrl;
}

public void setNotificationsUrl(String notificationsUrl) {
this.notificationsUrl = notificationsUrl;
}

public String getLabelsUrl() {
return labelsUrl;
}

public void setLabelsUrl(String labelsUrl) {
this.labelsUrl = labelsUrl;
}

public String getReleasesUrl() {
return releasesUrl;
}

public void setReleasesUrl(String releasesUrl) {
this.releasesUrl = releasesUrl;
}

public String getDeploymentsUrl() {
return deploymentsUrl;
}

public void setDeploymentsUrl(String deploymentsUrl) {
this.deploymentsUrl = deploymentsUrl;
}

}
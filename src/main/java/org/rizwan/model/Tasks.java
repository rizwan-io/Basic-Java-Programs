package org.rizwan.model;

import org.rizwan.model.Bug;
import org.rizwan.model.Feature;

public class Tasks {
    private String title;
    private String creator;
    private String assignee;
    private String status;
    private String type;
    private Feature feature;
    private Bug bug;

    public Tasks(String title, String creator, String assignee, String status, String type, Bug bug) {
        this.title = title;
        this.creator = creator;
        this.assignee = assignee;
        this.status = status;
        this.type = type;
        this.bug = bug;
    }

    public Tasks(String title, String creator, String assignee, String status, String type, Feature feature) {
        this.title = title;
        this.creator = creator;
        this.assignee = assignee;
        this.status = status;
        this.type = type;
        this.feature = feature;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Feature getFeature() {
        return feature;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }

    public Bug getBug() {
        return bug;
    }

    public void setBug(Bug bug) {
        this.bug = bug;
    }

    @Override
    public String toString() {
        if (feature.equals(null))
            return "Tasks{" +
                    "title='" + title + '\'' +
                    ", creator='" + creator + '\'' +
                    ", assignee='" + assignee + '\'' +
                    ", status='" + status + '\'' +
                    ", type='" + type + '\'' +
                    ", feature=" + feature +
                    '}';
        else
            return "Tasks{" +
                    "title='" + title + '\'' +
                    ", creator='" + creator + '\'' +
                    ", assignee='" + assignee + '\'' +
                    ", status='" + status + '\'' +
                    ", type='" + type + '\'' +
                    ", bug=" + bug +
                    '}';
    }
}

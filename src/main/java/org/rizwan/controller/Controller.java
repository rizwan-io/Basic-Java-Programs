package org.rizwan.controller;

import org.rizwan.model.Bug;
import org.rizwan.model.Feature;
import org.rizwan.model.Tasks;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    List<Tasks> tasksList = new ArrayList<>();
    public void createTask(String title, String creator, String assignee, String status, String type, Bug bug) {
        tasksList.add(new Tasks(title, creator, assignee, status, type, bug));
    }

    public void createTask(String title, String creator, String assignee, String status, String type, Feature feature) {
        tasksList.add(new Tasks(title, creator, assignee, status, type, feature));
    }

    public void changeStatus(String title, String status) {
        for (Tasks task: tasksList) {
            if (task.getTitle().equals(title)) {
                if ( ((task.getStatus().equals("Open")) && status.equals("In progress"))
                    || ((task.getStatus().equals("In progress")) && status.equals("Completed"))
                ) task.setStatus(status);

            }
        }
    }

    public void changeAssignee(String title, String assignee) {
        for (Tasks task: tasksList) {
            if (task.getTitle().equals(title)) {
                task.setAssignee(assignee);
            }
        }
    }

    public void displayTasks(String assignee) {
        for (Tasks task: tasksList) {
            if (task.getAssignee().equals(assignee)) {
                System.out.println("\nTasks Type => " + task.getType());
                System.out.println("Title => " + task.getTitle());
            }
        }
    }
}

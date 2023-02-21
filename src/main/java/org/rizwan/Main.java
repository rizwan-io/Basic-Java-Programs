package org.rizwan;

import org.rizwan.controller.Controller;
import org.rizwan.model.Bug;
import org.rizwan.model.Feature;
import org.rizwan.model.Tasks;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.createTask("Create Dashboard", "Brad", "Peter",
                "Open", "Feature", new Feature("Create console for Debugging", "Low"));

        controller.createTask("Fix MySQL Issues", "Ryan",
                "Brad", "Open", "Bug", new Bug("PO"));


        controller.changeStatus("Fix MySQL Issues", "In progress");
        controller.changeAssignee("create Dashboard", "Brad");
        controller.displayTasks("Brad");


    }
}
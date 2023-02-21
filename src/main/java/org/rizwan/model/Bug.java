package org.rizwan.model;

public class Bug {
    private String severity;

    public Bug(String severity) {
        this.severity = severity;
    }

    @Override
    public String toString() {
        return "Bug{" +
                "severity='" + severity + '\'' +
                '}';
    }
}

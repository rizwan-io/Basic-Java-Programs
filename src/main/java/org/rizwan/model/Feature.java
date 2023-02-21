package org.rizwan.model;

public class Feature {
    private String featureSummary;
    private String impact;

    public Feature(String featureSummary, String impact) {
        this.featureSummary = featureSummary;
        this.impact = impact;
    }

    @Override
    public String toString() {
        return "Feature{" +
                "featureSummary='" + featureSummary + '\'' +
                ", impact='" + impact + '\'' +
                '}';
    }
}

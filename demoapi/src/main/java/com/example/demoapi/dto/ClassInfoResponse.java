package com.example.demoapi.dto;


import java.util.List;

public class ClassInfoResponse {

    private String className;
    private List<String> names;
    private int counts;

    public ClassInfoResponse(String className, List<String> names, int counts) {
        this.className = className;
        this.names = names;
        this.counts = counts;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public int getCounts() {
        return counts;
    }

    public void setCounts(int counts) {
        this.counts = counts;
    }
}

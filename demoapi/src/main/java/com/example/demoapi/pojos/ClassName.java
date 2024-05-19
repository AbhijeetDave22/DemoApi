
package com.example.demoapi.pojos;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class ClassName {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String classes;


    private String names;

    public ClassName() {}

    public ClassName(String classes, String names) {
        this.classes = classes;
        this.names = names;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "ClassName{" +
                "id=" + id +
                ", classes='" + classes + '\'' +
                ", names='" + names + '\'' +
                '}';
    }
}

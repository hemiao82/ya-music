package com.example.yamusic.entity;

import javax.persistence.Entity;

@Entity
public class Role extends AbstractEntity{
    private String name;
    private String title;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}

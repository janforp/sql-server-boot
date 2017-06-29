package com.janita.sqlserver.sqlserverboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Janita on 2017/6/29 0029-下午 5:42
 * 该类是：
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Column(name = "name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

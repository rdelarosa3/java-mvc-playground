<<<<<<< HEAD:src/main/java/com/codeup/adlister/models/Ad.java
package com.codeup.adlister.models;

import com.codeup.adlister.dao.DaoFactory;

public class Ad {
=======
import java.io.Serializable;

public class Ad implements Serializable {
>>>>>>> 8794b5c1b627246c855860953d5a3ddfed88707a:src/main/java/Ad.java
    private long id;
    private long userId;
    private String title;
    private String description;

    public Ad(){}
    
    public Ad(long id, long userId, String title, String description) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.description = description;
    }

    public Ad(long userId, String title, String description) {
        this.userId = userId;
        this.title = title;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor(){
        User user = (User) DaoFactory.getUsersDao().findByUserId(this.userId);
        return user.getUsername();
    }

    public User getUser(){
        User user = (User) DaoFactory.getUsersDao().findByUsername(getAuthor());
        return user;
    }
}

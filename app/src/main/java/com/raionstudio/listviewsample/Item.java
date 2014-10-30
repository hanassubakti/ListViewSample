package com.raionstudio.listviewsample;

/**
 * Created by hanas on 30/10/2014.
 */
public class Item {
    private String title;
    private String description;

    public Item(String title, String description) {
        super();
        this.title = title;
        this.description = description;
    }
    // getters and setters...
    public String getTile(){
        return title;
    }
    public void setTitle(String newTitle){
        this.title=newTitle;
    }
    public void setDescription(String newDescription){
        this.description=newDescription;
    }
    public String getDescription(){
        return description;
    }
}

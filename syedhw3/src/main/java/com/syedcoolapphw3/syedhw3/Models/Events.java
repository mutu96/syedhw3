package com.syedcoolapphw3.syedhw3.Models;

import javax.persistence.*;

@Entity
@Table(name = "Events")
public class Events
{
    //calling Events table columns and storing in objects
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "description")
    private String description;
    @Column(name = "startDate")
    private String startDate ;
    @Column(name = "endDate")
    private String endDate ;



    public Events()
    {

    }
    public Events(String description, String startDate, String endDate, String id) {

        this.id = id;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }


    //using get and set function for column information
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }



}
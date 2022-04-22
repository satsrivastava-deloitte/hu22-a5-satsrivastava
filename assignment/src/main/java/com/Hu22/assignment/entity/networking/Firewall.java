package com.Hu22.assignment.entity.networking;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Firewall {
    @Id
    private int fireid;
    private String name;
    private String filter;
    private String port;
    private String action;

    public Firewall(){}
    public Firewall(String name,String filter,String port,String action){
        this.name=name;
        this.filter=filter;
        this.port=port;
        this.action=action;
    }

    public int getFireid() {
        return fireid;
    }

    public void setFireid(int fireid) {
        this.fireid = fireid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}

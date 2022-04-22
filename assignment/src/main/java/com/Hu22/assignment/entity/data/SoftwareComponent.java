package com.Hu22.assignment.entity.data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SoftwareComponent {
    @Id
    private int compid;
    private String compname;
    private String version;

    public SoftwareComponent(){}
    public SoftwareComponent(String compname,String version){
        this.compname=compname;
        this.version=version;
    }

    public int getCompid() {
        return compid;
    }

    public void setCompid(int compid) {
        this.compid = compid;
    }

    public String getCompname() {
        return compname;
    }

    public void setCompname(String compname) {
        this.compname = compname;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}

package com.Hu22.assignment.entity.object;

import javax.persistence.*;

@Entity
//@Table
public class Object {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer objectid;
    private String name;
    private String region;

    private String type;
    private String encryption;
    private String storage;

    public Object(){}
    public Object(String name,String region, String type, String encryption,String storage){
        super();
        this.name=name;
        this.region=region;
        this.type=type;
        this.encryption=encryption;
        this.storage=storage;
    }

    public Integer getObjectid() {
        return objectid;
    }

    public void setObjectid(Integer objectid) {
        this.objectid = objectid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEncryption() {
        return encryption;
    }

    public void setEncryption(String encryption) {
        this.encryption = encryption;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }
}

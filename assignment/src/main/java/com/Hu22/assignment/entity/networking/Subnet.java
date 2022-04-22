package com.Hu22.assignment.entity.networking;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subnet {
    @Id
    private int subnetid;
    private String name;
    private String regions;
    private String ipaddress;
    private String types;

    public Subnet(){}
    public Subnet(String name,String region,String ipaddress,String type){
        this.name=name;
        this.regions=region;
        this.ipaddress=ipaddress;
        this.types=type;
    }

    public int getSubnetid() {
        return subnetid;
    }

    public void setSubnetid(int subnetid) {
        this.subnetid = subnetid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegions() {
        return regions;
    }

    public void setRegions(String region) {
        this.regions = region;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String type) {
        this.types = type;
    }
}

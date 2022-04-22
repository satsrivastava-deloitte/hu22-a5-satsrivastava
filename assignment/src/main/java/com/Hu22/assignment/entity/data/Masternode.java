package com.Hu22.assignment.entity.data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Masternode {
    @Id
    private int nodeid;
    private String family;
    private int cpu;
    private int memory;
    private String size;
    private String type;

    public Masternode(){}
    public Masternode(String family,int cpu,int memory,String size,String type){
        this.family=family;
        this.cpu=cpu;
        this.memory=memory;
        this.size=size;
        this.type=type;
    }

    public int getNodeid() {
        return nodeid;
    }

    public void setNodeid(int nodeid) {
        this.nodeid = nodeid;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

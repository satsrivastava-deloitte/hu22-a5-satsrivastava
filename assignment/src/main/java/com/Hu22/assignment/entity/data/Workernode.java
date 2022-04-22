package com.Hu22.assignment.entity.data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Workernode {
    @Id
    private int workid;
    private String family;
    private int nodes;
    private int cpus;
    private int memorys;
    private String size;
    private String type;
    public Workernode(){}
    public Workernode(String family,String size,int cpu,int memorys,String type,int nodes){
        this.family=family;
        this.cpus=cpu;
        this.memorys=memorys;
        this.type=type;
        this.nodes=nodes;
        this.size=size;
    }

    public int getWorkid() {
        return workid;
    }

    public void setWorkid(int workid) {
        this.workid = workid;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getNodes() {
        return nodes;
    }

    public void setNodes(int nodes) {
        this.nodes = nodes;
    }

    public int getCpus() {
        return cpus;
    }

    public void setCpus(int cpus) {
        this.cpus = cpus;
    }

    public int getMemorys() {
        return memorys;
    }

    public void setMemorys(int memorys) {
        this.memorys = memorys;
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

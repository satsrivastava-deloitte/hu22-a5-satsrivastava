package com.Hu22.assignment.entity.data;


import javax.persistence.*;

@Entity
//@Table
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer dataid;
    private String name;

    private String encryption;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="compid")
    private SoftwareComponent softwareComponent;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="nodeid")
    private Masternode masternode;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="workid")
    private Workernode workernode;

    public Data(){}
    public Data(String name,String encryption,SoftwareComponent softwareComponent,
                Masternode masternode, Workernode workernode){
        this.name=name;
        this.softwareComponent=softwareComponent;
        this.encryption=encryption;
        this.workernode=workernode;
        this.masternode=masternode;

    }


    public Integer getDataid() {
        return dataid;
    }

    public void setDataid(Integer dataid) {
        this.dataid = dataid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SoftwareComponent getSoftwareComponent() {
        return softwareComponent;
    }

    public void setSoftwareComponent(SoftwareComponent softwareComponent) {
        this.softwareComponent = softwareComponent;
    }

    public String getEncryption() {
        return encryption;
    }

    public void setEncryption(String encryption) {
        this.encryption = encryption;
    }

    public Masternode getMasternode() {
        return masternode;
    }

    public void setMasternode(Masternode masternode) {
        this.masternode = masternode;
    }

    public Workernode getWorkernode() {
        return workernode;
    }

    public void setWorkernode(Workernode workernode) {
        this.workernode = workernode;
    }
}
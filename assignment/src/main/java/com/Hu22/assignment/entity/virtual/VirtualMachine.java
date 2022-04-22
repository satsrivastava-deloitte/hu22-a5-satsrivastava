package com.Hu22.assignment.entity.virtual;

import javax.persistence.*;

@Entity
//@Table
public class VirtualMachine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer virtualid;
    private String name;
    private String region;
    private String machine;
    private Integer cpu;
    private Integer memory;

    private String traffic;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="bootdiskid")
    private BootDisk bootDisk;
    public VirtualMachine(){}
    public VirtualMachine(String name,String region,String machine,int cpu,int memory,String traffic, BootDisk bootDisk){
        super();
        this.cpu=cpu;
        this.name=name;
        this.machine=machine;
        this.region=region;
        this.traffic=traffic;
        this.memory=memory;
        this.bootDisk=bootDisk;
    }

    //Getter and Setter
    public Integer getVirtualid() {
        return virtualid;
    }

    public void setVirtualid(Integer id) {
        this.virtualid = id;
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

    public String getMachine() {
        return machine;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }

    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }


    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public BootDisk getBootDisk() {
        return bootDisk;
    }

    public void setBootDisk(BootDisk bootDisk) {
        this.bootDisk = bootDisk;
    }
}
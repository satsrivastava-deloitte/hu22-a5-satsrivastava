package com.Hu22.assignment.entity.virtual;

import javax.persistence.*;

@Entity
public class BootDisk {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bootdiskid;
    private String size;
    private String os;

    public BootDisk(){}
    public BootDisk(String size,String os){
        this.size=size;
        this.os=os;
    }

    public int getBootdiskid() {
        return bootdiskid;
    }

    public void setBootdiskid(int bootdiskid) {
        this.bootdiskid = bootdiskid;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}

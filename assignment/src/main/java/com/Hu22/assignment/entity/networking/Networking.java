package com.Hu22.assignment.entity.networking;

import javax.persistence.*;

@Entity
public class Networking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer netid;
    private String name;
    private String description;
//    private String type;
//    private String address;
//    private String region;
//    private String filter;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="subnetid")
    private Subnet subnet;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fireid")
    private Firewall firewall;


    public Networking(){}

    public Networking(String name,String description,Subnet subnet,Firewall firewall){
        this.name=name;
        this.description=description;
        this.subnet=subnet;
        this.firewall=firewall;
//        this.type=type;
//        this.address=address;
//        this.region=region;
//        this.filter=filter;
    }

    public Integer getNetid() {
        return netid;
    }

    public void setNetid(Integer netid) {
        this.netid = netid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Subnet getSubnet() {
        return subnet;
    }

    public void setSubnet(Subnet subnet) {
        this.subnet = subnet;
    }

    public Firewall getFirewall() {
        return firewall;
    }

    public void setFirewall(Firewall firewall) {
        this.firewall = firewall;
    }
}

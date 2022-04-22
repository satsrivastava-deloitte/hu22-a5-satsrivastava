package com.Hu22.assignment.service;

import com.Hu22.assignment.entity.virtual.VirtualMachine;
import com.Hu22.assignment.repository.VirtualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VirtualService {
    @Autowired
    private VirtualRepository virtualRepository;

    public VirtualMachine signingNewInfo(VirtualMachine newVirtualMachine){
        VirtualMachine authenticatedVirtualMachine=virtualRepository.findByNameAndRegion(newVirtualMachine.getName(), newVirtualMachine.getRegion());
        if(authenticatedVirtualMachine==null)
            return virtualRepository.save(newVirtualMachine);
        return new VirtualMachine();
    }

    public VirtualMachine updatedVirtualMachine(VirtualMachine updatedVirtualMachineInfo,Integer id){
        VirtualMachine getAuthenticatedVirtualMachine=virtualRepository.findById(id).get();
        if(getAuthenticatedVirtualMachine!=null){
            if(updatedVirtualMachineInfo.getName()!=null){//name
                getAuthenticatedVirtualMachine.setName(updatedVirtualMachineInfo.getName());
            }
            if(updatedVirtualMachineInfo.getRegion()!=null){//region
                getAuthenticatedVirtualMachine.setRegion(updatedVirtualMachineInfo.getRegion());
            }
            if(updatedVirtualMachineInfo.getMachine()!=null){//machine family
                getAuthenticatedVirtualMachine.setMachine(updatedVirtualMachineInfo.getMachine());
            }
            //if(updatedVirtualMachineInfo.getVirtualMachineId()!=null){//m
            //    getAuthenticatedVirtualMachine.setVirtualMachineId(updatedVirtualMachineInfo.getVirtualMachineId());
            //}
            if(updatedVirtualMachineInfo.getCpu()!=null){//cpu
                getAuthenticatedVirtualMachine.setCpu(updatedVirtualMachineInfo.getCpu());
            }
//            if(updatedVirtualMachineInfo.getSize()!=null){//size
//                getAuthenticatedVirtualMachine.setSize(updatedVirtualMachineInfo.getSize());
//            }
            if(updatedVirtualMachineInfo.getTraffic()!=null){//traffic
                getAuthenticatedVirtualMachine.setTraffic(updatedVirtualMachineInfo.getTraffic());
            }
            if(updatedVirtualMachineInfo.getMemory()!=null){//memory
                getAuthenticatedVirtualMachine.setMemory(updatedVirtualMachineInfo.getMemory());
            }
            return virtualRepository.save(getAuthenticatedVirtualMachine);//updated value
        }
        System.out.println("user not found means enter the wrong data or data might be missing");
        return new VirtualMachine();
    }
    public VirtualMachine getVirtualDetail(Integer id){
        return virtualRepository.findById(id).get();
    }

    public List<VirtualMachine> getAll(){return virtualRepository.findAll();}

    public void deleteById(Integer id){
        VirtualMachine response = virtualRepository.getById(id);
        if(response== null){
            return;
        }
        virtualRepository.deleteById(id);
    }

}

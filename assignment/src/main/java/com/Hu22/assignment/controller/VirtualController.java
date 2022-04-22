package com.Hu22.assignment.controller;

import com.Hu22.assignment.service.VirtualService;
import com.Hu22.assignment.entity.virtual.VirtualMachine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/virtual")
public class VirtualController {
    @Autowired
    private VirtualService virtualService;


    @PostMapping("/SignPage")//adding information
    public VirtualMachine addingVirtualMachine(@RequestBody VirtualMachine newVirtualMachine){
        return virtualService.signingNewInfo(newVirtualMachine);
    }

    @PutMapping("/updated/{id}")//updating the information
    public VirtualMachine updatingVirtualMachine(@PathVariable("id") Integer id, @RequestBody VirtualMachine updateInfo){
        return virtualService.updatedVirtualMachine(updateInfo,id);
    }

    @GetMapping("/detail/{id}")//getting details of particular
    public VirtualMachine getVirtualMachineDetail(@PathVariable("id") Integer id){
        return virtualService.getVirtualDetail(id);}

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        virtualService.deleteById(id);
    }

}

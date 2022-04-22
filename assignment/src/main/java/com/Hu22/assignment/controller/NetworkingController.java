package com.Hu22.assignment.controller;

import com.Hu22.assignment.entity.networking.Networking;
import com.Hu22.assignment.service.NetworkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/networking")
public class NetworkingController {
    @Autowired
    private NetworkingService networkingService;

    @PostMapping("/SignPage")
    public Networking addingNetworking(@RequestBody Networking newNetworking){
        return networkingService.signingNewInfo(newNetworking);}

    @PutMapping("/updated/{id}")
    public Networking updatingNetworking(@PathVariable("id") Integer id,@RequestBody Networking updateInfo){
        return networkingService.updatedNetworking(updateInfo,id);
    }

    @GetMapping("/detail/{id}")
    public Networking getNetworkingDetail(@PathVariable("id") Integer id){
        return networkingService.getNetworkingDetail(id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        networkingService.deleteById(id);
    }

}

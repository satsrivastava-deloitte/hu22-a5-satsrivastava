package com.Hu22.assignment.service;

import com.Hu22.assignment.entity.networking.Networking;

import com.Hu22.assignment.repository.NetworkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NetworkingService {
    @Autowired
    private NetworkingRepository networkingRepository;

    public Networking signingNewInfo(Networking newNetworking){
        Networking authenticatedNetworking=networkingRepository.findByNameAndDescription(newNetworking.getName(),newNetworking.getDescription());
        if(authenticatedNetworking==null)
            return networkingRepository.save(newNetworking);
        return new Networking();
    }
    public Networking updatedNetworking(Networking updatedNetworkingInfo,Integer id){
        Networking getAuthenticatedNetworking=networkingRepository.findById(id).get();
        if (getAuthenticatedNetworking!=null){
            if(getAuthenticatedNetworking.getName()!=null){
                getAuthenticatedNetworking.setName(updatedNetworkingInfo.getName());
            }

            return networkingRepository.save(getAuthenticatedNetworking);
        }
        System.out.println("user not present");
        return new Networking();
    }
    public Networking getNetworkingDetail(Integer id){
        return networkingRepository.findById(id).get();
    }
    public List<Networking> getAll(){
        return networkingRepository.findAll();
    }

    public void deleteById(Integer id){
        Networking response=networkingRepository.getById(id);
        if(response==null){
            return;
        }
        networkingRepository.deleteById(id);
    }
}

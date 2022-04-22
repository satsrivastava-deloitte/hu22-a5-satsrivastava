package com.Hu22.assignment.service;


import com.Hu22.assignment.entity.object.Object;
import com.Hu22.assignment.repository.ObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObjectService {
    @Autowired
    private ObjectRepository objectRepository;

    public Object signingNewInfo(Object newObject){
        Object authenticatedObject=objectRepository.findByNameAndRegion(newObject.getName(), newObject.getRegion());
        if(authenticatedObject==null)
            return objectRepository.save(newObject);
        return new Object();
    }

    public Object updatedObject(Object updatedObjectInfo,Integer id){
        Object getAuthenticatedObject=objectRepository.findById(id).get();
        if(getAuthenticatedObject!=null){
            if(updatedObjectInfo.getName()!=null){
                getAuthenticatedObject.setName(updatedObjectInfo.getName());
            }
            if(updatedObjectInfo.getRegion()!=null){
                getAuthenticatedObject.setRegion(updatedObjectInfo.getRegion());
            }
            if(updatedObjectInfo.getEncryption()!=null){
                getAuthenticatedObject.setEncryption(updatedObjectInfo.getEncryption());
            }
            if(updatedObjectInfo.getStorage()!=null){
                getAuthenticatedObject.setStorage(updatedObjectInfo.getStorage());
            }
            if(updatedObjectInfo.getType()!=null){
                getAuthenticatedObject.setType(updatedObjectInfo.getType());
            }

            return objectRepository.save(getAuthenticatedObject);
        }
        System.out.println("User not found with given data");
        return new Object();
    }
    public Object getObjectDetail(Integer id){
        return objectRepository.findById(id).get();}

    public List<Object> getAll(){
        return objectRepository.findAll();
    }

    public void deleteById(Integer id){
        Object response=objectRepository.getById(id);
        if(response==null){
            return;
        }
        objectRepository.deleteById(id);
    }
}

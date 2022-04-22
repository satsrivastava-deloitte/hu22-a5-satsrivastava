package com.Hu22.assignment.service;

import com.Hu22.assignment.entity.data.Data;
import com.Hu22.assignment.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {
    @Autowired
    private DataRepository dataRepository;

    public Data signingNewInfo(Data newData){
        Data authenticatedData=dataRepository.findByNameAndEncryption(newData.getName(), newData.getEncryption());
        //Data authenticatedData=dataRepository.findByNameAndRegion(newData.getName(), newData.getRegion());
        if(authenticatedData==null)
            return dataRepository.save(newData);
        return new Data();
    }


    public Data updatedData(Data updatedDataInfo,Integer id){
        Data getAuthenticatedData=dataRepository.findById(id).get();
        if(getAuthenticatedData!=null){
            if(updatedDataInfo.getName()!=null){
                getAuthenticatedData.setName(updatedDataInfo.getName());
            }
            if(getAuthenticatedData.getEncryption()!=null){
                getAuthenticatedData.setEncryption(updatedDataInfo.getEncryption());
            }

            return dataRepository.save(getAuthenticatedData);
        }
        System.out.println("User not found with given data");
        return new Data();
    }
    public Data getDataDetail(Integer id){
        return dataRepository.findById(id).get();}

    public List<Data> getAll(){
        return dataRepository.findAll();
    }

    public void deleteById(Integer id){
        Data response=dataRepository.getById(id);
        if(response==null){
            return;
        }
        dataRepository.deleteById(id);
    }
}

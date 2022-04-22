package com.Hu22.assignment.controller;

import com.Hu22.assignment.service.DataService;
import com.Hu22.assignment.entity.data.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/datacontroller")
public class DataController {
    @Autowired
    private DataService dataService;

    @PostMapping("/SignPage")
    public Data addingData(@RequestBody Data newData){
        return dataService.signingNewInfo(newData);
    }

    @PutMapping("/updated/{id}")
    public Data updatingData(@PathVariable("id") Integer id, @RequestBody Data updateInfo){
        return dataService.updatedData(updateInfo,id);
    }

    @GetMapping("/detail/{id}")
    public Data getDataDetail(@PathVariable("id") Integer id){
        return dataService.getDataDetail(id);}

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        dataService.deleteById(id);
    }

}

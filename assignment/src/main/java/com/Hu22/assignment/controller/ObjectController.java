package com.Hu22.assignment.controller;

import com.Hu22.assignment.service.ObjectService;
import com.Hu22.assignment.entity.object.Object;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/object")
public class ObjectController {
    @Autowired
    private ObjectService objectService;
    @PostMapping("/SignPage")
    public Object addingObject(@RequestBody Object newObject){
        return objectService.signingNewInfo(newObject);
    }
    @PutMapping("/updated/{id}")
    public Object updatingObject(@PathVariable("id") Integer id, @RequestBody Object updateInfo){
        return objectService.updatedObject(updateInfo,id);
    }

    @GetMapping("/detail/{id}")
    public Object getObjectDetail(@PathVariable("id") Integer id){
        return objectService.getObjectDetail(id);}

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        objectService.deleteById(id);
    }
}

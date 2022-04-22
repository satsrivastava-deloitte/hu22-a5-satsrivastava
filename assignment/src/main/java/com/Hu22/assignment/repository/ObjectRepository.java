package com.Hu22.assignment.repository;

import com.Hu22.assignment.entity.object.Object;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjectRepository extends JpaRepository<Object,Integer> {
    Object findByNameAndRegion(String Name,String Region);
}
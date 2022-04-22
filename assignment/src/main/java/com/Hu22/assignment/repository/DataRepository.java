package com.Hu22.assignment.repository;

import com.Hu22.assignment.entity.data.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DataRepository extends JpaRepository<Data,Integer> {
    Data findByNameAndEncryption(String Name,String Encryption);
}
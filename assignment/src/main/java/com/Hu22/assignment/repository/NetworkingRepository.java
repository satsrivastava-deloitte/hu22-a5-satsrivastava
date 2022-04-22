package com.Hu22.assignment.repository;


import com.Hu22.assignment.entity.networking.Networking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkingRepository extends JpaRepository<Networking,Integer> {
    Networking findByNameAndDescription(String Name,String Description);
}

package com.Hu22.assignment.repository;

import com.Hu22.assignment.entity.virtual.VirtualMachine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualRepository extends JpaRepository<VirtualMachine,Integer> {
    VirtualMachine findByNameAndRegion(String Name,String Region);
}

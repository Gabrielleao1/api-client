package com.webcrud.apiclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcrud.apiclient.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}

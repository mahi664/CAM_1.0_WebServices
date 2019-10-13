package com.CAM.webservices.camwebservices;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloWorldJPARepository extends JpaRepository<Persons, Long> {

}

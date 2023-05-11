package main.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.client;
@Transactional
@Repository
public interface clientRepository extends JpaRepository<client,Integer>{
	
}

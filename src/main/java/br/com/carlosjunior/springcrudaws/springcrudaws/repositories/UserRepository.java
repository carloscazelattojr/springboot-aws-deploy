package br.com.carlosjunior.springcrudaws.springcrudaws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.carlosjunior.springcrudaws.springcrudaws.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

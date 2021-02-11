package com.harsha.exp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harsha.exp.entity.ExpEntity;

@Repository
public interface ExpDao extends JpaRepository<ExpEntity, Long> {

}

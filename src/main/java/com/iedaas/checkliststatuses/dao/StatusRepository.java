package com.iedaas.checkliststatuses.dao;

import com.iedaas.checkliststatuses.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Integer> {
}

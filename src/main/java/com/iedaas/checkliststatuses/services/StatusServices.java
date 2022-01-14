package com.iedaas.checkliststatuses.services;

import com.iedaas.checkliststatuses.dao.StatusRepository;
import com.iedaas.checkliststatuses.entity.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StatusServices {

    @Autowired
    StatusRepository statusRepository;

    public List<Status> getStatuses(){
        return statusRepository.findAll();
    }

    public Status addStatus(Status status){
        return statusRepository.save(status);
    }
}

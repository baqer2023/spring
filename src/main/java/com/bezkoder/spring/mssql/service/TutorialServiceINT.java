package com.bezkoder.spring.mssql.service;


import com.bezkoder.spring.mssql.model.Tutorial;
import org.springframework.stereotype.Service;

@Service
public interface TutorialServiceINT {





    boolean save(Tutorial example);

    Iterable<Tutorial> FindAll();


}

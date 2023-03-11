package com.bezkoder.spring.mssql.service;

import com.bezkoder.spring.mssql.model.Tutorial;
import com.bezkoder.spring.mssql.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TutorialService  implements TutorialServiceINT{
    @Autowired
    TutorialRepository tutorialrepository;


    @Override
    public boolean save(Tutorial example) {

        if (example!=null){
            tutorialrepository.save(example);
            return true;
        }
        else {
            return false;
        }

    }

    @Override
    public Iterable<Tutorial> FindAll() {

        try{
            List<Tutorial> tutorials = new ArrayList<>();
            tutorialrepository.findAll().forEach(e -> tutorials.add(e));
            return tutorials;
        }
        catch (Exception e){return null;}

    }



}

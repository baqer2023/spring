package com.bezkoder.spring.mssql.model;

import java.util.List;

public class myClass extends absClass implements IClass {
    @Override
    public boolean Save() {
        return false;
    }

    @Override
    public void Edit() {
        super.Edit();
    }
}

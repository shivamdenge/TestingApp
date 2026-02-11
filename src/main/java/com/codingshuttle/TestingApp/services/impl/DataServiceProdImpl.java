package com.codingshuttle.TestingApp.services.impl;

import com.codingshuttle.TestingApp.services.DataService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
//@Profile("prod")
public class DataServiceProdImpl implements DataService {


    @Override
    public String getData() {
        return "Prod Data";
    }
}

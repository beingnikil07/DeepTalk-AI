package com.ai.deeptalk.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class QnaService {

    //Access the APIKEY and API URL
    @Value("${deeptalk.api.url}")
    private String ApiUrl;
    @Value("{$deeptalk.api.key}")
    private String ApiKey;


    public String getAnswer(String question) {
        return "";
    }



}

package com.projeto.ci.services;

import org.springframework.stereotype.Service;

@Service
public class CiService {
    public Integer somar(Integer a, Integer b){
        return a + b;
    }
}

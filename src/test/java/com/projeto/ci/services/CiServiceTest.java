package com.projeto.ci.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class CiServiceTest {
    CiService service = new CiService();
    @Test
    void somar() {
        Integer valor1 = 1;
        Integer valor2 = 1;

        Integer resultado = service.somar(valor1, valor2);

        Assertions.assertEquals(3,resultado);
    }
}
package com.baothy.spring.ioc.v4di.setter;

import org.springframework.stereotype.Component;

@Component
public class PdfGenerator {
    public void generateFile(String fileName) {
        //TODO: logic xử lí ra file pdf

        System.out.println("V3 DI IOC (SETTER) - The pdf file " + fileName + ".pdf has been generated successfully!");
    }
}

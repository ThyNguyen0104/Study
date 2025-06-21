package com.baothy.spring.ioc.v4di.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("Babartos")
public class ContractService {
    private PdfGenerator pdfGenerator; // k new chờ chích vào

    //k làm constructor thì sẽ có rỗng/ empty tự động

    //hàm set() giống setYob()
    //@Autowired
    public void setPdfGenerator(PdfGenerator pdfGenerator) {
        this.pdfGenerator = pdfGenerator;
    }
    //null problem may be
    public void processContract(){
        //TODO logic xử lí contract
        pdfGenerator.generateFile("21:24");//có nguy cơ null do chưa set
    }
}

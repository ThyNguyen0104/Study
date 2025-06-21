package com.baothy.spring.ioc.v4di.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainV4 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ContractService service = context.getBean(ContractService.class);
        service.processContract();
    }
}

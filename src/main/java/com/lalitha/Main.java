package com.lalitha;

import com.lalitha.config.ComponentScanConfig;
import com.lalitha.data.StudentDao;
import com.lalitha.util.ScannerInputService;
import com.lalitha.util.UserInputService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        StudentDao studentDao = context.getBean(StudentDao.class);
        UserInputService userInputService=context.getBean(ScannerInputService.class);
    }
}
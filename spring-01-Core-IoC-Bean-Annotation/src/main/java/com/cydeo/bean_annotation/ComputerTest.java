package com.cydeo.bean_annotation;

import com.cydeo.bean_annotation.casefactory.Case;
import com.cydeo.bean_annotation.config.ComputerConfig;
import com.cydeo.bean_annotation.config.RandomConfig;
import com.cydeo.bean_annotation.monitorfactory.AcerMonitor;
import com.cydeo.bean_annotation.monitorfactory.SonyMonitor;
import com.cydeo.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ComputerConfig.class, RandomConfig.class);


        //Creating container by using BeanFactory
        BeanFactory context = new AnnotationConfigApplicationContext();

        // Monitor theMonitor = container.getBean(Monitor.class);
        SonyMonitor theSonyMonitor = container.getBean(SonyMonitor.class);
        Case theCase = container.getBean(Case.class);
        Motherboard theMotherBoard = container.getBean(Motherboard.class);



        PC myPC = new PC(theCase,theSonyMonitor,theMotherBoard);
        myPC.powerUp();





    }
}

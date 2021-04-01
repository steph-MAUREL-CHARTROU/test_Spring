package fr.diginamic.spring.jpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);

        MainBean mainBean = applicationContext.getBean(MainBean.class);
        mainBean.start();
    }
}

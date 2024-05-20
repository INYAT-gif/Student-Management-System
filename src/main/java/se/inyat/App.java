package se.inyat;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.inyat.config.ComponentScanConfig;
import se.inyat.data_access.StudentDao;

@SpringBootApplication
public class App {
    public static void main( String[] args ) {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
    StudentDao studentDao = context.getBean(StudentDao.class);
    }
}

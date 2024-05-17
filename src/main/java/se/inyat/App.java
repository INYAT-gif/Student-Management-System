package se.inyat;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import se.inyat.config.ComponentScanConfig;
import se.inyat.data_access.StudentDao;
import se.inyat.service.StudentManagement;
import se.inyat.util.UserInputService;
import sun.security.provider.ConfigFile;

public class App {
    public static void main( String[] args ) {

      //  AnnortationConfigApplicationContext context = new AnnortationConfigApplicationContext(ComponentScanConfig.class);
       // StudentManagement studentManagement = context.getBean(StudentManagement.class);

    //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
    //StudentDao studentDao = context.getBean(StudentDao.class);
   // AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);
     //   UserInputService userInputService = context.getBean(UserInputService.class);
    }

}

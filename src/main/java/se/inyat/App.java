package se.inyat;

public class App 
{
    public static void main( String[] args ) {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
    StudentDao studentDao = context.getBean(StudentDao.class);
    }
}

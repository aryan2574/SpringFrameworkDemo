package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        Creation of context to use Spring dependency injection from xml
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context1 = new AnnotationConfigApplicationContext(BeanConfig.class);

        Doctor doctor = context.getBean(Doctor.class);

//        Other ways to call Nurse object
        Nurse nurse = (Nurse) context.getBean("nurse");

        Staff staff = context.getBean(Doctor.class);

        doctor.assist();
        nurse.assist();
        // Implemented using Interface
        staff.assist();

//        Usage of constructor to input values in properties
//        Usage of setter function to get the qualification
        Doctor doctor1 = context.getBean(Doctor.class);
        doctor1.assist();
        System.out.println(doctor1.getQualification());

//        Pharmacist using Annotation
        Pharmacist pharmacist = context.getBean(Pharmacist.class);
        pharmacist.assist();

//        Using Java Configuration
//        To use Java configuration with a class - either add @Component at top of it or add @Bean
        Nurse nurse1 = context1.getBean(Nurse.class);
        nurse1.assist();

        Medic medic = context1.getBean(Medic.class);
        medic.assist();
        medic.setQualification("Medicine");
        System.out.println(medic);

        Medic medic2 = context1.getBean(Medic.class);
        medic2.setQualification("Surgery");
        System.out.println(medic2);
        System.out.println(medic);  // It will give same output as Medic 2 because singleton scope
    }
}

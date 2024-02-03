package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Creation of context to use Spring dependency injection from xml
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Doctor doctor = context.getBean(Doctor.class);

        // Other ways to call Nurse object
        Nurse nurse = (Nurse) context.getBean("nurse");

        Staff staff = context.getBean(Doctor.class);

        doctor.assist();
        nurse.assist();
        // Implemented using Interface
        staff.assist();

        // Usage of constructor to input values in properties
        // Usage of setter function to get the qualification
        Doctor doctor1 = context.getBean(Doctor.class);
        doctor1.assist();
        System.out.println(doctor1.getQualification());

        // Pharmacist using Annotation
        Pharmacist pharmacist = context.getBean(Pharmacist.class);
        pharmacist.assist();

    }
}

package demo;

import org.springframework.stereotype.Component;

//Add @Component to use the class as Spring component and add to XML file
@Component
public class Pharmacist implements Staff {
    public void assist() {
        System.out.println("Pharmacist is assisting");
    }
}

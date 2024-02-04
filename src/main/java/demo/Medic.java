package demo;

//import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
//@Scope(scopeName = "prototype")  -- This will set the scope to prototype and will create new object everytime
public class Medic implements Staff, BeanNameAware {
    private String qualification;

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void assist(){
        System.out.println("Medic is assisting");
    }

    @Override
    public String toString() {
        return "Medic Qualification : " + qualification;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Set bean name method is called from Medic - due to aware interface");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Post Construct Method is called from Medic - due to post construct method");
    }
}

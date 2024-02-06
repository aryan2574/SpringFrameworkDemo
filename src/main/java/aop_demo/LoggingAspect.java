package aop_demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // Before - beforeLogger will be called before execution of Shopping Card methods
    // (..) - It will take the function with any number of arguments
    @Before("execution(* aop_demo.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint jp) {
        // System.out.println(jp.getSignature());
        String arg = jp.getArgs()[0].toString();
        System.out.println("Before Loggers with Argument: " + arg);
    }

    @After("execution(* *.*.checkout(..))")
    public void afterLogger() {
        System.out.println("After Logger");
    }

    @Pointcut("execution(* aop_demo.ShoppingCart.quantity(..))")
    public void afterReturningPointCut() {}

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal) {
        System.out.println("After Returning : " + retVal);
    }
}

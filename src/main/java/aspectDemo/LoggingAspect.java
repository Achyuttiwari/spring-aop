package aspectDemo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect{
    @Before("execution(* aspectDemo.ShoppingCart.checkout(..))")   //first * for >> (return or void)
          /*IF checkout method have any parameter passed then put dot to print if dot not there
             than beforeLogging  not print
             */
    public void beforeLogging(JoinPoint jp){
        System.out.println(jp.getSignature());        //It gives the signature like in Before annotation >> (void aspectDemo.ShoppingCart.checkout(String))
        String args = jp.getArgs()[0].toString();
        System.out.println("Before Logger with arguments: " + args); //args gives Cancelled as output
        System.out.println("Before Logging");
    }
    @After("execution(* *.*.checkout(..))")   //first * for type>> (return or void) ,2nd for package ,3rd for class
    public void afterLogging(){
        System.out.println("After Logging");
    }
    @Pointcut("execution(* aspectDemo.ShoppingCart.quantity(..))")
    public void afterReturningPointCut(){

    }
    @AfterReturning(pointcut = "afterReturningPointCut()",returning = "returnValue")
    public void afterReturning(String returnValue){
        System.out.println("After Returning: " + returnValue);

    }


}

package aspectDemo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {
    @Pointcut("within(aspectDemo..*)")
    public void authenticationPointCut(){

    }
    @Pointcut("within(aspectDemo..*)")
    public void authorizationPointCut(){

    }
    public void authenticate(){
        System.out.println("Authenticating the Request");
    }

}

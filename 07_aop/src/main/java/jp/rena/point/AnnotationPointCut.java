package jp.rena.point;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnnotationPointCut {

    @Before("execution(* jp.rena.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("===annotation before===");
    }

    @After("execution(* jp.rena.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("===annotation after===");
    }

    /**
     * around before -> before -> after -> around after
     * 
     * @param pjp
     * @throws Throwable
     */
    @Around("execution(* jp.rena.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("===annotation around before===");
        Signature signature = pjp.getSignature();
        System.out.println("signature:" + signature);
        pjp.proceed();
        System.out.println("===annotation around after===");
    }

}

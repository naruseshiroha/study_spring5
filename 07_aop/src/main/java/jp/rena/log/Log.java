package jp.rena.log;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

@Component
public class Log implements MethodBeforeAdvice {

    @Override
    /**
     * method: 要执行的目标对象的方法
     * args: 参数
     * target: 目标对象 
     */
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "的" + method.getName() + "方法被调用了.");
    }

}

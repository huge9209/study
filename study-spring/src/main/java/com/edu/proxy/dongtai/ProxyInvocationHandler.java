package com.edu.proxy.dongtai;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: study-spring
 * @description: 自动生成代理类
 * @author: lihangyu
 * @create: 2020-12-21 10:11
 */
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private  Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //生成得到代理类
    public Object getProxy(){
       return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    //处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        //动态代理的本质，就是使用反射机制实现
        Object result = method.invoke(target ,args);
        return result;
    }

    public void log(String name){
        System.out.println("执行了"+name+"方法");
    }
}

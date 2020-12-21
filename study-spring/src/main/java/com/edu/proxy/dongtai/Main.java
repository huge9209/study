package com.edu.proxy.dongtai;

/**
 * @program: study-spring
 * @description:
 * @author: lihangyu
 * @create: 2020-12-21 10:19
 */
public class Main {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();

        //代理角色
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setTarget(userService);

        //动态生成代理类
        UserServce proxy = (UserServce) proxyInvocationHandler.getProxy();

        proxy.add();
    }
}

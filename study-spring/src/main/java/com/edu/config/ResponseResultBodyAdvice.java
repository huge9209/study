package com.edu.config;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @program: study-spring
 * @description:
 * @author: lihangyu
 * @create: 2020-11-20 19:33
 */
@RestControllerAdvice
public class ResponseResultBodyAdvice implements ResponseBodyAdvice {
    public boolean supports(MethodParameter returnType, Class converterType) {
        return false;
    }

    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        return null;
    }
}

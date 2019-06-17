package com.laid.controller.advice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author laid
 * @title: exceptionAdvice
 * @projectName test
 * @description: TODO
 * @date 2019/6/1620:41
 */
@ControllerAdvice
public class ExceptionAdvice {

  @ExceptionHandler(value = {Exception.class})
  public void globalExceptionHandler(Exception e, HttpServletRequest request, HttpServletResponse response){
    System.out.println(e.getMessage());
    System.out.println(request.getParameter("flag"));
    Enumeration<String> headerNames=request.getHeaderNames();
    while(headerNames.hasMoreElements()){
      String headName=headerNames.nextElement();
      System.out.println(headName+"="+request.getHeader(headName));
    }
      response.setContentType("application/json;charset=utf-8");
    try {
      PrintWriter out= response.getWriter();
      out.write("exception!!!!");
    } catch (IOException e1) {
      e1.printStackTrace();
    }
  }
}

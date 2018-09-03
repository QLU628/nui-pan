package com.qul628.niupan.base.dto;

import com.qul628.niupan.base.constant.HttpResponseStatus;

import lombok.Data;

import java.io.Serializable;

/**
 * @author huahua
 * @date create at 下午10:56 2018/9/1
 */
@Data
public class HttpWrapper<T> implements Serializable {

  private T data;

  private Integer status;

  private String message;


  public HttpWrapper(T data) {
    this(data,HttpResponseStatus.SUCCESS,"");
  }

  public HttpWrapper(HttpResponseStatus status){
    this(status,status.getDefaultMassage());
  }

  public HttpWrapper(HttpResponseStatus status,String message){
    this(null,status,message);
  }

  public HttpWrapper(T data,HttpResponseStatus status,String message) {
    this.data = data;
    this.status = status.getCode();
    this.message = message;
  }
}

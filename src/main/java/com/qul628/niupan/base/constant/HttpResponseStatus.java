package com.qul628.niupan.base.constant;

import lombok.Getter;

/**
 * @author huahua
 * @date create at 下午10:57 2018/9/1
 */
@Getter
public enum HttpResponseStatus {
  SUCCESS(1,""),
  NEED_LOGIN(2,"用户未登录"),
  INVALID_PARAM(4,"参数错误"),
  INNER_ERROE(5,"服务器正忙"),;

  private final Integer code;
  private final String defaultMassage;

  HttpResponseStatus(Integer code, String defaultMassage) {
    this.code = code;
    this.defaultMassage = defaultMassage;
  }
}

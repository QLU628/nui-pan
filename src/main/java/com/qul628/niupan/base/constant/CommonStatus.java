package com.qul628.niupan.base.constant;

import lombok.Getter;

/**
 * @author huahua
 * @date create at 下午3:47 2018/9/1
 */
@Getter
public enum CommonStatus {
  /**
   * 未知
   */
  UNKNOWN(-2),

  /**
   * 删除
   */
  DELETED(-1),

  /**
   * 未激活
   */
  UNACTIVATED(0),

  /**
   * 激活
   */
  ACTIVATED(1),
  ;


  private final Integer Code;

  CommonStatus(Integer code) {
    Code = code;
  }

  public static CommonStatus of(Integer code){
    for (CommonStatus status : CommonStatus.values()){
      if (status.getCode().equals(code)){
        return status;
      }
    }
    return UNKNOWN;
  }
}

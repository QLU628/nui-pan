package com.qul628.niupan.base.constant.file;

import lombok.Getter;

/**
 * @author huahua
 * @date create at 上午10:12 2018/9/8
 * description: 文件的路径种类
 */
@Getter
public enum UrlDomainType {

  /**
   * 未知文件
   */
  UNKNOWN(-1),

  /**
   * 本地文件
   */
  LOCAL(0),

  /**
   * 七牛络文件
   */
  QINIU(2),

  /**
   * 阿里云
   */
  ALIYUN(3),

  /**
   * 网易云
   */
  TENCENT(4),

  /**
   * 网易
   */
  WANGYI(5),
  ;

  private Integer code;

  UrlDomainType(Integer code) {
    this.code = code;
  }
}

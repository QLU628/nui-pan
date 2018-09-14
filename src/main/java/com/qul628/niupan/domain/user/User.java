package com.qul628.niupan.domain.user;

import com.qul628.niupan.base.constant.CommonStatus;

import lombok.Getter;

import java.util.Date;

/**
 * @author huahua
 * @date create at 下午2:51 2018/9/1
 */
@Getter
public class User {

  private Long id;

  private String userName;

  private String mail;

  private CommonStatus status;

  private Date registAt;

  public Boolean accessiable() {
    return status == CommonStatus.UNACTIVATED || status == CommonStatus.ACTIVATED;
  }

  public Boolean isActivated() {
    return status == CommonStatus.ACTIVATED;
  }


  public User(Long id, String userName, String mail, Integer status, Date createAt) {
    CommonStatus ofStatus = CommonStatus.of(status);
    this.status = ofStatus;
    this.id = id;
    this.userName = userName;
    this.mail = mail;
    this.registAt = createAt;
  }
}

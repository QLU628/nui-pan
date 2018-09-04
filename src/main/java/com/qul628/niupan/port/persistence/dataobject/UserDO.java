package com.qul628.niupan.port.persistence.dataobject;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;

/**
 * @author huahua
 * @date create at 下午3:08 2018/9/1
 */
@Data
@Entity
@Table(name = "user")
public class UserDO {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "username",unique = true)
  private String userName;

  @Column(name = "password")
  private String password;

  private String mail;

  @Column(columnDefinition = "TINYINT DEFAULT 1")
  private Integer status;

  @Column(name = "gmt_create",columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
  private Date createAt;

  @Column(name = "gmt_update",columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
  private Date updateAt;

}

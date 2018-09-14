package com.qul628.niupan.domain.user.cmd;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author huahua
 * @date create at 下午4:27 2018/9/1
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginCmd implements Serializable {

  private static final long serialVersionUID = 2571617759376822316L;

  private String userName;

  private String password;
}

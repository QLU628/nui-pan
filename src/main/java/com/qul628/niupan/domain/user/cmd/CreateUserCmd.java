package com.qul628.niupan.domain.user.cmd;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author huahua
 * @date create at 下午3:46 2018/9/1
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserCmd implements Serializable {

  private static final long serialVersionUID = -6306935286035062019L;

  private String userName;

  private String password;

  private String mail;
}

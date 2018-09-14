package com.qul628.niupan.domain.user.repository.assembler;

import com.qul628.niupan.domain.user.User;
import com.qul628.niupan.domain.user.cmd.CreateUserCmd;
import com.qul628.niupan.port.persistence.dataobject.UserDO;

/**
 * @author huahua
 * @date create at 下午3:33 2018/9/1
 */
public class UserAssembler {

  public static User toUser(UserDO userDO) {
    if (userDO == null) {
      return null;
    }
    return new User(userDO.getId(), userDO.getUserName(), userDO.getMail(), userDO.getStatus(),
        userDO.getCreateAt());
  }

  public static UserDO build4CreateCmd(CreateUserCmd cmd) {
    UserDO userDO = new UserDO();
    userDO.setUserName(cmd.getUserName());
    userDO.setPassword(cmd.getPassword());
    userDO.setMail(cmd.getMail());
    //默认已经激活
    return userDO;
  }
}

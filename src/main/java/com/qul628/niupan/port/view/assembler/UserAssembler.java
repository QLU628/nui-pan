package com.qul628.niupan.port.view.assembler;

import com.qul628.niupan.domain.user.User;
import com.qul628.niupan.port.view.vo.UserVO;

/**
 * @author huahua
 * @date create at 下午11:12 2018/9/1
 */
public class UserAssembler {

  public static UserVO toUserVO(User user){
    if (user == null){
      return null;
    }

    return UserVO.builder()
        .id(user.getId())
        .email(user.getMail())
        .name(user.getUserName()).build();
  }
}

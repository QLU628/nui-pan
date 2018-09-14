package com.qul628.niupan.domain.user.repository;

import com.qul628.niupan.domain.user.User;
import com.qul628.niupan.domain.user.cmd.CreateUserCmd;
import com.qul628.niupan.domain.user.repository.assembler.UserAssembler;
import com.qul628.niupan.port.persistence.dao.UserDAO;
import com.qul628.niupan.port.persistence.dataobject.UserDO;

import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * @author huahua
 * @date create at 下午3:21 2018/9/1
 */
@Repository
public class UserRepository {

  @Resource
  private UserDAO userDAO;

  public User findById(Long id) {
    return UserAssembler.toUser(userDAO.findById(id).orElse(null));
  }

  public User createUser(CreateUserCmd cmd){
    UserDO userDO = UserAssembler.build4CreateCmd(cmd);
    userDAO.save(userDO);
    return findById(userDO.getId());
  }


  public User findByUsernameAndPassword(String userName, String password) {
    if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)) {
      return null;
    }
    return UserAssembler.toUser(userDAO.findByUserNameAndPassword(userName, password));
  }
}
